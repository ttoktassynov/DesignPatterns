package behavorial_patterns.iterator;

import java.util.ArrayList;
import java.util.List;

public class CustomIterableCollection implements IterableCollection {
    private List<String> data = new ArrayList<>();//1000 x 1000 = 1000 000 B

    public List<String> getData() {
        return data;
    }

    public void setData(List<String> data) {
        this.data = data;
    }

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
