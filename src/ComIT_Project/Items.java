package ComIT_Project;

import java.util.ArrayList;

public class Items {

    private StoreItems storeItems;
    ArrayList<StoreItems> mStoreItems = new ArrayList<>();

    public Items() {
        storeItems = new StoreItems();
        storeItems.setPrice(1.5f);
        storeItems.setProductName("Jeans");
        storeItems.setCodeNumber(1);
        storeItems.setProductDescription("clothing item");

        mStoreItems.add(storeItems);


    }

    public static void main(String[] args) {
        Items items = new Items();

//    for (int i = 0; i < items.mStoreItems.size(); i++) {
//        System.out.println(" The product name is:" + items.mStoreItems.get(i).getProductName());
//        System.out.println("The product price is:" + items.mStoreItems.get(i).getPrice());
//
//    }
        Section section = new Section();
        section.addStoreItems(items.mStoreItems);
        for(StoreItems itemObj:items.mStoreItems)
        {
            System.out.println(" The product name is:" + itemObj.getProductName());
        System.out.println("The product price is:" + itemObj.getPrice());
        }


    }

}





