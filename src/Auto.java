public class Auto extends Fahrzeug{

    private int numberOfSeats;

    // Default Konstruktor überschreiben
    public Auto(int numberOfSeats, int velocity){
        // Konstruktor der Oberklasse aufrufen
        super(velocity);
        this.numberOfSeats = numberOfSeats;
        System.out.println("Konstruktor aus Klasse Auto");
    }

    public void allesAusgeben(){
        System.out.println("Anzahlsitze: "+numberOfSeats);
        System.out.println("Geschwindigkeit: "+velocity);
    }


    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }
}
