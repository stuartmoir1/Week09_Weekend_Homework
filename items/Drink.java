package items;

public abstract class Drink extends Item{

  // Properties
  private boolean vegetarian;
  private boolean glutenFree;

  // Constructor
  public Drink(String name, String type, String subtype, Float price, boolean bogof, boolean vegetarian, boolean glutenFree){
    super(name, type, subtype, price, bogof);
    this.vegetarian = vegetarian;
    this.glutenFree = glutenFree;
  }

  // Methods

  public boolean getVegetarian(){
    return this.vegetarian;
  }

  public boolean getGlutenFree(){
    return this.glutenFree;
  }
}