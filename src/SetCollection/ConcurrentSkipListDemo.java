package SetCollection;

import java.util.concurrent.ConcurrentSkipListSet;

public class ConcurrentSkipListDemo {
    public static void main(String[] args) {
        ConcurrentSkipListSet<Integer> set = new ConcurrentSkipListSet<>();

        set.add(10);
        set.add(5);
        set.add(20);
        set.add(15);
        // set.add(null); // Throws NullPointerException

        System.out.println("Sorted Set: " + set); // Output: [5, 10, 15, 20]

        // Navigable operations
        System.out.println("Ceiling of 11: " + set.ceiling(11)); // 15 -  Smallest element ≥ e
        System.out.println("Floor of 11: " + set.floor(11));     // 10 - Largest element ≤ e
        System.out.println("Higher than 15: " + set.higher(15)); // 20 -  element > e
        System.out.println("Lower than 15: " + set.lower(15));   // 10 -  element < e

        set.remove(10);
        System.out.println("After removal: " + set); // [5, 15, 20]
    }
}
