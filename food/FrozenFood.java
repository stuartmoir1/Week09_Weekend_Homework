package food;
//import behaviours;

// public class FreshFood extends Food implements Sellable, Edible{
public class FrozenFood extends Food {

  // Properties
  private int storageTemp;
  private int storageDays;

  // Constructor
  public FrozenFood(String name, String type, String subtype, Float price,
      boolean vegetarian, boolean glutenFree, int storageTemp,
      int storageDays){
    super(name, type, subtype, price, vegetarian, glutenFree);
    this.storageTemp = storageTemp;
    this.storageDays = storageDays;
  }

  // Methods

  public int getStorageTemp(){
    return this.storageTemp;
  }

  public int getStorageDays(){
    return this.storageDays;
  }
}