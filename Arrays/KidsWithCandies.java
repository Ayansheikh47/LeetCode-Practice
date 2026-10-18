package Arrays;

import java.util.ArrayList;
import java.util.List;

public class KidsWithCandies {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int largest = 0;

        ArrayList<Boolean> result = new ArrayList<>();
        for(int i=1; i<candies.length; i++){
            if(candies[i]>candies[largest]){
                largest = i;
            }
        }

        for(int c : candies){

            if(c+extraCandies>candies[largest]){
                result.add(true);
            }else if(c+extraCandies==candies[largest]){
                result.add(true);
            }else{
                result.add(false);
            }
        }
        return result;
    }
}
