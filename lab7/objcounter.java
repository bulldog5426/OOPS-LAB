class Counter {
    private static int count = 0;

    public Counter() {
        count++; // Increment the count each time an object is created
    }

    public static int getCount() {
        return count;
    }
}

public class ObjectCounter {
    public static void main(String[] args) {
        Counter obj1 = new Counter();
        Counter obj2 = new Counter();
        Counter obj3 = new Counter();

        int objectCount = Counter.getCount();
        System.out.println("Number of objects created: " + objectCount);
    }
}
