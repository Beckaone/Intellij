public class Fahrzeug {

    protected int velocity;

    public Fahrzeug(int velocity){
        this.velocity = velocity;
        System.out.println("Konstruktor aus Klasse Fahrzeug");
    }

    public void setVelocity(int velocity) {
        this.velocity = velocity;
    }

    public int getVelocity() {
        return velocity;
    }
}
