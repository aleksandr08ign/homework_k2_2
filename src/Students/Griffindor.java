package Students;

    public class Griffindor extends Hogwarts {
        private final int nobility; //благородство
        private final int honor; // честь
        private final int bravery; // храбрость

        public Griffindor(String name, int witchcraft, int transgression, int nobility, int honor, int bravery) {
            super(name, witchcraft, transgression);
            this.nobility = nobility;
            this.honor = honor;
            this.bravery = bravery;
        }

        public int getNobility() {
            return nobility;
        }

        public int getHonor() {
            return honor;
        }

        public int getBravery() {
            return bravery;
        }

        @Override
        public String toString() {
            return "Griffindor{" +
                    "nobility=" + nobility +
                    ", honor=" + honor +
                    ", bravery=" + bravery +
                    ", witchcraft=" + witchcraft +
                    ", transgression=" + transgression +
                    '}';
        }

        public void compare(Griffindor griffindor) {
            int skillsSum1 = getSkillsSum();
            int skillsSum2 = griffindor.getSkillsSum();
            if (skillsSum1 > skillsSum2) {
                System.out.println(getName() + " лучший Гриффиндорец, чем " + griffindor.getName());
            } else if (skillsSum1 < skillsSum2) {
                System.out.println(griffindor.getName() + " лучший Гриффиндорец, чем " + getName());
            } else {
                System.out.println("Способности учеников равные.");
            }
        }

        @Override
        protected int getSkillsSum() {
            return nobility + honor + bravery;
        }
    }

