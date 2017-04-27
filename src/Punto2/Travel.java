
package Punto2;

public class Travel {
    private String start;
    private int duration;
    private BookedFlight outbound;
    private BookedFlight ret;
    private Hotel hotel;
    
    
    public Travel(String start, int duration, BookedFlight outbound, BookedFlight ret){
        this.start = start;
        this.duration = duration;
        this.outbound = outbound;
        this.ret = ret;
    }
    
    public Travel(String start, int duration, BookedFlight outbound, BookedFlight ret, Hotel hotel ){
        this.start = start;
        this.duration = duration;
        this.outbound = outbound;
        this.ret = ret;
        this.hotel = hotel;
    }
}
