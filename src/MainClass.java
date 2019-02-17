public class MainClass {
    public static void main(String [] args){
        LinkedList list=new LinkedList();
        list.insert(12);
        list.insert(13);
        list.insert(14);
        list.insertStart(11);
        list.insertStart(10);


        list.insertAt(1,100);
        list.show();
}
}
