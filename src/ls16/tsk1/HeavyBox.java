package ls16.tsk1;

public class HeavyBox extends Box6 implements Comparable<HeavyBox>{
    public int weight; // вес коробки

    public HeavyBox() {
    }

    public HeavyBox(int width, int height, int depth, int weight) {
        this.width = width;
        this.height = height;
        this.depth = depth;
        this.weight = weight;
    }

    @Override
    public int compareTo(HeavyBox o) {
        if(this.weight>o.weight) {
            return 1;
        }else if (this.weight<o.weight){
        return -1;}
        return 0;
    }


    @Override
    public String toString() {
        return "HeavyBox{" +
                "weight=" + weight +
                '}';
    }
}
