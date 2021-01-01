class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count=0;
        for(int i=0;i<flowerbed.length;i++){
            if(flowerbed[i]==0){
                if(i-1<0||flowerbed[i-1]==0){
                    if(i+1>=flowerbed.length||flowerbed[i+1]==0){
                        flowerbed[i]=1;
                        count++;
                    }
                }
                
            }
        }
        return count>=n;
    }
}
