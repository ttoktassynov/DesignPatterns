package behavorial_patterns.iterator;

public class IteratorDemo {
    public static void main(String [] args){
        IterableCollection collection = new CustomIterableCollection();
        //System.out.println(collection);
        Iterator iter = collection.createIterator();
        int i = 0;
        String total = "";
        while (iter.hasMore()) {
            total += iter.getNext();
        }
        System.out.println(total);
    }
}
