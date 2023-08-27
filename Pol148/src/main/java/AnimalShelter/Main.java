package AnimalShelter;

public class Main {
    public static void main(String[] args) {

       ShelterWorker worker1 = new ShelterWorker("Johny", "Brawo", 1);
       Animal dog = new Animal(1, "Lucy", 7, "dog");
       Animal cat = new Animal(1, "Basia", 3, "cat");
       Animal deer = new Animal(1, "Lucy", 13, "deer");

       dog.setShelterWorker(worker1);
       cat.setShelterWorker(worker1);
       deer.setShelterWorker(worker1);

       System.out.println(worker1);
    }
}
