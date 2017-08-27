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
    basket = new ShoppingBasket(true);
    cheese = new FreshFood("Cathedral City Mature", "Cheese", "Cheddar", 3.00f, true, false, 28);
    beefJoint = new FrozenFood("Slow Cooked Beef Joint", "Meat", "Beef", 5.75f, false, true, -18, 84);
    coffee = new Coffee("Taylors Lazy Sunday Coffee Beans", "Coffee", "Beans", 4.15f, true, true, "Arabica");
    wine = new Wine("Vino Lascito Sangiovese", "Wine", "Red", 6.75f, false, false, 2015, "Italy", 12.0f);
    lightBulb = new LightBulb("LED Spotlights - 3 pack", "Lightbulb", "LED", 3.95f, 3, 50);
    fabricConditioner = new FabricConditioner("Comfort Pure Fabric Conditioner", "Laundry", "Fabric Conditioner", 3.45f, 42, 1.5f);
  }

  // Initialised

  @Test public void stockStartsEmpty(){
    assertEquals(0, basket.getNumItems());
  }

  // Food

  @Test public void addCheeseToBasket(){
    basket.add(cheese);
    assertEquals(1, basket.getNumItems());
  }

  @Test public void removeCheeseFromBasket(){
    basket.add(cheese);
    basket.remove(cheese);
    assertEquals(0, basket.getNumItems());
  }

  @Test public void addBeefJointToBasket(){
    basket.add(beefJoint);
    assertEquals(1, basket.getNumItems());
  }

  @Test public void removeBeefJointFromBasket(){
    basket.add(beefJoint);
    basket.remove(beefJoint);
    assertEquals(0, basket.getNumItems());
  }

  // Drink

  @Test public void addCoffeeToBasket(){
    basket.add(coffee);
    assertEquals(1, basket.getNumItems());
  }

  @Test public void removeCoffeeFromBasket(){
    basket.add(coffee);
    basket.remove(coffee);
    assertEquals(0, basket.getNumItems());
  }

  @Test public void addWineToBasket(){
    basket.add(wine);
    assertEquals(1, basket.getNumItems());
  }

  @Test public void removeWineFromBasket(){
    basket.add(wine);
    basket.remove(wine);
    assertEquals(0, basket.getNumItems());
  }

  // Other

  @Test public void addLightBulbToBasket(){
    basket.add(lightBulb);
    assertEquals(1, basket.getNumItems());
  }

  @Test public void removeLightBulbFromBasket(){
    basket.add(lightBulb);
    basket.remove(lightBulb);
    assertEquals(0, basket.getNumItems());
  }

  @Test public void addFabricConditionerToBasket(){
    basket.add(fabricConditioner);
    assertEquals(1, basket.getNumItems());
  }

  @Test public void removeFabricConditionerFromBasket(){
    basket.add(fabricConditioner);
    basket.remove(fabricConditioner);
    assertEquals(0, basket.getNumItems());
  }

  // Add all items to/ clear all items from basket.

  @Test public void addAllItemsToBasket(){
    basket.add(cheese);
    basket.add(beefJoint);
    basket.add(coffee);
    basket.add(wine);
    basket.add(lightBulb);
    basket.add(fabricConditioner);
    assertEquals(6, basket.getNumItems());
  }

  @Test public void addClearAllItemsFromBasket(){
    basket.add(cheese);
    basket.add(beefJoint);
    basket.add(coffee);
    basket.add(wine);
    basket.add(lightBulb);
    basket.add(fabricConditioner);
    basket.clear();
    assertEquals(0, basket.getNumItems());
  }
}