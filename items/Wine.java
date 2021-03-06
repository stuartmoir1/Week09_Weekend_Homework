package items;
import behaviours.*;

public class Wine extends Drink implements Sellable{

  // Properties
  private int vintage;
  private String country;
  private Float alcoholBV;

  // Constructor
  public Wine(String name, String type, String subtype, Float price, boolean 
      bogof, boolean vegetarian, boolean glutenFree, int vintage, String
      country, Float alcoholBV){
    super(name, type, subtype, price, bogof, vegetarian, glutenFree);
    this.vintage = vintage;
    this.country = country;
    this.alcoholBV = alcoholBV;
  }

  // Methods

  public int getVintage(){
    return this.vintage;
  }

  public String getCountry(){
    return this.country;
  }

  public Float getAlcoholBV(){
    return this.alcoholBV;
  }
}