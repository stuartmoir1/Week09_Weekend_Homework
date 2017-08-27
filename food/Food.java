package food;

public abstract class Food extends Item{

  // Properties
  private boolean vegetarian;
  private boolean glutenFree;

  // Constructor
  public Food(String name, String type, String subtype, Float price,
      boolean vegetarian, boolean glutenFree){
    super(name, type, subtype, price);
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