package behavorial_patterns.iterator;

import java.util.ArrayList;
import java.util.List;

public class CustomIterableCollection implements IterableCollection {
    private List<String> data = new ArrayList<>();//1000 x 100 = 10 000 B

    public CustomIterableCollection(){
        data.add("Hello");
        data.add("World");
        data.add("From");
        data.add("IteratorCollection");
    }
    @Override
    public Iterator createIterator() {
        return new CustomIterableCollectionIterator(this);
    }

    public String getStringAtIndex(int currentIndex) {
        return data.get(currentIndex);
    }

    public int size(){
        return data.size();
    }
}
