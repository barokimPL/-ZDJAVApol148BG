package ReflectionsAnnotation;
public class Phone {
    private String model;
    private String producer;
    private int yearOfRelease;

    public Phone(String model, String producer, int yearOfRelease) {
        this.model = model;
        this.producer = producer;
        this.yearOfRelease = yearOfRelease;
    }

    public Phone() {
    }

    @SuperMethod(run = true)
    public int calculateMaxSupportYear(int yearsOfSupport) {
        return yearOfRelease + yearsOfSupport;
    }

    public String butWhatIfItWasSamsung() {
        return this.producer.equals("Samsung")
                ? "Still a Samsung."
                : "Than it wouldn't be  a " + this.producer + " anymore.";
    }

    public int getAge(int currentYear) {
        return currentYear - this.yearOfRelease;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "model='" + model + '\'' +
                ", producer='" + producer + '\'' +
                ", yearOfRelease=" + yearOfRelease +
                '}';
    }
}
