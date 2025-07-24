package Oops_Java;

public class CharQueue {
     char[] queue;
     int rear;
     int capacity;

    // Constructor to initialize the queue
    public CharQueue(int capacity) {
        this.capacity = capacity;
        queue = new char[capacity];
        rear = 0; // number of elements in the queue
    }

    // Enqueue: Add element to the end
    public void enqueue(char element) {
        if (rear == capacity) {
            System.out.println("Queue is full. Cannot enqueue '" + element + "'");
            return;
        }
        queue[rear] = element;
        rear++;
        System.out.println("Enqueued: " + element);
    }

    // Dequeue: Remove element from the front and shift the rest
    public char dequeue() {
        if (rear == 0) {
            System.out.println("Queue is empty. Cannot dequeue.");
            return '\0'; // null character
        }

        char element = queue[0];

        // Shift all elements to the left by one
        for (int i = 1; i < rear; i++) {
            queue[i - 1] = queue[i];
        }
        rear--;

        System.out.println("Dequeued: " + element);
        return element;
    }

    // Display the queue
    public void displayQueue() {
        System.out.print("Queue: ");
        for (int i = 0; i < rear; i++) {
            System.out.print(queue[i] + " ");
        }
        System.out.println();
    }

    // Main method to test
    public static void main(String[] args) {
        CharQueue q = new CharQueue(5);

        q.enqueue('A');
        q.enqueue('B');
        q.enqueue('C');
        q.displayQueue();

        q.dequeue();
        q.displayQueue();

        q.enqueue('D');
        q.enqueue('E');
        q.enqueue('F');
        q.enqueue('G');  // Should show "Queue is full"
        q.displayQueue();
    }
}


