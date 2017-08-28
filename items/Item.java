package items;

public abstract class Item{

  // Properties
  private String name;
  private String type;
  private String subtype;
  private Float price;
  private boolean bogof;

  // Constructor
  public Item(String name, String type, String subtype, Float price, boolean
      bogof){
    this.name = name;
    this.type = type;
    this.subtype = subtype;
    this.price = price;
    this.bogof = bogof;
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

  public boolean getBogof(){
    return this.bogof;
  }

  public void setBogof(boolean state){
    this.bogof = state;
  }
}