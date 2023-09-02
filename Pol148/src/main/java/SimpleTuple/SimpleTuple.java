package SimpleTuple;

public class SimpleTuple<T> {
    private final Comparable<T> rightElement;
    private final Comparable<T> leftElement;

    public SimpleTuple(Comparable<T> rightElement, Comparable<T> leftElement) {
        this.rightElement = rightElement;
        this.leftElement = leftElement;
    }

    public Comparable<T> getRight() {
        return rightElement;
    }

    public Comparable<T> getLeft() {
        return leftElement;
    }

    public Comparable<T> getMin() {
        int res = this.getLeft().compareTo((T) this.getRight());

        if (res <= 0) {
            return this.getLeft();
        } else {
            return this.getRight();
        }
    }

    public Comparable<T> getMax() {
        int res = this.getLeft().compareTo((T) this.getRight());

        if (res <= 0) {
            return this.getRight();
        } else {
            return this.getLeft();
        }
    }

}
