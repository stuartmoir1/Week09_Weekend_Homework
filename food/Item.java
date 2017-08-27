package food;

public abstract class Item{

  // Properties
  private String name;
  private String type;
  private String subtype;
  private Float price;

  // Constructor
  public Item(String name, String type, String subtype, Float price){
    this.name = name;
    this.type = type;
    this.subtype = subtype;
    this.price = price;
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
}