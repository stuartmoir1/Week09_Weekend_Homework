import static org.junit.Assert.*;
import org.junit.*;
import behaviours.*;
import items.*;

public class ShoppingBasketTest{

  ShoppingBasket basket;
  Sellable cheese;
  Sellable beefJoint;
  Sellable coffee;
  Sellable wine;
  Sellable lightBulb;
  Sellable fabricConditioner;

  @Before public void before(){
    basket = new ShoppingBasket();
    cheese = new FreshFood("Cathedral City Mature", "Cheese", "Cheddar", 3.00f, false, true, false, 28);
    beefJoint = new FrozenFood("Slow Cooked Beef Joint", "Meat", "Beef", 5.75f, false, false, true, -18, 84);
    coffee = new Coffee("Taylors Lazy Sunday Coffee Beans", "Coffee", "Beans", 4.15f, false, true, true, "Arabica");
    wine = new Wine("Vino Lascito Sangiovese", "Wine", "Red", 6.75f, false, false, false, 2015, "Italy", 12.0f);
    lightBulb = new LightBulb("LED Spotlights - 3 pack", "Lightbulb", "LED", 3.95f, false, 3, 50);
    fabricConditioner = new FabricConditioner("Comfort Pure Fabric Conditioner", "Laundry", "Fabric Conditioner", 3.45f, false, 42, 1.5f);
  }

  // Initialised
  @Test
  public void testBasketStartsEmpty(){
    assertEquals(0, basket.getNumItems());
  }

  // Discount

  @Test
  public void testBasketDiscountAppliedFalse(){
    assertEquals(false, basket.getDiscountApplied());
  }

  @Test
  public void testBasketDiscountAppliedTrue(){
    basket.setDiscountApplied(true);
    assertEquals(true, basket.getDiscountApplied());
  }

  // Food

  @Test
  public void testCheeseToBasket(){
    basket.add(cheese);
    assertEquals(1, basket.getNumItems());
  }

  @Test
  public void testRemoveCheeseFromBasket(){
    basket.add(cheese);
    basket.remove(cheese);
    assertEquals(0, basket.getNumItems());
  }

  @Test
  public void testAddBeefJointToBasket(){
    basket.add(beefJoint);
    assertEquals(1, basket.getNumItems());
  }

  @Test
  public void testRemoveBeefJointFromBasket(){
    basket.add(beefJoint);
    basket.remove(beefJoint);
    assertEquals(0, basket.getNumItems());
  }

  // Drink

  @Test
  public void testAddCoffeeToBasket(){
    basket.add(coffee);
    assertEquals(1, basket.getNumItems());
  }

  @Test
  public void testRemoveCoffeeFromBasket(){
    basket.add(coffee);
    basket.remove(coffee);
    assertEquals(0, basket.getNumItems());
  }

  @Test
  public void testAddWineToBasket(){
    basket.add(wine);
    assertEquals(1, basket.getNumItems());
  }

  @Test
  public void testRemoveWineFromBasket(){
    basket.add(wine);
    basket.remove(wine);
    assertEquals(0, basket.getNumItems());
  }

  // Other

  @Test
  public void testAddLightBulbToBasket(){
    basket.add(lightBulb);
    assertEquals(1, basket.getNumItems());
  }

  @Test
  public void testRemoveLightBulbFromBasket(){
    basket.add(lightBulb);
    basket.remove(lightBulb);
    assertEquals(0, basket.getNumItems());
  }

  @Test
  public void testAddFabricConditionerToBasket(){
    basket.add(fabricConditioner);
    assertEquals(1, basket.getNumItems());
  }

  @Test
  public void testRemoveFabricConditionerFromBasket(){
    basket.add(fabricConditioner);
    basket.remove(fabricConditioner);
    assertEquals(0, basket.getNumItems());
  }

  // Add all items to/ clear all items from basket.

  @Test
  public void testAddAllItemsToBasket(){
    basket.add(cheese);
    basket.add(beefJoint);
    basket.add(coffee);
    basket.add(wine);
    basket.add(lightBulb);
    basket.add(fabricConditioner);
    assertEquals(6, basket.getNumItems());
  }

  @Test
  public void testAddClearAllItemsFromBasket(){
    basket.add(cheese);
    basket.add(beefJoint);
    basket.add(coffee);
    basket.add(wine);
    basket.add(lightBulb);
    basket.add(fabricConditioner);
    basket.clear();
    assertEquals(0, basket.getNumItems());
  }

  // Price

  @Test
  public void testBasketGetTotalPrice2Items(){
    basket.add(cheese);
    basket.add(beefJoint);
    assertEquals(8.75, basket.getTotalPrice(), 0.02);
  }

  @Test
  public void testBasketGetTotalPrice3ItemsCheeseBogofTrue(){
    //System.out.println(cheese.getBogof());
    cheese.setBogof(true);
    basket.add(cheese);
    basket.add(cheese); // Free
    basket.add(beefJoint);
    assertEquals(8.75, basket.getTotalPrice(), 0.02);
  }

  // @Test
  // public void testBasketGetTotalPrice4ItemsCheeseBogofTrue(){
  //   cheese.setBogof(true);
  //   basket.add(cheese);
  //   basket.add(cheese); // Free
  //   basket.add(cheese);
  //   basket.add(beefJoint);
  //   assertEquals(11.75, basket.getTotalPrice(), 0.02);
  // }

  // @Test
  // public void testBasketGetTotalPrice5ItemsCheeseBogofTrue(){
  //   cheese.setBogof(true);
  //   basket.add(cheese);
  //   basket.add(cheese); // Free
  //   basket.add(cheese);
  //   basket.add(beefJoint);
  //   basket.add(coffee);
  //   assertEquals(15.90, basket.getTotalPrice(), 0.02);
  // }

  // @Test
  // public void testBasketGetTotalPrice5ItemsCheeseBogofTrue(){
  //   cheese.setBogof(true);
  //   basket.add(cheese);
  //   basket.add(cheese); // Free
  //   basket.add(cheese);
  //   basket.add(beefJoint);
  //   basket.add(coffee);
  //   basket.add(wine);
  //   assertEquals(22.65, basket.getTotalPrice(), 0.02);
  // }

  // @Test
  // public void testBasketGetTotalPrice5ItemsCheeseBogofTrueDiscountApplied(){
  //   cheese.setBogof(true);
  //   basket.add(cheese);
  //   basket.add(cheese); // Free
  //   basket.add(cheese);
  //   basket.add(beefJoint);
  //   basket.add(coffee);
  //   basket.add(wine);
  //   basket.setDiscountApplied(true);
  //   assertEquals(18.12, basket.getTotalPrice(), 0.02)
}



























