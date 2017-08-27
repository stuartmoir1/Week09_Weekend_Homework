import java.util.*;
import behaviours.*;

public class ShoppingBasket{

  // Properties
  private ArrayList<Sellable> basket;
  private boolean discountApplied;
  private Float discountRate;

  // Constructor
  public ShoppingBasket(boolean discount){
    this.basket = new ArrayList<Sellable>();
    this.discountApplied = discount;
    this.discountRate = 0.02f;
  }

  // Methods

  public int getNumItems(){
    return basket.size();
  }

  public void add(Sellable item){
    basket.add(item);
  }

  public void remove(Sellable item){
    basket.remove(item);
  }

  public void clear(){
    basket.clear();
  }
}