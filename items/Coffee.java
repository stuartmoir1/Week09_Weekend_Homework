package items;
import behaviours.*;

public class Coffee extends Drink implements Sellable{

  // Properties
  private String beanType;

  // Constructor
  public Coffee(String name, String type, String subtype, Float price, 
      boolean bogof, boolean vegetarian, boolean glutenFree, String beanType){
    super(name, type, subtype, price, bogof, vegetarian, glutenFree);
    this.beanType = beanType;
  }

  // Methods

  public String getBeanType(){
    return this.beanType;
  }
}