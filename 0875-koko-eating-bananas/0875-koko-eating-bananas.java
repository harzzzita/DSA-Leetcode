class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = Integer.MIN_VALUE ;
        int ans = -1;
         for(int p :piles){
            high = Math.max(p , high) ;
        }
        while(low <= high){
            int mid = (low+high)/2 ;
            if (canEat (piles , mid , h)){
                ans = mid ;
                high = mid-1 ;
            } else {
                low = mid+1 ;
            }
        }
        return ans ;
    }
    private boolean canEat (int [] piles , int banana , int h ){
        long hour = 0 ;
        for(int p : piles){
            hour += (p + banana -1) / banana ;
        }
        if(hour <= h) return true ;
        return false ;
    }

}