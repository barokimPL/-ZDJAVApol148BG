package SimpleTuple;

public class SimpleTuple <T extends Comparable<T>> {
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

    public T getMin() {
        int res = this.getLeft().compareTo(this.getRight());
        if (res <= 0)
            return this.getLeft();
        else
            return this.getRight();
    }


    public T getMax() {
        int res = this.getLeft().compareTo(this.getRight());
        if (res <= 0)
            return this.getRight();
        else
            return this.getLeft();
    }
}
