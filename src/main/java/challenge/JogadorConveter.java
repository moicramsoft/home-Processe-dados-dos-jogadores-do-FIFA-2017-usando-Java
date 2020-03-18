package challenge;

import challenge.annotations.Column;
import challenge.model.Jogador;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JogadorConveter extends Converter<Jogador> {

    private static final String DEFAULT_SEPARATOR = ";";

    @Override
    public List<Jogador> convert(String url) {
        return this.convert(url, DEFAULT_SEPARATOR);
    }

    public List<Jogador> convert(String url, String separator) {
        List<List<String>> jogadoresString = this.getRawData(url, separator);
        List<String> jogadoresHeaders = jogadoresString.get(0);
        jogadoresString.remove(0);

        return jogadoresString.stream()
                .map(jogadorStr -> convertLine(jogadorStr, jogadoresHeaders))
                .collect(Collectors.toList());
    }

    private Jogador convertLine(List<String> line, List<String> headers) {

        List<Method> methods =  Arrays.asList(Jogador.class.getDeclaredMethods())
                                        .stream()
                                        .filter(method -> method.getName().substring(0, 3)
                                        .equals("set"))
                                        .collect(Collectors.toList());

        Jogador jogador = new Jogador();

        for (int i = 0 ; i < headers.size(); i++) {
            final int index = i;
            try {
                Method method = methods.stream()
                       .filter(m -> m.getDeclaredAnnotation(Column.class)
                               .value().equals(headers.get(index)))
                        .findFirst().get();
                Parameter[] parameters = method.getParameters();
                if(parameters[0].getType().getName().equals("long")) {
                    method.invoke(jogador, convertStringToLong(line.get(index)));
                }else if (parameters[0].getType().getName().equals("java.time.LocalDate")) {
                    method.invoke(jogador, convertToDate(line.get(index)));
                }else {
                    method.invoke(jogador, line.get(index));
                }

            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            }
        }

        return jogador;
    }

    private long convertStringToLong(String value) {
        if(value.length() == 0)
            return 0L;
        if(value.contains(",") && value.contains("E") && value.contains("+")) {
            /*
                Os números com notação científica, aparentemente, estão com uma distorção de
                1 bilhão em relação aos demais.
             */
            value = value.split("E")[0] + "E+07";
            return new BigDecimal(value.replace(",", ".")).longValue();
        }
        return Long.parseLong(value);
    }

    private LocalDate convertToDate(String value) {
        if(value.length() == 0)
            return null;
        String values[] = value.split("/");
        return LocalDate.of(Integer.parseInt(values[2]),
                Integer.parseInt(values[1]),
                Integer.parseInt(values[0]));
    }
}