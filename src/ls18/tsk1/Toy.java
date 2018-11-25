package ls18.tsk1;

public class Toy {

        String name;
        int cost;

    @Override
    public String toString() {
        return "Toy{" +
                "name='" + name + '\'' +
                ", cost=" + cost +
                '}';
    }

    public Toy(String name, int cost) {
            this(name);
            this.cost = cost;

        }

        public Toy(String name) {
            this();
            this.name = name;

        }

        public Toy() {

        }
    }


