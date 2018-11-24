package ls17.tsk1;

import ls16.tsk1.HeavyBox;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class CollectionDemo {
    public static void main(String[] args) {
        List<HeavyBox> list = new ArrayList<>();
        list.add(new HeavyBox(1,1,1,1));
        list.add(new HeavyBox(5,5,5,700));
        list.add(new HeavyBox(3,3,3,450));

        List<HeavyBox> heavyBoxes = sortList(list);
        System.out.println(list);
        System.out.println(heavyBoxes);
    }
    private static List<HeavyBox> sortList(List<HeavyBox> list){
        List<HeavyBox> result = new ArrayList<>();
        Iterator<HeavyBox> iterator = list.iterator();
        while(iterator.hasNext()){
            HeavyBox box = iterator.next();
            if (box.weight>300){
                result.add(box);
            iterator.remove();
            }
        }
        return result;
    }
}
