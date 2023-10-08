package Students;

public abstract class Hogwarts {
    protected final String name;
    protected final int witchcraft; // колдовство
    protected final int transgression; // трансгрессия

    public Hogwarts(String name, int witchcraft, int transgression) {
        this.name = name;
        this.witchcraft = witchcraft;
        this.transgression = transgression;
    }

    public String getName() {
        return name;
    }

    public int getWitchcraft() {
        return witchcraft;
    }

    public int getTransgression() {
        return transgression;
    }
    private int getMagicCompareSum() {
        return witchcraft + transgression;
    }

    protected abstract int getSkillsSum();

    public void magicCompare (Hogwarts hogwarts) {
        int powerOfMagic1 = getMagicCompareSum();
        int powerOfMagic2 = hogwarts.getMagicCompareSum();
        if (powerOfMagic1 > powerOfMagic2) {
            System.out.println(getName() + " обладает большей магической силой, чем " + hogwarts.getName());
        } else if (powerOfMagic1 < powerOfMagic2) {
            System.out.println(hogwarts.getName() + " обладает большей магической силой, чем " + getName());
        } else {
            System.out.println("Магическая сила равна у обоих учеников.");
        }
    }

    @Override
    public String toString() {
        return "Hogwarts{" +
                "name='" + name + '\'' +
                ", witchcraft=" + witchcraft +
                ", transgression=" + transgression +
                '}';
    }

}
