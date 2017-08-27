package items;
import behaviours.*;

public class LightBulb extends Item implements Sellable{

  // Properties
  private int numInPack;
  private int inputPowerWatts;

  // Constructor
  public LightBulb(String name, String type, String subtype, Float price, 
      boolean bogof, int numInPack, int inputPowerWatts){
    super(name, type, subtype, price, bogof);
    this.numInPack = numInPack;
    this.inputPowerWatts = inputPowerWatts;
  }

  // Methods

  public int getNumInPack(){
    return this.numInPack;
  }

  public int getInputPowerWatts(){
    return this.inputPowerWatts;
  }
}