import static org.junit.Assert.*;
import org.junit.*;
import items.*;

public class LightBulbTest{

  LightBulb lightBulb;

  @Before
  public void before(){
    lightBulb = new LightBulb("LED Spotlights - 3 pack", "Lightbulb", "LED", 3.95f, 3, 50);
  }

  @Test
  public void testGetLightBulbName(){
    assertEquals("LED Spotlights - 3 pack", lightBulb.getName());
  }

  @Test
  public void testGetLightBulbType(){
    assertEquals("Lightbulb", lightBulb.getType());
  }

  @Test
  public void testGetLightBulbSubtype(){
    assertEquals("LED", lightBulb.getSubtype());
  }

  @Test
  public void testGetLightBulbPrice(){
    assertEquals(3.95, lightBulb.getPrice(), 0.02);
  }

  @Test
  public void testGetLightBulbNumInPack(){
    assertEquals(3, lightBulb.getNumInPack());
  }

  @Test
  public void testGetLightBulbInputPowerWatts(){
    assertEquals(50, lightBulb.getInputPowerWatts());
  }
}