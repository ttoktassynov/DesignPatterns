package behavorial_patterns.iterator;

public class IteratorDemo {
    public static void main(String [] args){
        IterableCollection collection = new CustomIterableCollection();
        //System.out.println(collection);
        Iterator iter = collection.createIterator();
        doOperationWithIterator(iter);
        doOperationWithCollections((CustomIterableCollection)collection);
    }
    public static void doOperationWithIterator(Iterator iter){
        String total = "";
        while (iter.hasMore()) {
            total += iter.getNext();
        }
        System.out.println(total);
    }
    public static void doOperationWithCollections(
            CustomIterableCollection collection){
        String total = "";
        for (String element : collection.getData()){
            total += element;
        }
        System.out.println(total);
    }
}
