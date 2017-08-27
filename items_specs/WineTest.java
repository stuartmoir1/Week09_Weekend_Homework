import static org.junit.Assert.*;
import org.junit.*;
import items.*;

public class WineTest{

  Wine wine;

  @Before
  public void before(){
    wine = new Wine("Vino Lascito Sangiovese", "Wine", "Red", 6.75f, false, false, 2015, "Italy", 12.0f);
  }

  @Test
  public void testGetWineName(){
    assertEquals("Vino Lascito Sangiovese", wine.getName());
  }

  @Test
  public void testGetWineType(){
    assertEquals("Wine", wine.getType());
  }

  @Test
  public void testGetWineSubtype(){
    assertEquals("Red", wine.getSubtype());
  }

  @Test
  public void testGetWinePrice(){
    assertEquals(6.75, wine.getPrice(), 0.02);
  }

  @Test
  public void testGetWineVegetarian(){
    assertEquals(false, wine.getVegetarian());
  }

  @Test
  public void testGetWineGlutenFree(){
    assertEquals(false, wine.getGlutenFree());
  }

  @Test
  public void testGetWineVintage(){
    assertEquals(2015, wine.getVintage());
  }

  @Test
  public void testGetWineCountry(){
    assertEquals("Italy", wine.getCountry());
  }

  @Test
  public void testGetWineAlcoholBV(){
    assertEquals(12.0, wine.getAlcoholBV(), 0.02);
  }
}