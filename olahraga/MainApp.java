import model.*;
import java.util.ArrayList;
import java.util.HashMap;

public class MainApp {
    public static void main(String[] args) {
        try {
            // Array
            Olahraga[] daftarOlahraga = { new Volly(), new Futsal(), new Basket() };
            System.out.println("=== Array ===");
            for (Olahraga o : daftarOlahraga) {
                o.info();
                System.out.println();
            }

            // ArrayList
            ArrayList<Olahraga> list = new ArrayList<>();
            list.add(new Volly());
            list.add(new Futsal());
            list.add(new Basket());

            System.out.println("=== ArrayList ===");
            for (Olahraga o : list) {
                o.info();
                System.out.println();
            }

            // HashMap
            HashMap<String, Olahraga> map = new HashMap<>();
            map.put("V", new Volly());
            map.put("F", new Futsal());
            map.put("B", new Basket());

            System.out.println("=== HashMap ===");
            for (String key : map.keySet()) {
                System.out.println("Kode: " + key);
                map.get(key).info();
                System.out.println();
            }

            // Exception Handling
            System.out.println("=== Exception Handling ===");
            Olahraga salah = map.get("X"); // tidak ada key X
            if (salah == null) {
                throw new Exception("Kode olahraga tidak ditemukan!");
            }

        } catch (Exception e) {
            System.out.println("Terjadi error: " + e.getMessage());
        } finally {
            System.out.println("Program selesai.");
        }
    }
}