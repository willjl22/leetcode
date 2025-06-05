import org.junit.Test;
import org.junit.*;

public class RomanToIntTest {
    @Test
    public void testTrue(){
        RomanToInt rti = new RomanToInt();
        String numeral = "VIII";
        Assert.assertEquals(8, rti.romanToInt(numeral));
    }
}
