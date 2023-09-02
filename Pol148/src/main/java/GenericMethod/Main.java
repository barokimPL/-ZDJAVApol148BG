package GenericMethod;

public class Main {
    public static void main(String[] args) {
        String[] strs = new String[2];

        strs[0] = "Element pierwszy";
        strs[1] = "Element drugi";

        printArray(strs);
    }
    public static <T> void printArray(T[] items) {
        for (T item : items) {
            System.out.println(item);
        }
    }
}
