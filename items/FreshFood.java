package items;
import behaviours.*;

public class FreshFood extends Food implements Sellable{

  // Properties
  private int daysUseAfterOpening;

  // Constructor
  public FreshFood(String name, String type, String subtype, Float price,
      boolean vegetarian, boolean glutenFree, int daysUseAfterOpening){
    super(name, type, subtype, price, vegetarian, glutenFree);
    this.daysUseAfterOpening = daysUseAfterOpening;
  }

  // Methods

  public int getDaysUseAfterOpening(){
    return this.daysUseAfterOpening;
  }
}