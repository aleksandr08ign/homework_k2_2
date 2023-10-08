import Students.Griffindor;
import Students.Kogtevran;
import Students.Puffenduy;
import Students.Slizerin;

public class Main {
    public static void main(String[] args) {

        Griffindor harriPotter = new Griffindor("Гарри Поттер",95, 95, 100, 95, 100);
        Griffindor germionaGranger = new Griffindor("Гермиона Грейнджер", 100, 90, 95,90, 85);
        Griffindor ronUizly = new Griffindor("Рон Уизли",70, 85, 90,85, 90);
        Slizerin dracoMylfoy = new Slizerin("Драко Малфой",85, 86, 92, 93,98, 95, 100);
        Slizerin grechamMontegui = new Slizerin("Грэхэм Монтегю",60, 70, 85, 75,90, 80, 67);
        Slizerin gregoryGoil = new Slizerin("Грегори Гойл",80,75,70,60,95,85,60);
        Puffenduy zachariySmit = new Puffenduy("Захария Смит",90,95,80,75,85);
        Puffenduy sedricDiggory = new Puffenduy("Седрик Диггори",85,90,80,95,90);
        Puffenduy jastinFFlatchly = new Puffenduy("Джастин Финч-Флетчли",65,70,85,65,86);
        Kogtevran chjouChang = new Kogtevran("Чжоу Чанг",90,95,80,90,94,88);
        Kogtevran padmaPatyl = new Kogtevran("Падма Патил",55,60,65,68,74,81);
        Kogtevran murcosBelby  = new Kogtevran("Маркус Белби",86,94,50,68,97,82);

        System.out.println(harriPotter);
        System.out.println(germionaGranger);
        System.out.println(ronUizly);
        System.out.println(dracoMylfoy);
        System.out.println(grechamMontegui);
        System.out.println(gregoryGoil);
        System.out.println(zachariySmit);
        System.out.println(sedricDiggory);
        System.out.println(jastinFFlatchly);
        System.out.println(chjouChang);
        System.out.println(padmaPatyl);
        System.out.println(murcosBelby);
        System.out.println();
        ronUizly.compare(germionaGranger);
        dracoMylfoy.compare(gregoryGoil);
        sedricDiggory.compare(zachariySmit);
        chjouChang.compare(murcosBelby);
        System.out.println();
        harriPotter.magicCompare(dracoMylfoy);
        germionaGranger.magicCompare(dracoMylfoy);
        chjouChang.magicCompare(zachariySmit);
        zachariySmit.magicCompare(ronUizly);
        harriPotter.magicCompare(ronUizly);
    }

}