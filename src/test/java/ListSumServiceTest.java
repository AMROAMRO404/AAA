import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
public class ListSumServiceTest {

    @Test
    public void testGetSum(){
        ArrayList<Integer> testList = new ArrayList<Integer>();
        testList.add(5);
        testList.add(5);
        testList.add(5);
        ListSumService test = new ListSumService(testList);
        int expected = test.getSum();
        int actual = 15;
        Assert.assertEquals(expected,actual);
    }
}