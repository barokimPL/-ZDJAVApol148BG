package SimpleTuple;

public class SimpleTuple<T> {
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

    public Comparable<T> getMin() {
        Comparable<T> left_item = (Comparable<T>) this.getLeft();

        // if -1 then left item smaller then right item
        int res = left_item.compareTo(this.getRight());
        if (res <= 0) {
            return left_item;
        } else {
            return (Comparable<T>) this.getRight();
        }
    }


    public Comparable<T> getMax() {
        Comparable<T> left_item = (Comparable<T>) this.getLeft();

        int res = left_item.compareTo(this.getRight());
        if (res <= 0) {
            return (Comparable<T>) this.getRight();
        } else {
            return left_item;
        }
    }
}
