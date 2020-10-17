import java.util.ArrayList;
public class ListSumService {
    private ArrayList<Integer> myList = new ArrayList<Integer>();

    public ListSumService(ArrayList<Integer> myList) {
        this.myList = myList;
    }

    public ArrayList<Integer> getMyList() {
        return myList;
    }
    public void setMyList(ArrayList<Integer> myList) {
        this.myList = myList;
    }

    public int getSum(ArrayList<Integer> arr){
        int sum = 0;
        for(int i=0;i<this.myList.size();i++){
            sum+=myList.get(i);
        }
        return sum ;
    }
}
