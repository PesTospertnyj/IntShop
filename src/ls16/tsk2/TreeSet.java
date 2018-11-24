package ls16.tsk2;


import ls16.tsk1.HeavyBox;

import java.util.SortedSet;

public class TreeSet {

    public static void main(String[] args) {
        SortedSet<HeavyBox> set = new java.util.TreeSet<>();
        set.add(new HeavyBox(1,1,1,1));
        set.add(new HeavyBox(2,2,2,10));
        set.add(new HeavyBox(3,3,3,3));
        set.add(new HeavyBox(4,4,4,4));
                set.forEach((s) -> System.out.println("Элемент " + s));
    }
}
