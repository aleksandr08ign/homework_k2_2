package Students;

public class Slizerin extends Hogwarts {
    private final int cunning; // хитрость
    private final int determination; // решительность
    private final int ambition; // амбициозность
    private final int resourcefulness; // находчивость
    private final int power; // жажда власти

    public Slizerin(String name, int witchcraft, int transgression, int cunning, int determination, int ambition, int resourcefulness, int power) {
        super(name, witchcraft, transgression);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.power = power;
    }

    public int getCunning() {
        return cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public int getPower() {
        return power;
    }


    @Override
    public String toString() {
        return "Slizerin{" +
                "cunning=" + cunning +
                ", determination=" + determination +
                ", ambition=" + ambition +
                ", resourcefulness=" + resourcefulness +
                ", power=" + power +
                ", witchcraft=" + witchcraft +
                ", transgression=" + transgression +
                '}';
    }

    public void compare(Slizerin slizerin) {
        int skillsSum1 = getSkillsSum();
        int skillsSum2 = slizerin.getSkillsSum();
        if (skillsSum1 > skillsSum2) {
            System.out.println(getName() + " лучший Слизеринец, чем  " + slizerin.getName());
        } else if (skillsSum1 < skillsSum2) {
            System.out.println(slizerin.getName() + " лучший Слизеринец, чем  " + getName());
        } else {
            System.out.println("Способности учеников равные.");
        }
    }

    @Override
    protected int getSkillsSum() {
        return cunning + determination + ambition + resourcefulness;
    }
}
