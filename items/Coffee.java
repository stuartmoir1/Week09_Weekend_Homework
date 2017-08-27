package items;
import behaviours.*;

public class Coffee extends Drink implements Sellable{

  // Properties
  private String beanType;

  // Constructor
  public Coffee(String name, String type, String subtype, Float price,
      boolean vegetarian, boolean glutenFree, String beanType){
    super(name, type, subtype, price, vegetarian, glutenFree);
    this.beanType = beanType;
  }

  // Methods

  public String getBeanType(){
    return this.beanType;
  }
}