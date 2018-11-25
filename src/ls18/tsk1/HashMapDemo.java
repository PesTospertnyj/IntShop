package ls18.tsk1;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
    public static void main(String[] args) {
        Map<String, Toy> toys = new HashMap<>();
        toys.put("Кубик", new Toy("Кубик", 34));
        toys.put("Машинка", new Toy("Машинка", 55));
        toys.put("Кукла", new Toy("Кукла", 34));

        enumerateValues(toys);
        enumerateKeys(toys);
        enumerateEntries(toys);
    }

    private static void enumerateEntries(Map<String, Toy> toys) {
        Set<Map.Entry<String, Toy>> set = toys.entrySet();
        for(Map.Entry<String, Toy> entry:set){
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
    }

    private static void enumerateKeys(Map<String, Toy> toys) {
        Set<String> set = toys.keySet();
        set.forEach((s -> System.out.println("Ключ: " + s)));
        /*for (String key:set){
            System.out.println("Ключ: " + key);
        }*/
    }

    private static void enumerateValues(Map<String, Toy> toys) {
        Collection<Toy> values = toys.values();
        for (Toy toy : values) {
            System.out.println("Значение: " + toy);
        }
    }
}
