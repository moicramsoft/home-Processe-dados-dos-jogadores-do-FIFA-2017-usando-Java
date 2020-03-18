package challenge;
import challenge.model.Jogador;
import java.util.*;
import java.util.stream.Collectors;
public class Main {
	private static final String URL = "C:\\Users\\Administrador\\codenation\\java-3\\src\\main\\resources\\data.csv";
	private static final List<Jogador> jogadores = new JogadorConveter().convert(URL);
	// Quantas nacionalidades (coluna `nationality`) diferentes existem no arquivo?
	public int q1() {
		return this.jogadores.stream()
				.map(Jogador::getNationality).collect(Collectors.toSet()).size();
	}

	// Quantos clubes (coluna `club`) diferentes existem no arquivo?
	// Obs: Existem jogadores sem clube.
	public int q2() {
		return this.getJogadores().stream()
				.filter(jogador -> jogador.getClub().trim().length() > 0)
				.map(Jogador::getClub).collect(Collectors.toSet()).size();
	}

	// Liste o nome completo (coluna `full_name`) dos 20 primeiros jogadores.
	public List<String> q3() {
		final int limit = 20;
		return this.getJogadores().stream().map(Jogador::getFullName)
				.limit(limit).collect(Collectors.toList());
	}

	// Quem são os top 10 jogadores que possuem as maiores cláusulas de rescisão?
	// (utilize as colunas `full_name` e `eur_release_clause`)
	public List<String> q4() {
		final int limit = 10;
		return this.getJogadores().stream()
				.sorted(Comparator.comparingLong(Jogador::getEurReleaseClause).reversed())
				.limit(limit)
				.map(Jogador::getFullName)
				.collect(Collectors.toList());
	}

	// Quem são os 10 jogadores mais velhos (use como critério de desempate o campo `eur_wage`)?
	// (utilize as colunas `full_name` e `birth_date`)
	public List<String> q5() {
		final int limit = 10;
		return this.getJogadores().stream()
				.sorted(Comparator.comparing(Jogador::getBirthDate)
				.thenComparing(Jogador::getEurWage))
				.limit(limit)
				.map(Jogador::getFullName)
				.collect(Collectors.toList());
	}

	// Conte quantos jogadores existem por idade. Para isso, construa um mapa onde as chaves são as idades e os valores a contagem.
	// (utilize a coluna `age`)
	public Map<Integer, Integer> q6() {
		return getJogadores().stream()
				.collect(Collectors.groupingBy(Jogador::getAge, Collectors.counting()))
				.entrySet().stream().collect(Collectors.toMap(
						entry -> Integer.parseInt(entry.getKey().toString()),
						entry -> Integer.parseInt(entry.getValue().toString())
				));
	}

	public List<Jogador> getJogadores() {
		return jogadores;
	}
}