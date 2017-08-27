import static org.junit.Assert.*;
import org.junit.*;
import items.*;

public class FabricConditionerTest{

  FabricConditioner fabricConditioner;

  @Before
  public void before(){
    fabricConditioner = new FabricConditioner("Comfort Pure Fabric Conditioner", "Laundry", "Fabric Conditioner", 3.45f, 42, 1.5f);
  }

  @Test
  public void testGetFabricConditionerName(){
    assertEquals("Comfort Pure Fabric Conditioner", fabricConditioner.getName());
  }

  @Test
  public void testGetFabricConditionerType(){
    assertEquals("Laundry", fabricConditioner.getType());
  }

  @Test
  public void testGetFabricConditionerSubtype(){
    assertEquals("Fabric Conditioner", fabricConditioner.getSubtype());
  }

  @Test
  public void testGetFabricConditionerPrice(){
    assertEquals(3.45, fabricConditioner.getPrice(), 0.02);
  }

  @Test
  public void testGetFabricConditionerNumOfUses(){
    assertEquals(42, fabricConditioner.getNumOfUses());
  }

  @Test
  public void testGetFabricConditionerSizeLitres(){
    assertEquals(1.5, fabricConditioner.getSizeLitres(), 0.02);
  }
}