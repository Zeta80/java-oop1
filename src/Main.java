import org.lessons.java.shop.Prodotto;

public class Main {
    public static void main(String[] args) {

       Prodotto macchina = new Prodotto("audi", "veloce come il vento",1543.56);
       Prodotto macchina2 = new Prodotto("mercedes", "leggermente più veloce del vento",2356.76);
        System.out.println(macchina);
        System.out.println(macchina2);
    }
}