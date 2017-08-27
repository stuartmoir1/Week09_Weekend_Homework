import static org.junit.Assert.*;
import org.junit.*;
import items.*;

public class FreshFoodTest{

  FreshFood freshFood;

  @Before
  public void before(){
    freshFood = new FreshFood("Cathedral City Mature", "Cheese", "Cheddar", 3.00f, false, true, false, 28);
  }

  @Test
  public void testGetFreshFoodName(){
    assertEquals("Cathedral City Mature", freshFood.getName());
  }

  @Test
  public void testGetFreshFoodType(){
    assertEquals("Cheese", freshFood.getType());
  }

  @Test
  public void testGetFreshFoodSubtype(){
    assertEquals("Cheddar", freshFood.getSubtype());
  }

  @Test
  public void testGetFreshFoodPrice(){
    assertEquals(3.00, freshFood.getPrice(), 0.02);
  }

  @Test
  public void testGetFreshFoodVegetarian(){
    assertEquals(true, freshFood.getVegetarian());
  }

  @Test
  public void testGetFreshFoodGlutenFree(){
    assertEquals(false, freshFood.getGlutenFree());
  }

  @Test
  public void testGetFreshFoodDaysUseAfterOpening(){
    assertEquals(28, freshFood.getDaysUseAfterOpening());
  }
}