package SimpleTuple;

public class Main {

    public static void main(String[] args) {
        SimpleTuple<String> t = new SimpleTuple<>("Right", "Left");
        System.out.println(t.getLeft());
        System.out.println(t.getRight());
    }
}
