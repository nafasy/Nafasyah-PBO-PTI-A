public class Main {
    public static void main(String[] args) {
        // casting
        // double angka = 5.4;
        // int angka_int = (int)angka;
        // System.out.println(angka_int);
        // Object dengan class HeroIntel
        HeroIntel hero1 = new HeroIntel("Ucup", 100);
        hero1.display();
        // upcasting
        Hero heroUp = (Hero) hero1;
        heroUp.display();
        // System.out.println(heroUp.getType()); //ini error
        // Object dgn class Hero
        Hero heroReg = new Hero("Boy", 100);
        heroReg.display();
        // downcasting
        // HeroAgility heroDown = (HeroAgility) heroReg; //ini error
        // heroDown.display();
        // heroUp dikembalikan ke hero1
        HeroIntel hero2 = (HeroIntel) heroUp;
        hero2.display(); // ini berhasil downcasting

        HeroAgility hero3 = (HeroAgility) heroUp; 
        hero3.display();

        HeroMagic heroMagic = new HeroMagic("Gandalf", 150);
        heroMagic.display();
        System.out.println("Type of heroMagic: " + heroMagic.type);
        System.out.println("Power of heroMagic: " + heroMagic.power);

        // Upcasting HeroMagic to Hero
        Hero heroMagicUp = (Hero) heroMagic;
        heroMagicUp.display();

        // Downcasting Hero to HeroMagic
        if (heroMagicUp instanceof HeroMagic) {
            HeroMagic heroMagicDown = (HeroMagic) heroMagicUp;
            heroMagicDown.display();
            System.out.println("Type of heroMagicDown: " + heroMagicDown.type);
            System.out.println("Power of heroMagicDown: " + heroMagicDown.power);
        } else {
            System.out.println("heroMagicUp is not an instance of HeroMagic");
        }
    }
}
