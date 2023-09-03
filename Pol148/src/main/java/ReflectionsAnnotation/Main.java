package ReflectionsAnnotation;

public class Main {
    public static void main(String[] args) {
        Phone phone = new Phone("Y5", "Huawei", 2022);
        System.out.println(phone.getAge(2025));
        System.out.println(phone.butWhatIfItWasSamsung());
    }

}
