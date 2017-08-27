import static org.junit.Assert.*;
import org.junit.*;
import items.*;

public class FrozenFoodTest{

  FrozenFood frozenFood;

  @Before
  public void before(){
    frozenFood = new FrozenFood("Slow Cooked Beef Joint", "Meat", "Beef", 5.75f, false, false, true, -18, 84);
  }

  @Test
  public void testGetFrozenFoodName(){
    assertEquals("Slow Cooked Beef Joint", frozenFood.getName());
  }

  @Test
  public void testGetFrozenFoodType(){
    assertEquals("Meat", frozenFood.getType());
  }

  @Test
  public void testGetFrozenFoodSubtype(){
    assertEquals("Beef", frozenFood.getSubtype());
  }

  @Test
  public void testGetFrozenFoodPrice(){
    assertEquals(5.75, frozenFood.getPrice(), 0.02);
  }

  @Test
  public void testGetFrozenFoodVegetarian(){
    assertEquals(false, frozenFood.getVegetarian());
  }

  @Test
  public void testGetFrozenFoodGlutenFree(){
    assertEquals(true, frozenFood.getGlutenFree());
  }

  @Test
  public void testGetFrozenFoodStorageTemp(){
    assertEquals(-18, frozenFood.getStorageTemp());
  }

  @Test
  public void testGetFrozenFoodStorageDays(){
    assertEquals(84, frozenFood.getStorageDays());
  }
}