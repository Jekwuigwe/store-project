package ComIT_Project;

import java.util.ArrayList;

public class Aisle {

    ArrayList<Section> mSection= new ArrayList<>();

    public boolean addSection (Section section){
        mSection.add(section);
                return true;
    }
    public ArrayList<Section> getSections()
    {
        return mSection;
    }
}
