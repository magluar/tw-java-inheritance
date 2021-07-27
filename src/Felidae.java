public class Felidae extends Animal{

    public String meowing = "meowing meowing";

    public Felidae(int age, double weight, boolean running, boolean eating) {
        super(age, weight, running, eating);
        this.meowing = meowing;
    }

    public void meowingSound(){
        System.out.println(this.meowing);
    }
}
