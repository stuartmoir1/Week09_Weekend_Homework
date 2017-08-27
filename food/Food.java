package food;

public abstract class Food{

  // Properties
  private String name;
  private String type;
  private String subtype;
  private Float price;
  private int quantity;

  // Constructor
  public Food(String name, String type, String subtype, Float price, int quantity){
    this.name = name;
    this.type = type;
    this.subtype = subtype;
    this.price = price;
    this.quantity = quantity;
  }

  // Methods

  public String getName(){
    return this.name;
  }

  public String getType(){
    return this.type;
  }

  public String getSubtype(){
    return this.subtype;
  }

  public Float getPrice(){
    return this.price;
  }

  public int getQuantity(){
    return this.quantity;
  }
}