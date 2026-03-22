package datastructures.heap;

public class Main {

    public static void main(String[] args) {
        Heap myHeap = new Heap();
        myHeap.insert(99);
        myHeap.insert(72);
        myHeap.insert(61);
        myHeap.insert(58);

        System.out.println(myHeap.getHeap());

        System.out.println("Insert 75");
        myHeap.insert(75);

        System.out.println(myHeap.getHeap());

        System.out.println("Insert 100");
        myHeap.insert(100);

        System.out.println(myHeap.getHeap());

        System.out.println("Remove");

        myHeap.remove();

        System.out.println(myHeap.getHeap());

        System.out.println("Remove");

        myHeap.remove();

        System.out.println(myHeap.getHeap());
    }
}
