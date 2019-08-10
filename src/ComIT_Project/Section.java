package ComIT_Project;

import java.util.ArrayList;

public class Section {

    ArrayList<StoreItems> mStoreItems  = new ArrayList<>();
    public boolean addStoreItems (StoreItems  storeItems)
    {
        mStoreItems.add(storeItems);
        return true;

    }
    public boolean addStoreItems (ArrayList<StoreItems>  storeItems)
    {
        mStoreItems=storeItems;
        return true;

    }
}
