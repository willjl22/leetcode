import org.junit.Test;
import org.junit.*;

public class TwoSumTest {
    @Test
    public void test(){
        TwoSum ts = new TwoSum();
        int [] arr = {2, 7, 11, 15};
        int des = 9;
        int [] ans = {0,1};
        Assert.assertArrayEquals(ans, ts.twoSum(arr, des));
    }
}
