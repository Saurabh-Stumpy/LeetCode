class Solution {
    public int trap(int[] height) {
        int volume = 0;

        int[] lmax = new int[height.length];
        int[] rmax = new int [height.length];

        lmax[0] = height[0];
        for(int i=1;i<height.length;i++){
            lmax[i] = Math.max(lmax[i-1],height[i]);
        }

        rmax[rmax.length-1] = height[height.length-1];
        for (int i=height.length-2;i>=0;i--){
            rmax[i]= Math.max(rmax[i+1],height[i]);
        }

//        for (int element:rmax){
//            System.out.print(element +" ");
//        }
//        System.out.println();
//        for (int element:lmax){
//            System.out.print(element +" ");
//        }

        for(int i=1;i<height.length-1;i++){
            volume+= Math.min(lmax[i],rmax[i])-height[i];
        }

        return volume;
        
    }
}