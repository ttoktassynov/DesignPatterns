package stuctural_patterns.composite;

import java.util.ArrayList;

public class GiftSurpiseBox implements SurpriseBox{
    private ArrayList<SurpriseBox> surpriseBoxes;
    public GiftSurpiseBox(){
        this.surpriseBoxes = new ArrayList<>();
    }
    public void add(SurpriseBox box){
        this.surpriseBoxes.add(box);
    }
    public void remove(SurpriseBox box){
        this.surpriseBoxes.remove(box);
    }

    @Override
    public void unWrap() {
        surpriseBoxes.forEach(SurpriseBox::unWrap);
    }
}
