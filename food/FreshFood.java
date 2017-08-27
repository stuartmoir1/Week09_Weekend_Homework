package food;
//import behaviours;

// public class FreshFood extends Food implements Sellable, Edible{
public class FreshFood extends Food {

  // Properties
  private int daysUseAfterOpening;

  // Constructor
  public FreshFood(String name, String type, String subtype, Float price, int quantity, int daysUseAfterOpening){
    super(name, type, subtype, price, quantity);
    this.daysUseAfterOpening = daysUseAfterOpening;
  }

  // Methods

  public int getDaysUseAfterOpening(){
    return this.daysUseAfterOpening;
  }
}