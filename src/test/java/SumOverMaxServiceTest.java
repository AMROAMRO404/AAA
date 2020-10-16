import java.util.ArrayList;
import java.util.Arrays;
import org.junit.Assert;
import org.junit.Test;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class SumOverMaxServiceTest {

    @Test
    public void testGetSumOverMax() {
        ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(8, 7, 5, 10));

        ListSumService sumMock = mock(ListSumService.class);
        ListMaxService maxMock = mock(ListMaxService.class);
        SumOverMaxService sumOverMaxService = new SumOverMaxService(list, sumMock, maxMock);
        when(sumMock.getSum()).thenReturn(30);
        when(maxMock.getMax()).thenReturn(10);
        Assert.assertEquals(3, sumOverMaxService.getSumOverMax());
    }
}
