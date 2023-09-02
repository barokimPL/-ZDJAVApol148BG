package SimpleTuple;

import GenericMethod.Animal;

public class Main {

    public static void main(String[] args) {
        SimpleTuple<Integer> t = new SimpleTuple<>(1, 2);
//        SimpleTuple2<Animal> t = new SimpleTuple<>(
//                new Animal(1, "Alice", "Horse"),
//                new Animal(2, "Romuald", "Ass"))

        System.out.println(t.getMin());
        System.out.println(t.getMax());
    }
}
