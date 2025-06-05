import org.junit.Test;
import org.junit.*;

public class PalNumTest {
    @Test
    public void testTrue(){
        PalNum pn = new PalNum();
        int right = 12321;
        int wrong = 11121;
        Assert.assertEquals(true, pn.isPalindrome(right));
    }
    
    @Test
    public void testFalse(){
        PalNum pn = new PalNum();
        int wrong = 11121;
        Assert.assertEquals(false, pn.isPalindrome(wrong));
    }
}
