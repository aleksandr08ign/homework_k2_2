package Students;

public class Kogtevran extends Hogwarts {
    private final int mind; // ум
    private final int wisdom; // мудрость
    private final int wit; // остроумие
    private final int creativity; // творчество

    public Kogtevran(String name, int witchcraft, int transgression, int mind, int wisdom, int wit, int creativity) {
        super(name, witchcraft, transgression);
        this.mind = mind;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creativity = creativity;
    }

    public int getMind() {
        return mind;
    }

    public int getWisdom() {
        return wisdom;
    }

    public int getWit() {
        return wit;
    }

    public int getCreativity() {
        return creativity;
    }

    @Override
    public String toString() {
        return "Kogtevran{" +
                "mind=" + mind +
                ", wisdom=" + wisdom +
                ", wit=" + wit +
                ", creativity=" + creativity +
                ", witchcraft=" + witchcraft +
                ", transgression=" + transgression +
                '}';
    }
    public void compare(Kogtevran kogtevran) {
        int skillsSum1 = getSkillsSum();
        int skillsSum2 = kogtevran.getSkillsSum();
        if (skillsSum1 > skillsSum2) {
            System.out.println(getName() + " лучший Когтевранец, чем " + kogtevran.getName());
        } else if (skillsSum1 < skillsSum2) {
            System.out.println(kogtevran.getName() + " лучший Когтевранец, чем " + getName());
        } else {
            System.out.println("Способности учеников равные.");
        }
    }

    @Override
    protected int getSkillsSum() {
        return mind + wisdom + wit + creativity;
    }
}
