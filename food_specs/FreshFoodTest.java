import static org.junit.Assert.*;
import org.junit.*;
import food.*;

public class FreshFoodTest{

  FreshFood freshFood;

  @Before
  public void before(){
    freshFood = new FreshFood("Cathedral City Mature", "Cheese", "Cheddar", 3.00f, 1, 3);
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
  public void testGetFreshFoodQuantity(){
    assertEquals(1, freshFood.getQuantity());
  }

  @Test
  public void testGetFreshFoodDaysUseAfterOpening(){
    assertEquals(3, freshFood.getDaysUseAfterOpening());
  }
}