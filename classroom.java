import java.util.*;

public class classroom {
    public static void main(String args[]){
        HashMap<String , Integer> hm = new HashMap<>();
        hm.put(key:"India", value:100);
        hm.put(key:"China", value:150);
        hm.put(key:"Us", value:60);

        System.out.println(hm);

    
     int population = hm.get(key:"india");
     System.out.println(population);
    }
}
