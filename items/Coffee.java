package items;
//import behaviours;

// public class FreshFood extends Food implements Sellable, Edible{
public class Coffee extends Drink{

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