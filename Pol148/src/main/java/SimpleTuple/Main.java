package SimpleTuple;

public class Main {

    public static void main(String[] args) {
        SimpleTuple<Integer> t = new SimpleTuple<>(40, 20);

        System.out.println(t.getMin());
        System.out.println(t.getMax());
    }
}
