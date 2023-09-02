package SimpleTuple;

public class SimpleTuple <T> {
    private final T rightElement;
    private final T leftElement;

    public SimpleTuple(T rightElement, T leftElement) {
        this.rightElement = rightElement;
        this.leftElement = leftElement;
    }

    public T getRight() {
        return rightElement;
    }

    public T getLeft() {
        return leftElement;
    }
}
