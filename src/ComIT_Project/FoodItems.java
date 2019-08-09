package ComIT_Project;

import java.util.ArrayList;

public class FoodItems  {

    private StoreItems storeItems;
    ArrayList<StoreItems> mStoreItems=new ArrayList<>();

    public FoodItems() {
        storeItems = new StoreItems();
        storeItems.setPrice(1.5f);
        storeItems.setProductName("Jeans");
        storeItems.setCodeNumber(1);
        storeItems.setProductDescription("clothing item");

        mStoreItems.add(storeItems);


    }
}





