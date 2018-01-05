public class Pokemon {
    private final String name;
    private final String type;
    private final int currentEvolutionStage;
    private final int maximumEvolutionStage;
    private final boolean gender;
    private final String abilitie;
    private final int numberOfAttacks;
    private final String trainer;

    public Pokemon(String name, String type, int currentEvolutionStage, int maximumEvolutionStage, String gender,
                   String abilitie, int numberOfAttacks, String trainer) {
        this.name = name;
        this.type = type;
        this.currentEvolutionStage = currentEvolutionStage;
        this.maximumEvolutionStage = maximumEvolutionStage;
        this.gender = checkGender(gender);
        this.abilitie = abilitie;
        this.numberOfAttacks = numberOfAttacks;
        this.trainer = trainer;
    }

    private boolean checkGender(String gender) {
        return false;
    }
}
