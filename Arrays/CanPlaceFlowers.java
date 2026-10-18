package Arrays;

public class CanPlaceFlowers {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {

        if(n==0){
            return true;
        }

        int left = 0;
        int right = 0;

        for(int i=0; i<flowerbed.length; i++){


            if(i>0){
                left = flowerbed[i-1];
            }else{
                left = 0;
            }

            if(i<flowerbed.length-1){
                right = flowerbed[i+1];
            }else{
                right = 0;
            }

            if( left==0 && flowerbed[i]==0 && right==0 ){
                flowerbed[i] = 1;
                n--;
            }

            if(n==0){
                return true;
            }

        }
        return false;
    }
}
