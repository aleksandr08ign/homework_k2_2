package Students;

public class Puffenduy extends Hogwarts {
    private final int industriousness; // трудолюбие
    private final int loyalty; // верность
    private final int honesty; // честность

    public Puffenduy(String name, int witchcraft, int transgression, int industriousness, int loyalty, int honesty) {
        super(name, witchcraft, transgression);
        this.industriousness = industriousness;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getIndustriousness() {
        return industriousness;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    @Override
    public String toString() {
        return "Puffenduy{" +
                "industriousness=" + industriousness +
                ", loyalty=" + loyalty +
                ", honesty=" + honesty +
                ", witchcraft=" + witchcraft +
                ", transgression=" + transgression +
                '}';
    }
    public void compare(Puffenduy puffenduy) {
        int skillsSum1 = getSkillsSum();
        int skillsSum2 = puffenduy.getSkillsSum();
        if (skillsSum1 > skillsSum2) {
            System.out.println(getName() + " лучший Пуффендуец, чем " + puffenduy.getName());
        } else if (skillsSum1 < skillsSum2) {
            System.out.println(puffenduy.getName() + " лучший Пуффендуец, чем " + getName());
        } else {
            System.out.println("Способности учеников равные.");
        }
    }

    @Override
    protected int getSkillsSum() {
        return industriousness + loyalty + honesty;
    }
}
