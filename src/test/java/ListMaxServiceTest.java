import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class ListMaxServiceTest {

    @Test
    public void testGetMax(){
        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(1);
        arr.add(2);
        arr.add(3);

        ListMaxService testService = new ListMaxService(arr);
        Assert.assertEquals(4, testService.getMax(arr));
    }
}
