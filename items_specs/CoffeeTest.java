import static org.junit.Assert.*;
import org.junit.*;
import items.*;

public class CoffeeTest{

  Coffee coffee;

  @Before
  public void before(){
    coffee = new Coffee("Taylors Lazy Sunday Coffee Beans", "Coffee", "Beans", 4.15f, false, true, true, "Arabica");
  }

  @Test
  public void testGetCoffeeName(){
    assertEquals("Taylors Lazy Sunday Coffee Beans", coffee.getName());
  }

  @Test
  public void testGetCoffeeType(){
    assertEquals("Coffee", coffee.getType());
  }

  @Test
  public void testGetCoffeeSubtype(){
    assertEquals("Beans", coffee.getSubtype());
  }

  @Test
  public void testGetCoffeePrice(){
    assertEquals(4.15, coffee.getPrice(), 0.02);
  }

  @Test
  public void testGetCoffeeBogof(){
    assertEquals(false, coffee.getBogof());
  }

  @Test
  public void testSetCoffeeBogof(){
    coffee.setBogof(true);
    assertEquals(true, coffee.getBogof());
  }

  @Test
  public void testGetCoffeeVegetarian(){
    assertEquals(true, coffee.getVegetarian());
  }

  @Test
  public void testGetCoffeeGlutenFree(){
    assertEquals(true, coffee.getGlutenFree());
  }

  @Test
  public void testGetCoffeeCountry(){
    assertEquals("Arabica", coffee.getBeanType());
  }
}