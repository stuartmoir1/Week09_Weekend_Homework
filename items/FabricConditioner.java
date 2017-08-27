package items;
import behaviours.*;

public class FabricConditioner extends Item implements Sellable{

  // Properties
  private int numOfUses;
  private Float sizeLitres;

  // Constructor
  public FabricConditioner(String name, String type, String subtype, Float 
      price, int numOfUses, Float sizeLitres){
    super(name, type, subtype, price);
    this.numOfUses = numOfUses;
    this.sizeLitres = sizeLitres;
  }

  // Methods

  public int getNumOfUses(){
    return this.numOfUses;
  }

  public Float getSizeLitres(){
    return this.sizeLitres;
  }
}