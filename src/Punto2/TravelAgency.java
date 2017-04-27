package Punto2;

public class TravelAgency {

    private String name;
    private Hotel[] knowHotel;
    int hotels;
    private Travel[] offeredTravels;
    int travels;
    private Airport[] airports;

    public TravelAgency(String name, Airport[] airport, Hotel h, Travel t) {
        this.name = name;
        knowHotel = new Hotel[5];
        offeredTravels = new Travel[10];

        knowHotel[0] = h;
        offeredTravels[0] = t;

        hotels = 1;
        travels = 1;

        this.airports = airport;
    }

    public void addHotel(Hotel h) {
        if (hotels >= 5)
            return;

        knowHotel[hotels] = h;
        hotels++;
    }

    public void addTravel(Travel t) {
        if (travels >= 10)
            return;

        offeredTravels[travels] = t;
        travels++;
    }
}
