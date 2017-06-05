import org.junit.*;
import static org.junit.Assert.*;

public class LeapYearTest {

  @Test
  public void isLeapYear_NumDivisibleBy4_true(){
    LeapYear leapYear = new LeapYear();
    assertEquals(true, leapYear.isLeapYear(2012));
  }

}
