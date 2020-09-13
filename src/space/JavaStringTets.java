package space;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class JavaStringTets {
    public static void main(String[] args) {
//        String time = LocalTime.now().toString().replaceAll("[:.]","_").replace(".","_");
//        System.out.println("enaenen@naver.com"+"_"+time);
//
//        Calendar cal = Calendar.getInstance();
//        cal.set(Calendar.YEAR, 2020);
//        cal.set(Calendar.MONTH, Calendar.OCTOBER);
//        cal.set(Calendar.DAY_OF_MONTH, 25);
//        Date d1 = cal.getTime();
//        System.out.println(d1);
//        cal.clear();
//        LocalDateTime localDateTime = LocalDateTime.now();
//        cal.set(localDateTime.getYear(), localDateTime.getMonthValue()-1, localDateTime.getDayOfMonth(),
//                localDateTime.getHour(), localDateTime.getMinute(), localDateTime.getSecond());
//        System.out.println(cal.getTime());
        ArtWork artwork = new ArtWork();
        artwork.setId(Long.valueOf("0"));
        Vo vo = new Vo(artwork);
//        System.out.println();
    }
}
class Vo {
    private Long id;
    private String deliveryState;

    public Vo(ArtWork artWork){
        this.id = artWork.getId();
    }
}
class ArtWork {
    private Long id;
    private List<Order> orders = new ArrayList<Order>();
    ArtWork(){

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    public ArtWork(Long id, List<Order> orders) {
        this.id = id;
        this.orders = orders;
    }
}
class Order{
    private Long id;
    private String deliveryState;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDeliveryState() {
        return deliveryState;
    }

    public void setDeliveryState(String deliveryState) {
        this.deliveryState = deliveryState;
    }

    public Order(Long id, String deliveryState) {
        this.id = id;
        this.deliveryState = deliveryState;
    }
}