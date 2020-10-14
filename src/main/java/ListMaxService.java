import java.util.ArrayList;

public class ListMaxService {

    private ArrayList<Integer> arr = new ArrayList<Integer>();

    public ListMaxService(ArrayList<Integer> arr){
        this.arr = arr;
    }

    public int getMax(){
        int max = Integer.MIN_VALUE;
        for(int i=0; i<arr.size(); i++){
            if(arr.get(i)>max){
                max=arr.get(i);
            }
        }
        return max;
    }
}

