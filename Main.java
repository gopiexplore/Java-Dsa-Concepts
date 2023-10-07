public class Main {
    public static void main(String[] args) {
         LL list=new LL();
         list.insertFirst(3);
         list.insertFirst(4);
         list.insertFirst(5);
         list.insertFirst(23);
         list.insertFirst(12);
        list.insertLast(1);
        list.insertLast(212);
        list.insert(100,2);
        System.out.println(list.deleteFirst());
         list.display();
        System.out.println(list.deleteLast());
        list.display();
        System.out.println(list.delete(2));
        list.display();


    }
}
