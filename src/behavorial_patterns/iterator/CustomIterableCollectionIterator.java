package behavorial_patterns.iterator;

public class CustomIterableCollectionIterator implements Iterator{

    private CustomIterableCollection collection;//4b
    private int currentIndex = - 1; // 4b
    private int collectionSize;// 4b

    public CustomIterableCollectionIterator(
            CustomIterableCollection collection){
        this.collection = collection;
        this.collectionSize = collection.size();
    }

    @Override
    public String getNext() {
        currentIndex++;
        return this.collection.getStringAtIndex(currentIndex);
    }

    @Override
    public boolean hasMore() {
        return currentIndex + 1 < collectionSize;
    }
}
