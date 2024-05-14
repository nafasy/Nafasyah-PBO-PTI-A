public class HeroMagic extends Hero {
    public String type; // diubah menjadi public
    public String power; // atribut tambahan

    public HeroMagic(String name, double health) {
        super(name, health);
        this.type = "Magic";
        this.power = "Magic";
    }

    public void display() {
        System.out.println(this.getName() + " is a " + this.type + " Hero with power " + this.power + ".");
    }
}