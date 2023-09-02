package SimpleTuple;

import AnimalShelter.ShelterWorker;

public class Animal {
    private int id;
    private String name;
    private int age;
    private String race;
    private ShelterWorker shelterWorker;

    public Animal(int id, String name, String race) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.race = race;
    }

    public void setShelterWorker(ShelterWorker shelterWorker) {
        this.shelterWorker = shelterWorker;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getRace() {
        return race;
    }

    public ShelterWorker getShelterWorker() {
        return shelterWorker;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", race='" + race;
    }

}
