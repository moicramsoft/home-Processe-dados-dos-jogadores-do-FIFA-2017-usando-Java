package challenge.model;

import challenge.annotations.Column;

import java.time.LocalDate;
import java.util.Objects;

public class Jogador {
    private long id;
    private String name;
    private String fullName;
    private String club;
    private String clubLogo;
    private long special;
    private long age;
    private String league;
    private LocalDate birthDate;
    private long heightCM;
    private long weightKg;
    private String bodyType;
    private String realFace;
    private String flag;
    private String nationality;
    private String photo;
    private long eurValue;
    private long eurWage;
    private long eurReleaseClause;
    private long overall;
    private long potential;
    private long pac;
    private long sho;
    private long pas;
    private long dri;
    private long def;
    private long phy;
    private long internationalReputation;
    private long skillMoves;
    private long weakFoot;
    private String workRateAtt;
    private String workRateDef;
    private String preferredFoot;
    private long crossing;
    private long finishing;
    private long headingAccuracy;
    private long shortPassing;
    private long volleys;
    private long dribbling;
    private long curve;
    private long freeKickAccuracy;
    private long longPassing;
    private long ballControl;
    private long acceleration;
    private long sprintSpeed;
    private long agility;
    private long reactions;
    private long balance;
    private long shotPower;
    private long jumping;
    private long stamina;
    private long strength;
    private long longShots;
    private long aggression;
    private long interceptions;
    private long positioning;
    private long vision;
    private long penalties;
    private long composure;
    private long marking;
    private long standingTackle;
    private long slidingTackle;
    private long gkDiving;
    private long gkHandling;
    private long gkKicking;
    private long gkPositioning;
    private long gkReflexes;
    private long rs;
    private long rw;
    private long rf;
    private long ram;
    private long rcm;
    private long rm;
    private long rdm;
    private long rcb;
    private long rb;
    private long rwb;
    private long st;
    private long lw;
    private long cf;
    private long cam;
    private long cm;
    private long lm;
    private long cdm;
    private long cb;
    private long lb;
    private long lwb;
    private long ls;
    private long lf;
    private long lam;
    private long lcm;
    private long ldm;
    private long lcb;
    private String gk;
    private String the1_On1_RushTrait;
    private String acrobaticClearanceTrait;
    private String arguesWithOfficialsTrait;
    private String avoidsUsingWeakerFootTrait;
    private String backsIntoPlayerTrait;
    private String bicycleKicksTrait;
    private String cautiousWithCrossesTrait;
    private String chipShotTrait;
    private String chippedPenaltyTrait;
    private String comesForCrossesTrait;
    private String cornerSpecialistTrait;
    private String diverTrait;
    private String divesIntoTacklesTrait;
    private String divingHeaderTrait;
    private String drivenPassTrait;
    private String earlyCrosserTrait;
    private String fanSFavouriteTrait;
    private String fancyFlicksTrait;
    private String finesseShotTrait;
    private String flairTrait;
    private String flairPassesTrait;
    private String gkFlatKickTrait;
    private String gkLongThrowTrait;
    private String gkUpForCornersTrait;
    private String giantThrowInTrait;
    private String inflexibleTrait;
    private String injuryFreeTrait;
    private String injuryProneTrait;
    private String leadershipTrait;
    private String longPasserTrait;
    private String longShotTakerTrait;
    private String longThrowInTrait;
    private String oneClubPlayerTrait;
    private String outsideFootShotTrait;
    private String playmakerTrait;
    private String powerFreeKickTrait;
    private String powerHeaderTrait;
    private String puncherTrait;
    private String rushesOutOfGoalTrait;
    private String savesWithFeetTrait;
    private String secondWindTrait;
    private String selfishTrait;
    private String skilledDribblingTrait;
    private String stutterPenaltyTrait;
    private String swervePassTrait;
    private String takesFinesseFreeKicksTrait;
    private String targetForwardTrait;
    private String teamPlayerTrait;
    private String technicalDribblerTrait;
    private String triesToBeatDefensiveLineTrait;
    private String poacherSpeciality;
    private String speedsterSpeciality;
    private String aerialThreatSpeciality;
    private String dribblerSpeciality;
    private String playmakerSpeciality;
    private String engineSpeciality;
    private String distanceShooterSpeciality;
    private String crosserSpeciality;
    private String freeKickSpecialistSpeciality;
    private String tacklingSpeciality;
    private String tacticianSpeciality;
    private String acrobatSpeciality;
    private String strengthSpeciality;
    private String clinicalFinisherSpeciality;
    private String prefersRs;
    private String prefersRw;
    private String prefersRF;
    private String prefersRAM;
    private String prefersRcm;
    private String prefersRm;
    private String prefersRDM;
    private String prefersRcb;
    private String prefersRb;
    private String prefersRwb;
    private String prefersSt;
    private String prefersLw;
    private String prefersCF;
    private String prefersCam;
    private String prefersCM;
    private String prefersLM;
    private String prefersCdm;
    private String prefersCb;
    private String prefersLB;
    private String prefersLwb;
    private String prefersLs;
    private String prefersLF;
    private String prefersLam;
    private String prefersLcm;
    private String prefersLdm;
    private String prefersLcb;
    private String prefersGk;

    @Column("ID")
    public long getID() { return id; }
    @Column("ID")
    public void setID(long value) { this.id = value; }

    @Column("name")
    public String getName() { return name; }
    @Column("name")
    public void setName(String value) { this.name = value; }

    @Column("full_name")
    public String getFullName() { return fullName; }
    @Column("full_name")
    public void setFullName(String value) { this.fullName = value; }

    @Column("club")
    public String getClub() { return club; }
    @Column("club")
    public void setClub(String value) { this.club = value; }

    @Column("club_logo")
    public String getClubLogo() { return clubLogo; }
    @Column("club_logo")
    public void setClubLogo(String value) { this.clubLogo = value; }

    @Column("special")
    public long getSpecial() { return special; }
    @Column("special")
    public void setSpecial(long value) { this.special = value; }

    @Column("age")
    public long getAge() { return age; }
    @Column("age")
    public void setAge(long value) { this.age = value; }

    @Column("league")
    public String getLeague() { return league; }
    @Column("league")
    public void setLeague(String value) { this.league = value; }

    @Column("birth_date")
    public LocalDate getBirthDate() { return birthDate; }
    @Column("birth_date")
    public void setBirthDate(LocalDate value) { this.birthDate = value; }

    @Column("height_cm")
    public long getHeightCM() { return heightCM; }
    @Column("height_cm")
    public void setHeightCM(long value) { this.heightCM = value; }

    @Column("weight_kg")
    public long getWeightKg() { return weightKg; }
    @Column("weight_kg")
    public void setWeightKg(long value) { this.weightKg = value; }

    @Column("body_type")
    public String getBodyType() { return bodyType; }
    @Column("body_type")
    public void setBodyType(String value) { this.bodyType = value; }

    @Column("real_face")
    public String getRealFace() { return realFace; }
    @Column("real_face")
    public void setRealFace(String value) { this.realFace = value; }

    @Column("flag")
    public String getFlag() { return flag; }
    @Column("flag")
    public void setFlag(String value) { this.flag = value; }

    @Column("nationality")
    public String getNationality() { return nationality; }
    @Column("nationality")
    public void setNationality(String value) { this.nationality = value; }

    @Column("photo")
    public String getPhoto() { return photo; }
    @Column("photo")
    public void setPhoto(String value) { this.photo = value; }

    @Column("eur_value")
    public long getEurValue() { return eurValue; }
    @Column("eur_value")
    public void setEurValue(long value) { this.eurValue = value; }

    @Column("eur_wage")
    public long getEurWage() { return eurWage; }
    @Column("eur_wage")
    public void setEurWage(long value) { this.eurWage = value; }

    @Column("eur_release_clause")
    public long getEurReleaseClause() { return eurReleaseClause; }
    @Column("eur_release_clause")
    public void setEurReleaseClause(long value) { this.eurReleaseClause = value; }

    @Column("overall")
    public long getOverall() { return overall; }
    @Column("overall")
    public void setOverall(long value) { this.overall = value; }

    @Column("potential")
    public long getPotential() { return potential; }
    @Column("potential")
    public void setPotential(long value) { this.potential = value; }

    @Column("pac")
    public long getPac() { return pac; }
    @Column("pac")
    public void setPac(long value) { this.pac = value; }

    @Column("sho")
    public long getSho() { return sho; }
    @Column("sho")
    public void setSho(long value) { this.sho = value; }

    @Column("pas")
    public long getPas() { return pas; }
    @Column("pas")
    public void setPas(long value) { this.pas = value; }

    @Column("dri")
    public long getDRI() { return dri; }
    @Column("dri")
    public void setDRI(long value) { this.dri = value; }

    @Column("def")
    public long getDef() { return def; }
    @Column("def")
    public void setDef(long value) { this.def = value; }

    @Column("phy")
    public long getPhy() { return phy; }
    @Column("phy")
    public void setPhy(long value) { this.phy = value; }

    @Column("international_reputation")
    public long getInternationalReputation() { return internationalReputation; }
    @Column("international_reputation")
    public void setInternationalReputation(long value) { this.internationalReputation = value; }

    @Column("skill_moves")
    public long getSkillMoves() { return skillMoves; }
    @Column("skill_moves")
    public void setSkillMoves(long value) { this.skillMoves = value; }

    @Column("weak_foot")
    public long getWeakFoot() { return weakFoot; }
    @Column("weak_foot")
    public void setWeakFoot(long value) { this.weakFoot = value; }

    @Column("work_rate_att")
    public String getWorkRateAtt() { return workRateAtt; }
    @Column("work_rate_att")
    public void setWorkRateAtt(String value) { this.workRateAtt = value; }

    @Column("work_rate_def")
    public String getWorkRateDef() { return workRateDef; }
    @Column("work_rate_def")
    public void setWorkRateDef(String value) { this.workRateDef = value; }

    @Column("preferred_foot")
    public String getPreferredFoot() { return preferredFoot; }
    @Column("preferred_foot")
    public void setPreferredFoot(String value) { this.preferredFoot = value; }

    @Column("crossing")
    public long getCrossing() { return crossing; }
    @Column("crossing")
    public void setCrossing(long value) { this.crossing = value; }

    @Column("finishing")
    public long getFinishing() { return finishing; }
    @Column("finishing")
    public void setFinishing(long value) { this.finishing = value; }

    @Column("heading_accuracy")
    public long getHeadingAccuracy() { return headingAccuracy; }
    @Column("heading_accuracy")
    public void setHeadingAccuracy(long value) { this.headingAccuracy = value; }

    @Column("short_passing")
    public long getShortPassing() { return shortPassing; }
    @Column("short_passing")
    public void setShortPassing(long value) { this.shortPassing = value; }

    @Column("volleys")
    public long getVolleys() { return volleys; }
    @Column("volleys")
    public void setVolleys(long value) { this.volleys = value; }

    @Column("dribbling")
    public long getDribbling() { return dribbling; }
    @Column("dribbling")
    public void setDribbling(long value) { this.dribbling = value; }

    @Column("curve")
    public long getCurve() { return curve; }
    @Column("curve")
    public void setCurve(long value) { this.curve = value; }

    @Column("free_kick_accuracy")
    public long getFreeKickAccuracy() { return freeKickAccuracy; }
    @Column("free_kick_accuracy")
    public void setFreeKickAccuracy(long value) { this.freeKickAccuracy = value; }

    @Column("long_passing")
    public long getLongPassing() { return longPassing; }
    @Column("long_passing")
    public void setLongPassing(long value) { this.longPassing = value; }

    @Column("ball_control")
    public long getBallControl() { return ballControl; }
    @Column("ball_control")
    public void setBallControl(long value) { this.ballControl = value; }

    @Column("acceleration")
    public long getAcceleration() { return acceleration; }
    @Column("acceleration")
    public void setAcceleration(long value) { this.acceleration = value; }

    @Column("sprint_speed")
    public long getSprintSpeed() { return sprintSpeed; }
    @Column("sprint_speed")
    public void setSprintSpeed(long value) { this.sprintSpeed = value; }

    @Column("agility")
    public long getAgility() { return agility; }
    @Column("agility")
    public void setAgility(long value) { this.agility = value; }

    @Column("reactions")
    public long getReactions() { return reactions; }
    @Column("reactions")
    public void setReactions(long value) { this.reactions = value; }

    @Column("balance")
    public long getBalance() { return balance; }
    @Column("balance")
    public void setBalance(long value) { this.balance = value; }

    @Column("shot_power")
    public long getShotPower() { return shotPower; }
    @Column("shot_power")
    public void setShotPower(long value) { this.shotPower = value; }

    @Column("jumping")
    public long getJumping() { return jumping; }
    @Column("jumping")
    public void setJumping(long value) { this.jumping = value; }

    @Column("stamina")
    public long getStamina() { return stamina; }
    @Column("stamina")
    public void setStamina(long value) { this.stamina = value; }

    @Column("strength")
    public long getStrength() { return strength; }
    @Column("strength")
    public void setStrength(long value) { this.strength = value; }

    @Column("long_shots")
    public long getLongShots() { return longShots; }
    @Column("long_shots")
    public void setLongShots(long value) { this.longShots = value; }

    @Column("aggression")
    public long getAggression() { return aggression; }
    @Column("aggression")
    public void setAggression(long value) { this.aggression = value; }

    @Column("interceptions")
    public long getInterceptions() { return interceptions; }
    @Column("interceptions")
    public void setInterceptions(long value) { this.interceptions = value; }

    @Column("positioning")
    public long getPositioning() { return positioning; }
    @Column("positioning")
    public void setPositioning(long value) { this.positioning = value; }

    @Column("vision")
    public long getVision() { return vision; }
    @Column("vision")
    public void setVision(long value) { this.vision = value; }

    @Column("penalties")
    public long getPenalties() { return penalties; }
    @Column("penalties")
    public void setPenalties(long value) { this.penalties = value; }

    @Column("composure")
    public long getComposure() { return composure; }
    @Column("composure")
    public void setComposure(long value) { this.composure = value; }

    @Column("marking")
    public long getMarking() { return marking; }
    @Column("marking")
    public void setMarking(long value) { this.marking = value; }

    @Column("standing_tackle")
    public long getStandingTackle() { return standingTackle; }
    @Column("standing_tackle")
    public void setStandingTackle(long value) { this.standingTackle = value; }

    @Column("sliding_tackle")
    public long getSlidingTackle() { return slidingTackle; }
    @Column("sliding_tackle")
    public void setSlidingTackle(long value) { this.slidingTackle = value; }

    @Column("gk_diving")
    public long getGkDiving() { return gkDiving; }
    @Column("gk_diving")
    public void setGkDiving(long value) { this.gkDiving = value; }

    @Column("gk_handling")
    public long getGkHandling() { return gkHandling; }
    @Column("gk_handling")
    public void setGkHandling(long value) { this.gkHandling = value; }

    @Column("gk_kicking")
    public long getGkKicking() { return gkKicking; }
    @Column("gk_kicking")
    public void setGkKicking(long value) { this.gkKicking = value; }

    @Column("gk_positioning")
    public long getGkPositioning() { return gkPositioning; }
    @Column("gk_positioning")
    public void setGkPositioning(long value) { this.gkPositioning = value; }

    @Column("gk_reflexes")
    public long getGkReflexes() { return gkReflexes; }
    @Column("gk_reflexes")
    public void setGkReflexes(long value) { this.gkReflexes = value; }

    @Column("rs")
    public long getRs() { return rs; }
    @Column("rs")
    public void setRs(long value) { this.rs = value; }

    @Column("rw")
    public long getRw() { return rw; }
    @Column("rw")
    public void setRw(long value) { this.rw = value; }

    @Column("rf")
    public long getRF() { return rf; }
    @Column("rf")
    public void setRF(long value) { this.rf = value; }

    @Column("ram")
    public long getRAM() { return ram; }
    @Column("ram")
    public void setRAM(long value) { this.ram = value; }

    @Column("rcm")
    public long getRcm() { return rcm; }
    @Column("rcm")
    public void setRcm(long value) { this.rcm = value; }

    @Column("rm")
    public long getRm() { return rm; }
    @Column("rm")
    public void setRm(long value) { this.rm = value; }

    @Column("rdm")
    public long getRDM() { return rdm; }
    @Column("rdm")
    public void setRDM(long value) { this.rdm = value; }

    @Column("rcb")
    public long getRcb() { return rcb; }
    @Column("rcb")
    public void setRcb(long value) { this.rcb = value; }

    @Column("rb")
    public long getRb() { return rb; }
    @Column("rb")
    public void setRb(long value) { this.rb = value; }

    @Column("rwb")
    public long getRwb() { return rwb; }
    @Column("rwb")
    public void setRwb(long value) { this.rwb = value; }

    @Column("st")
    public long getSt() { return st; }
    @Column("st")
    public void setSt(long value) { this.st = value; }

    @Column("lw")
    public long getLw() { return lw; }
    @Column("lw")
    public void setLw(long value) { this.lw = value; }

    @Column("cf")
    public long getCF() { return cf; }
    @Column("cf")
    public void setCF(long value) { this.cf = value; }

    @Column("cam")
    public long getCam() { return cam; }
    @Column("cam")
    public void setCam(long value) { this.cam = value; }

    @Column("cm")
    public long getCM() { return cm; }
    @Column("cm")
    public void setCM(long value) { this.cm = value; }

    @Column("lm")
    public long getLM() { return lm; }
    @Column("lm")
    public void setLM(long value) { this.lm = value; }

    @Column("cdm")
    public long getCdm() { return cdm; }
    @Column("cdm")
    public void setCdm(long value) { this.cdm = value; }

    @Column("cb")
    public long getCb() { return cb; }
    @Column("cb")
    public void setCb(long value) { this.cb = value; }

    @Column("lb")
    public long getLB() { return lb; }
    @Column("lb")
    public void setLB(long value) { this.lb = value; }

    @Column("lwb")
    public long getLwb() { return lwb; }
    @Column("lwb")
    public void setLwb(long value) { this.lwb = value; }

    @Column("ls")
    public long getLs() { return ls; }
    @Column("ls")
    public void setLs(long value) { this.ls = value; }

    @Column("lf")
    public long getLF() { return lf; }
    @Column("lf")
    public void setLF(long value) { this.lf = value; }

    @Column("lam")
    public long getLam() { return lam; }
    @Column("lam")
    public void setLam(long value) { this.lam = value; }

    @Column("lcm")
    public long getLcm() { return lcm; }
    @Column("lcm")
    public void setLcm(long value) { this.lcm = value; }

    @Column("ldm")
    public long getLdm() { return ldm; }
    @Column("ldm")
    public void setLdm(long value) { this.ldm = value; }

    @Column("lcb")
    public long getLcb() { return lcb; }
    @Column("lcb")
    public void setLcb(long value) { this.lcb = value; }

    @Column("gk")
    public String getGk() { return gk; }
    @Column("gk")
    public void setGk(String value) { this.gk = value; }

    @Column("1_on_1_rush_trait")
    public String getThe1On1RushTrait() { return the1_On1_RushTrait; }
    @Column("1_on_1_rush_trait")
    public void setThe1On1RushTrait(String value) { this.the1_On1_RushTrait = value; }

    @Column("acrobatic_clearance_trait")
    public String getAcrobaticClearanceTrait() { return acrobaticClearanceTrait; }
    @Column("acrobatic_clearance_trait")
    public void setAcrobaticClearanceTrait(String value) { this.acrobaticClearanceTrait = value; }

    @Column("argues_with_officials_trait")
    public String getArguesWithOfficialsTrait() { return arguesWithOfficialsTrait; }
    @Column("argues_with_officials_trait")
    public void setArguesWithOfficialsTrait(String value) { this.arguesWithOfficialsTrait = value; }

    @Column("avoids_using_weaker_foot_trait")
    public String getAvoidsUsingWeakerFootTrait() { return avoidsUsingWeakerFootTrait; }
    @Column("avoids_using_weaker_foot_trait")
    public void setAvoidsUsingWeakerFootTrait(String value) { this.avoidsUsingWeakerFootTrait = value; }

    @Column("backs_into_player_trait")
    public String getBacksIntoPlayerTrait() { return backsIntoPlayerTrait; }
    @Column("backs_into_player_trait")
    public void setBacksIntoPlayerTrait(String value) { this.backsIntoPlayerTrait = value; }

    @Column("bicycle_kicks_trait")
    public String getBicycleKicksTrait() { return bicycleKicksTrait; }
    @Column("bicycle_kicks_trait")
    public void setBicycleKicksTrait(String value) { this.bicycleKicksTrait = value; }

    @Column("cautious_with_crosses_trait")
    public String getCautiousWithCrossesTrait() { return cautiousWithCrossesTrait; }
    @Column("cautious_with_crosses_trait")
    public void setCautiousWithCrossesTrait(String value) { this.cautiousWithCrossesTrait = value; }

    @Column("chip_shot_trait")
    public String getChipShotTrait() { return chipShotTrait; }
    @Column("chip_shot_trait")
    public void setChipShotTrait(String value) { this.chipShotTrait = value; }

    @Column("chipped_penalty_trait")
    public String getChippedPenaltyTrait() { return chippedPenaltyTrait; }
    @Column("chipped_penalty_trait")
    public void setChippedPenaltyTrait(String value) { this.chippedPenaltyTrait = value; }

    @Column("comes_for_crosses_trait")
    public String getComesForCrossesTrait() { return comesForCrossesTrait; }
    @Column("comes_for_crosses_trait")
    public void setComesForCrossesTrait(String value) { this.comesForCrossesTrait = value; }

    @Column("corner_specialist_trait")
    public String getCornerSpecialistTrait() { return cornerSpecialistTrait; }
    @Column("corner_specialist_trait")
    public void setCornerSpecialistTrait(String value) { this.cornerSpecialistTrait = value; }

    @Column("diver_trait")
    public String getDiverTrait() { return diverTrait; }
    @Column("diver_trait")
    public void setDiverTrait(String value) { this.diverTrait = value; }

    @Column("dives_into_tackles_trait")
    public String getDivesIntoTacklesTrait() { return divesIntoTacklesTrait; }
    @Column("dives_into_tackles_trait")
    public void setDivesIntoTacklesTrait(String value) { this.divesIntoTacklesTrait = value; }

    @Column("diving_header_trait")
    public String getDivingHeaderTrait() { return divingHeaderTrait; }
    @Column("diving_header_trait")
    public void setDivingHeaderTrait(String value) { this.divingHeaderTrait = value; }

    @Column("driven_pass_trait")
    public String getDrivenPassTrait() { return drivenPassTrait; }
    @Column("driven_pass_trait")
    public void setDrivenPassTrait(String value) { this.drivenPassTrait = value; }

    @Column("early_crosser_trait")
    public String getEarlyCrosserTrait() { return earlyCrosserTrait; }
    @Column("early_crosser_trait")
    public void setEarlyCrosserTrait(String value) { this.earlyCrosserTrait = value; }

    @Column("fan's_favourite_trait")
    public String getFanSFavouriteTrait() { return fanSFavouriteTrait; }
    @Column("fan's_favourite_trait")
    public void setFanSFavouriteTrait(String value) { this.fanSFavouriteTrait = value; }

    @Column("fancy_flicks_trait")
    public String getFancyFlicksTrait() { return fancyFlicksTrait; }
    @Column("fancy_flicks_trait")
    public void setFancyFlicksTrait(String value) { this.fancyFlicksTrait = value; }

    @Column("finesse_shot_trait")
    public String getFinesseShotTrait() { return finesseShotTrait; }
    @Column("finesse_shot_trait")
    public void setFinesseShotTrait(String value) { this.finesseShotTrait = value; }

    @Column("flair_trait")
    public String getFlairTrait() { return flairTrait; }
    @Column("flair_trait")
    public void setFlairTrait(String value) { this.flairTrait = value; }

    @Column("flair_passes_trait")
    public String getFlairPassesTrait() { return flairPassesTrait; }
    @Column("flair_passes_trait")
    public void setFlairPassesTrait(String value) { this.flairPassesTrait = value; }

    @Column("gk_flat_kick_trait")
    public String getGkFlatKickTrait() { return gkFlatKickTrait; }
    @Column("gk_flat_kick_trait")
    public void setGkFlatKickTrait(String value) { this.gkFlatKickTrait = value; }

    @Column("gk_long_throw_trait")
    public String getGkLongThrowTrait() { return gkLongThrowTrait; }
    @Column("gk_long_throw_trait")
    public void setGkLongThrowTrait(String value) { this.gkLongThrowTrait = value; }

    @Column("gk_up_for_corners_trait")
    public String getGkUpForCornersTrait() { return gkUpForCornersTrait; }
    @Column("gk_up_for_corners_trait")
    public void setGkUpForCornersTrait(String value) { this.gkUpForCornersTrait = value; }

    @Column("giant_throw_in_trait")
    public String getGiantThrowInTrait() { return giantThrowInTrait; }
    @Column("giant_throw_in_trait")
    public void setGiantThrowInTrait(String value) { this.giantThrowInTrait = value; }

    @Column("inflexible_trait")
    public String getInflexibleTrait() { return inflexibleTrait; }
    @Column("inflexible_trait")
    public void setInflexibleTrait(String value) { this.inflexibleTrait = value; }

    @Column("injury_free_trait")
    public String getInjuryFreeTrait() { return injuryFreeTrait; }
    @Column("injury_free_trait")
    public void setInjuryFreeTrait(String value) { this.injuryFreeTrait = value; }

    @Column("injury_prone_trait")
    public String getInjuryProneTrait() { return injuryProneTrait; }
    @Column("injury_prone_trait")
    public void setInjuryProneTrait(String value) { this.injuryProneTrait = value; }

    @Column("leadership_trait")
    public String getLeadershipTrait() { return leadershipTrait; }
    @Column("leadership_trait")
    public void setLeadershipTrait(String value) { this.leadershipTrait = value; }

    @Column("long_passer_trait")
    public String getLongPasserTrait() { return longPasserTrait; }
    @Column("long_passer_trait")
    public void setLongPasserTrait(String value) { this.longPasserTrait = value; }

    @Column("long_shot_taker_trait")
    public String getLongShotTakerTrait() { return longShotTakerTrait; }
    @Column("long_shot_taker_trait")
    public void setLongShotTakerTrait(String value) { this.longShotTakerTrait = value; }

    @Column("long_throw_in_trait")
    public String getLongThrowInTrait() { return longThrowInTrait; }
    @Column("long_throw_in_trait")
    public void setLongThrowInTrait(String value) { this.longThrowInTrait = value; }

    @Column("one_club_player_trait")
    public String getOneClubPlayerTrait() { return oneClubPlayerTrait; }
    @Column("one_club_player_trait")
    public void setOneClubPlayerTrait(String value) { this.oneClubPlayerTrait = value; }

    @Column("outside_foot_shot_trait")
    public String getOutsideFootShotTrait() { return outsideFootShotTrait; }
    @Column("outside_foot_shot_trait")
    public void setOutsideFootShotTrait(String value) { this.outsideFootShotTrait = value; }

    @Column("playmaker_trait")
    public String getPlaymakerTrait() { return playmakerTrait; }
    @Column("playmaker_trait")
    public void setPlaymakerTrait(String value) { this.playmakerTrait = value; }

    @Column("power_free_kick_trait")
    public String getPowerFreeKickTrait() { return powerFreeKickTrait; }
    @Column("power_free_kick_trait")
    public void setPowerFreeKickTrait(String value) { this.powerFreeKickTrait = value; }

    @Column("power_header_trait")
    public String getPowerHeaderTrait() { return powerHeaderTrait; }
    @Column("power_header_trait")
    public void setPowerHeaderTrait(String value) { this.powerHeaderTrait = value; }

    @Column("puncher_trait")
    public String getPuncherTrait() { return puncherTrait; }
    @Column("puncher_trait")
    public void setPuncherTrait(String value) { this.puncherTrait = value; }

    @Column("rushes_out_of_goal_trait")
    public String getRushesOutOfGoalTrait() { return rushesOutOfGoalTrait; }
    @Column("rushes_out_of_goal_trait")
    public void setRushesOutOfGoalTrait(String value) { this.rushesOutOfGoalTrait = value; }

    @Column("saves_with_feet_trait")
    public String getSavesWithFeetTrait() { return savesWithFeetTrait; }
    @Column("saves_with_feet_trait")
    public void setSavesWithFeetTrait(String value) { this.savesWithFeetTrait = value; }

    @Column("second_wind_trait")
    public String getSecondWindTrait() { return secondWindTrait; }
    @Column("second_wind_trait")
    public void setSecondWindTrait(String value) { this.secondWindTrait = value; }

    @Column("selfish_trait")
    public String getSelfishTrait() { return selfishTrait; }
    @Column("selfish_trait")
    public void setSelfishTrait(String value) { this.selfishTrait = value; }

    @Column("skilled_dribbling_trait")
    public String getSkilledDribblingTrait() { return skilledDribblingTrait; }
    @Column("skilled_dribbling_trait")
    public void setSkilledDribblingTrait(String value) { this.skilledDribblingTrait = value; }

    @Column("stutter_penalty_trait")
    public String getStutterPenaltyTrait() { return stutterPenaltyTrait; }
    @Column("stutter_penalty_trait")
    public void setStutterPenaltyTrait(String value) { this.stutterPenaltyTrait = value; }

    @Column("swerve_pass_trait")
    public String getSwervePassTrait() { return swervePassTrait; }
    @Column("swerve_pass_trait")
    public void setSwervePassTrait(String value) { this.swervePassTrait = value; }

    @Column("takes_finesse_free_kicks_trait")
    public String getTakesFinesseFreeKicksTrait() { return takesFinesseFreeKicksTrait; }
    @Column("takes_finesse_free_kicks_trait")
    public void setTakesFinesseFreeKicksTrait(String value) { this.takesFinesseFreeKicksTrait = value; }

    @Column("target_forward_trait")
    public String getTargetForwardTrait() { return targetForwardTrait; }
    @Column("target_forward_trait")
    public void setTargetForwardTrait(String value) { this.targetForwardTrait = value; }

    @Column("team_player_trait")
    public String getTeamPlayerTrait() { return teamPlayerTrait; }
    @Column("team_player_trait")
    public void setTeamPlayerTrait(String value) { this.teamPlayerTrait = value; }

    @Column("technical_dribbler_trait")
    public String getTechnicalDribblerTrait() { return technicalDribblerTrait; }
    @Column("technical_dribbler_trait")
    public void setTechnicalDribblerTrait(String value) { this.technicalDribblerTrait = value; }

    @Column("tries_to_beat_defensive_line_trait")
    public String getTriesToBeatDefensiveLineTrait() { return triesToBeatDefensiveLineTrait; }
    @Column("tries_to_beat_defensive_line_trait")
    public void setTriesToBeatDefensiveLineTrait(String value) { this.triesToBeatDefensiveLineTrait = value; }

    @Column("poacher_speciality")
    public String getPoacherSpeciality() { return poacherSpeciality; }
    @Column("poacher_speciality")
    public void setPoacherSpeciality(String value) { this.poacherSpeciality = value; }

    @Column("speedster_speciality")
    public String getSpeedsterSpeciality() { return speedsterSpeciality; }
    @Column("speedster_speciality")
    public void setSpeedsterSpeciality(String value) { this.speedsterSpeciality = value; }

    @Column("aerial_threat_speciality")
    public String getAerialThreatSpeciality() { return aerialThreatSpeciality; }
    @Column("aerial_threat_speciality")
    public void setAerialThreatSpeciality(String value) { this.aerialThreatSpeciality = value; }

    @Column("dribbler_speciality")
    public String getDribblerSpeciality() { return dribblerSpeciality; }
    @Column("dribbler_speciality")
    public void setDribblerSpeciality(String value) { this.dribblerSpeciality = value; }

    @Column("playmaker_speciality")
    public String getPlaymakerSpeciality() { return playmakerSpeciality; }
    @Column("playmaker_speciality")
    public void setPlaymakerSpeciality(String value) { this.playmakerSpeciality = value; }

    @Column("engine_speciality")
    public String getEngineSpeciality() { return engineSpeciality; }
    @Column("engine_speciality")
    public void setEngineSpeciality(String value) { this.engineSpeciality = value; }

    @Column("distance_shooter_speciality")
    public String getDistanceShooterSpeciality() { return distanceShooterSpeciality; }
    @Column("distance_shooter_speciality")
    public void setDistanceShooterSpeciality(String value) { this.distanceShooterSpeciality = value; }

    @Column("crosser_speciality")
    public String getCrosserSpeciality() { return crosserSpeciality; }
    @Column("crosser_speciality")
    public void setCrosserSpeciality(String value) { this.crosserSpeciality = value; }

    @Column("free_kick_specialist_speciality")
    public String getFreeKickSpecialistSpeciality() { return freeKickSpecialistSpeciality; }
    @Column("free_kick_specialist_speciality")
    public void setFreeKickSpecialistSpeciality(String value) { this.freeKickSpecialistSpeciality = value; }

    @Column("tackling_speciality")
    public String getTacklingSpeciality() { return tacklingSpeciality; }
    @Column("tackling_speciality")
    public void setTacklingSpeciality(String value) { this.tacklingSpeciality = value; }

    @Column("tactician_speciality")
    public String getTacticianSpeciality() { return tacticianSpeciality; }
    @Column("tactician_speciality")
    public void setTacticianSpeciality(String value) { this.tacticianSpeciality = value; }

    @Column("acrobat_speciality")
    public String getAcrobatSpeciality() { return acrobatSpeciality; }
    @Column("acrobat_speciality")
    public void setAcrobatSpeciality(String value) { this.acrobatSpeciality = value; }

    @Column("strength_speciality")
    public String getStrengthSpeciality() { return strengthSpeciality; }
    @Column("strength_speciality")
    public void setStrengthSpeciality(String value) { this.strengthSpeciality = value; }

    @Column("clinical_finisher_speciality")
    public String getClinicalFinisherSpeciality() { return clinicalFinisherSpeciality; }
    @Column("clinical_finisher_speciality")
    public void setClinicalFinisherSpeciality(String value) { this.clinicalFinisherSpeciality = value; }

    @Column("prefers_rs")
    public String getPrefersRs() { return prefersRs; }
    @Column("prefers_rs")
    public void setPrefersRs(String value) { this.prefersRs = value; }

    @Column("prefers_rw")
    public String getPrefersRw() { return prefersRw; }
    @Column("prefers_rw")
    public void setPrefersRw(String value) { this.prefersRw = value; }

    @Column("prefers_rf")
    public String getPrefersRF() { return prefersRF; }
    @Column("prefers_rf")
    public void setPrefersRF(String value) { this.prefersRF = value; }

    @Column("prefers_ram")
    public String getPrefersRAM() { return prefersRAM; }
    @Column("prefers_ram")
    public void setPrefersRAM(String value) { this.prefersRAM = value; }

    @Column("prefers_rcm")
    public String getPrefersRcm() { return prefersRcm; }
    @Column("prefers_rcm")
    public void setPrefersRcm(String value) { this.prefersRcm = value; }

    @Column("prefers_rm")
    public String getPrefersRm() { return prefersRm; }
    @Column("prefers_rm")
    public void setPrefersRm(String value) { this.prefersRm = value; }

    @Column("prefers_rdm")
    public String getPrefersRDM() { return prefersRDM; }
    @Column("prefers_rdm")
    public void setPrefersRDM(String value) { this.prefersRDM = value; }

    @Column("prefers_rcb")
    public String getPrefersRcb() { return prefersRcb; }
    @Column("prefers_rcb")
    public void setPrefersRcb(String value) { this.prefersRcb = value; }

    @Column("prefers_rb")
    public String getPrefersRb() { return prefersRb; }
    @Column("prefers_rb")
    public void setPrefersRb(String value) { this.prefersRb = value; }

    @Column("prefers_rwb")
    public String getPrefersRwb() { return prefersRwb; }
    @Column("prefers_rwb")
    public void setPrefersRwb(String value) { this.prefersRwb = value; }

    @Column("prefers_st")
    public String getPrefersSt() { return prefersSt; }
    @Column("prefers_st")
    public void setPrefersSt(String value) { this.prefersSt = value; }

    @Column("prefers_lw")
    public String getPrefersLw() { return prefersLw; }
    @Column("prefers_lw")
    public void setPrefersLw(String value) { this.prefersLw = value; }

    @Column("prefers_cf")
    public String getPrefersCF() { return prefersCF; }
    @Column("prefers_cf")
    public void setPrefersCF(String value) { this.prefersCF = value; }

    @Column("prefers_cam")
    public String getPrefersCam() { return prefersCam; }
    @Column("prefers_cam")
    public void setPrefersCam(String value) { this.prefersCam = value; }

    @Column("prefers_cm")
    public String getPrefersCM() { return prefersCM; }
    @Column("prefers_cm")
    public void setPrefersCM(String value) { this.prefersCM = value; }

    @Column("prefers_lm")
    public String getPrefersLM() { return prefersLM; }
    @Column("prefers_lm")
    public void setPrefersLM(String value) { this.prefersLM = value; }

    @Column("prefers_cdm")
    public String getPrefersCdm() { return prefersCdm; }
    @Column("prefers_cdm")
    public void setPrefersCdm(String value) { this.prefersCdm = value; }

    @Column("prefers_cb")
    public String getPrefersCb() { return prefersCb; }
    @Column("prefers_cb")
    public void setPrefersCb(String value) { this.prefersCb = value; }

    @Column("prefers_lb")
    public String getPrefersLB() { return prefersLB; }
    @Column("prefers_lb")
    public void setPrefersLB(String value) { this.prefersLB = value; }

    @Column("prefers_lwb")
    public String getPrefersLwb() { return prefersLwb; }
    @Column("prefers_lwb")
    public void setPrefersLwb(String value) { this.prefersLwb = value; }

    @Column("prefers_ls")
    public String getPrefersLs() { return prefersLs; }
    @Column("prefers_ls")
    public void setPrefersLs(String value) { this.prefersLs = value; }

    @Column("prefers_lf")
    public String getPrefersLF() { return prefersLF; }
    @Column("prefers_lf")
    public void setPrefersLF(String value) { this.prefersLF = value; }

    @Column("prefers_lam")
    public String getPrefersLam() { return prefersLam; }
    @Column("prefers_lam")
    public void setPrefersLam(String value) { this.prefersLam = value; }

    @Column("prefers_lcm")
    public String getPrefersLcm() { return prefersLcm; }
    @Column("prefers_lcm")
    public void setPrefersLcm(String value) { this.prefersLcm = value; }

    @Column("prefers_ldm")
    public String getPrefersLdm() { return prefersLdm; }
    @Column("prefers_ldm")
    public void setPrefersLdm(String value) { this.prefersLdm = value; }

    @Column("prefers_lcb")
    public String getPrefersLcb() { return prefersLcb; }
    @Column("prefers_lcb")
    public void setPrefersLcb(String value) { this.prefersLcb = value; }

    @Column("prefers_gk")
    public String getPrefersGk() { return prefersGk; }
    @Column("prefers_gk")
    public void setPrefersGk(String value) { this.prefersGk = value; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Jogador jogador = (Jogador) o;
        return id == jogador.id &&
                name.equals(jogador.name) &&
                Objects.equals(fullName, jogador.fullName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, fullName);
    }

    @Override
    public String toString() {
        return "Jogador{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", fullName='" + fullName + '\'' +
                ", club='" + club + '\'' +
                ", clubLogo='" + clubLogo + '\'' +
                ", special=" + special +
                ", age=" + age +
                ", league='" + league + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", heightCM=" + heightCM +
                ", weightKg=" + weightKg +
                ", bodyType='" + bodyType + '\'' +
                ", realFace='" + realFace + '\'' +
                ", flag='" + flag + '\'' +
                ", nationality='" + nationality + '\'' +
                ", photo='" + photo + '\'' +
                ", eurValue=" + eurValue +
                ", eurWage=" + eurWage +
                ", eurReleaseClause=" + eurReleaseClause +
                ", overall=" + overall +
                ", potential=" + potential +
                ", pac=" + pac +
                ", sho=" + sho +
                ", pas=" + pas +
                ", dri=" + dri +
                ", def=" + def +
                ", phy=" + phy +
                ", internationalReputation=" + internationalReputation +
                ", skillMoves=" + skillMoves +
                ", weakFoot=" + weakFoot +
                ", workRateAtt='" + workRateAtt + '\'' +
                ", workRateDef='" + workRateDef + '\'' +
                ", preferredFoot='" + preferredFoot + '\'' +
                ", crossing=" + crossing +
                ", finishing=" + finishing +
                ", headingAccuracy=" + headingAccuracy +
                ", shortPassing=" + shortPassing +
                ", volleys=" + volleys +
                ", dribbling=" + dribbling +
                ", curve=" + curve +
                ", freeKickAccuracy=" + freeKickAccuracy +
                ", longPassing=" + longPassing +
                ", ballControl=" + ballControl +
                ", acceleration=" + acceleration +
                ", sprintSpeed=" + sprintSpeed +
                ", agility=" + agility +
                ", reactions=" + reactions +
                ", balance=" + balance +
                ", shotPower=" + shotPower +
                ", jumping=" + jumping +
                ", stamina=" + stamina +
                ", strength=" + strength +
                ", longShots=" + longShots +
                ", aggression=" + aggression +
                ", interceptions=" + interceptions +
                ", positioning=" + positioning +
                ", vision=" + vision +
                ", penalties=" + penalties +
                ", composure=" + composure +
                ", marking=" + marking +
                ", standingTackle=" + standingTackle +
                ", slidingTackle=" + slidingTackle +
                ", gkDiving=" + gkDiving +
                ", gkHandling=" + gkHandling +
                ", gkKicking=" + gkKicking +
                ", gkPositioning=" + gkPositioning +
                ", gkReflexes=" + gkReflexes +
                ", rs=" + rs +
                ", rw=" + rw +
                ", rf=" + rf +
                ", ram=" + ram +
                ", rcm=" + rcm +
                ", rm=" + rm +
                ", rdm=" + rdm +
                ", rcb=" + rcb +
                ", rb=" + rb +
                ", rwb=" + rwb +
                ", st=" + st +
                ", lw=" + lw +
                ", cf=" + cf +
                ", cam=" + cam +
                ", cm=" + cm +
                ", lm=" + lm +
                ", cdm=" + cdm +
                ", cb=" + cb +
                ", lb=" + lb +
                ", lwb=" + lwb +
                ", ls=" + ls +
                ", lf=" + lf +
                ", lam=" + lam +
                ", lcm=" + lcm +
                ", ldm=" + ldm +
                ", lcb=" + lcb +
                ", gk='" + gk + '\'' +
                ", the1_On1_RushTrait='" + the1_On1_RushTrait + '\'' +
                ", acrobaticClearanceTrait='" + acrobaticClearanceTrait + '\'' +
                ", arguesWithOfficialsTrait='" + arguesWithOfficialsTrait + '\'' +
                ", avoidsUsingWeakerFootTrait='" + avoidsUsingWeakerFootTrait + '\'' +
                ", backsIntoPlayerTrait='" + backsIntoPlayerTrait + '\'' +
                ", bicycleKicksTrait='" + bicycleKicksTrait + '\'' +
                ", cautiousWithCrossesTrait='" + cautiousWithCrossesTrait + '\'' +
                ", chipShotTrait='" + chipShotTrait + '\'' +
                ", chippedPenaltyTrait='" + chippedPenaltyTrait + '\'' +
                ", comesForCrossesTrait='" + comesForCrossesTrait + '\'' +
                ", cornerSpecialistTrait='" + cornerSpecialistTrait + '\'' +
                ", diverTrait='" + diverTrait + '\'' +
                ", divesIntoTacklesTrait='" + divesIntoTacklesTrait + '\'' +
                ", divingHeaderTrait='" + divingHeaderTrait + '\'' +
                ", drivenPassTrait='" + drivenPassTrait + '\'' +
                ", earlyCrosserTrait='" + earlyCrosserTrait + '\'' +
                ", fanSFavouriteTrait='" + fanSFavouriteTrait + '\'' +
                ", fancyFlicksTrait='" + fancyFlicksTrait + '\'' +
                ", finesseShotTrait='" + finesseShotTrait + '\'' +
                ", flairTrait='" + flairTrait + '\'' +
                ", flairPassesTrait='" + flairPassesTrait + '\'' +
                ", gkFlatKickTrait='" + gkFlatKickTrait + '\'' +
                ", gkLongThrowTrait='" + gkLongThrowTrait + '\'' +
                ", gkUpForCornersTrait='" + gkUpForCornersTrait + '\'' +
                ", giantThrowInTrait='" + giantThrowInTrait + '\'' +
                ", inflexibleTrait='" + inflexibleTrait + '\'' +
                ", injuryFreeTrait='" + injuryFreeTrait + '\'' +
                ", injuryProneTrait='" + injuryProneTrait + '\'' +
                ", leadershipTrait='" + leadershipTrait + '\'' +
                ", longPasserTrait='" + longPasserTrait + '\'' +
                ", longShotTakerTrait='" + longShotTakerTrait + '\'' +
                ", longThrowInTrait='" + longThrowInTrait + '\'' +
                ", oneClubPlayerTrait='" + oneClubPlayerTrait + '\'' +
                ", outsideFootShotTrait='" + outsideFootShotTrait + '\'' +
                ", playmakerTrait='" + playmakerTrait + '\'' +
                ", powerFreeKickTrait='" + powerFreeKickTrait + '\'' +
                ", powerHeaderTrait='" + powerHeaderTrait + '\'' +
                ", puncherTrait='" + puncherTrait + '\'' +
                ", rushesOutOfGoalTrait='" + rushesOutOfGoalTrait + '\'' +
                ", savesWithFeetTrait='" + savesWithFeetTrait + '\'' +
                ", secondWindTrait='" + secondWindTrait + '\'' +
                ", selfishTrait='" + selfishTrait + '\'' +
                ", skilledDribblingTrait='" + skilledDribblingTrait + '\'' +
                ", stutterPenaltyTrait='" + stutterPenaltyTrait + '\'' +
                ", swervePassTrait='" + swervePassTrait + '\'' +
                ", takesFinesseFreeKicksTrait='" + takesFinesseFreeKicksTrait + '\'' +
                ", targetForwardTrait='" + targetForwardTrait + '\'' +
                ", teamPlayerTrait='" + teamPlayerTrait + '\'' +
                ", technicalDribblerTrait='" + technicalDribblerTrait + '\'' +
                ", triesToBeatDefensiveLineTrait='" + triesToBeatDefensiveLineTrait + '\'' +
                ", poacherSpeciality='" + poacherSpeciality + '\'' +
                ", speedsterSpeciality='" + speedsterSpeciality + '\'' +
                ", aerialThreatSpeciality='" + aerialThreatSpeciality + '\'' +
                ", dribblerSpeciality='" + dribblerSpeciality + '\'' +
                ", playmakerSpeciality='" + playmakerSpeciality + '\'' +
                ", engineSpeciality='" + engineSpeciality + '\'' +
                ", distanceShooterSpeciality='" + distanceShooterSpeciality + '\'' +
                ", crosserSpeciality='" + crosserSpeciality + '\'' +
                ", freeKickSpecialistSpeciality='" + freeKickSpecialistSpeciality + '\'' +
                ", tacklingSpeciality='" + tacklingSpeciality + '\'' +
                ", tacticianSpeciality='" + tacticianSpeciality + '\'' +
                ", acrobatSpeciality='" + acrobatSpeciality + '\'' +
                ", strengthSpeciality='" + strengthSpeciality + '\'' +
                ", clinicalFinisherSpeciality='" + clinicalFinisherSpeciality + '\'' +
                ", prefersRs='" + prefersRs + '\'' +
                ", prefersRw='" + prefersRw + '\'' +
                ", prefersRF='" + prefersRF + '\'' +
                ", prefersRAM='" + prefersRAM + '\'' +
                ", prefersRcm='" + prefersRcm + '\'' +
                ", prefersRm='" + prefersRm + '\'' +
                ", prefersRDM='" + prefersRDM + '\'' +
                ", prefersRcb='" + prefersRcb + '\'' +
                ", prefersRb='" + prefersRb + '\'' +
                ", prefersRwb='" + prefersRwb + '\'' +
                ", prefersSt='" + prefersSt + '\'' +
                ", prefersLw='" + prefersLw + '\'' +
                ", prefersCF='" + prefersCF + '\'' +
                ", prefersCam='" + prefersCam + '\'' +
                ", prefersCM='" + prefersCM + '\'' +
                ", prefersLM='" + prefersLM + '\'' +
                ", prefersCdm='" + prefersCdm + '\'' +
                ", prefersCb='" + prefersCb + '\'' +
                ", prefersLB='" + prefersLB + '\'' +
                ", prefersLwb='" + prefersLwb + '\'' +
                ", prefersLs='" + prefersLs + '\'' +
                ", prefersLF='" + prefersLF + '\'' +
                ", prefersLam='" + prefersLam + '\'' +
                ", prefersLcm='" + prefersLcm + '\'' +
                ", prefersLdm='" + prefersLdm + '\'' +
                ", prefersLcb='" + prefersLcb + '\'' +
                ", prefersGk='" + prefersGk + '\'' +
                '}';
    }
}