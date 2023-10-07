public class MainDLL {
    public static void main(String[] args) {
        // Create an instance of the DLL class
        DLL list = new DLL();

        // Insert elements into the doubly linked list
        list.insertFirst(3);
        list.insertFirst(4);
        list.insertFirst(33);
        list.insertLast(21);
        list.insertLast(42);
        // Display the doubly linked list
        list.display();
    }
}
