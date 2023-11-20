package homework4;
import javax.xml.crypto.Data;
import java.text.DecimalFormat;

public class Ticket{

    private long id;
    private int zoneDeparture;
    private int zoneArrival;
    private int routeNumber;
    private Data timeDeparture;
    private Data timeArrival;
    private long idBuyer;
    private boolean isUsed;
    private DecimalFormat price;
    private String place;
    private Ticket date;

    public Ticket(long id, int zoneDeparture, int zoneArrival,  int routeNumber, Data timeDeparture, Data timeArrival,
                  long idBuyer, boolean isUsed, DecimalFormat price, String place, Ticket date) {
        this.id = id;
        this.routeNumber = routeNumber;
        this.place = place;
        this.price = price;
        this.date = date;
    }

    // public long getId() {
    //     return id;
    // }

    // public void setId(long id) {
    //     this.id = id;
    // }

    // public int getZoneStart() {
    //     return zoneStart;
    // }


    public void setZoneDeparture(int zoneDeparture) {
        this.zoneDeparture = zoneDeparture;
    }

    // public int getZoneDeparture() {
    //     return zoneDeparture;
    // }

    public void setZoneArrival(int zoneArrival) {
        this.zoneArrival = zoneArrival;
    }
    // public int getZoneArrival() {
    //     return zoneArrival;
    // }

    public int getRouteNumber() {
        return routeNumber;
    }

    // public void setRouteNumber(int routeNumber) {
    //     this.routeNumber = routeNumber;
    // }

    public String getPlace() {
        return place;
    }

    // public void setPlace(int place) {
    //     this.place = place;
    // }

    public DecimalFormat getPrice() {
        return price;
    }

    // public void setPrice(int price) {
    //     this.price = price;
    // }

    public Data getTimeDeparture() {
        return timeDeparture;
    }

    // public void setTimeDepartureData timeDeparture) {
    //     this.timeDeparture = timeDeparture;
    // }
    public Data getTimeArrival() {
        return timeArrival;
    }

    // public void setTimeArrival(Data timeArrival) {
    //     this.timeArrival = timeArrival;
    // }


    @Override
    public String toString() {
        return "Ticket" +
                " Route Number " + routeNumber +
                ", Place " + place +
                ", Price " + price + " rub." +
                ", Date " + date +
                " ";
    }


    public String toPrint() {
        return "Ticket" +
                "\nRoute Number " + routeNumber +
                "\nPlace " + place +
                "\nPrice " + price + "rub." +
                "\nDate " + date;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        return this.equals((Ticket) obj);
    }


    public boolean equals(Ticket ticket) {
        boolean isIt = ticket != null
                && ticket.getRouteNumber() == this.routeNumber
                && ticket.getPlace() == this.place
                && ticket.getPrice() == this.price
                && ticket.getTimeDeparture() == this.timeDeparture
                && ticket.getTimeArrival() == this.timeArrival
                && ticket.hashCode() == this.hashCode();

        if (isIt) {
            return true;
        }
        return false;
    }
}