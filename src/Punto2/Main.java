package Punto2;

public class Main {

    public static void main(String[] args) {
        
        Airport airports[] = new Airport[ 4 ];
        airports[0] = new Airport("Jose Maria Cordoba");
        airports[1] = new Airport("El Dorado");
        airports[2] = new Airport("Chicago");
        airports[3] = new Airport("aaa");
                     
        int flightNumberA = 1345;
        String departureA  = "22/03/17";
        String arrivalA = "22/03/17";
        BookedFlight outbound = new BookedFlight(flightNumberA, departureA, arrivalA, airports[0]);
        
        int flightNumberB = 1345;
        String departureB  = "22/03/17";
        String arrivalB = "22/03/17";
        BookedFlight ret = new BookedFlight(flightNumberB, departureB, arrivalB, airports [1]);
        
        Travel travel = new Travel("22/03/17",30,outbound,ret);
   
        Hotel hotel = new Hotel("Fontanar", "Carrera 21a #159a 28");
        
        TravelAgency A = new TravelAgency("Aviatur", airports, hotel, travel);   
    }
}
