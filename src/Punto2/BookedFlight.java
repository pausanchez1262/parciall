package Punto2;

public class BookedFlight {
    private int flightNumber;
    private String departure;
    private String arrival;
    private Airport a;
    
    public BookedFlight(int flightNumber, String departure, String arrival, Airport a){
        this.flightNumber = flightNumber;
        this.departure= departure;
        this.arrival = arrival;
        this.a = a;
    }
}
