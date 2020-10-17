import java.util.ArrayList;

public class SumOverMaxService {
    private ArrayList<Integer> arr = new ArrayList<Integer>();
    private ListSumService sumService;
    private ListMaxService maxService;

    public SumOverMaxService(ArrayList<Integer> arr, ListSumService sumService, ListMaxService maxService) {
        this.arr = arr;
        this.sumService = sumService;
        this.maxService = maxService;
    }
    public int getSumOverMax(){
        return sumService.getSum(arr) / maxService.getMax(arr);
    }
}
