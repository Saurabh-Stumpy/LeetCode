class Solution {
    public long minimumTime(int[] time, int totalTrips) {
        int maxTime = 0;
        
        for(int i :time){
            maxTime = Math.max(maxTime,i);
        }
        long start = 1, end = (long)maxTime * totalTrips;
        
        while(start<end){
            long mid = (start + end)/2;
            if(check(time,mid,totalTrips)){
                end = mid;
            }
            else{
                start = mid+1;
            }
        }
        return start;
    }
    
    public static boolean check(int[] time,long mid,int totalTrips){
        long trips = 0;
        for(int i:time){
            trips +=mid/i;
        }
        return trips>=totalTrips;
    }

}