public class Prob11{
    public static void main(String[] args) {
        int [] arr = {4,2,0,6,3,2,5};
        System.out.println("hwllo");
        System.out.println(trappedWater(arr));
    }
    public static int trappedWater (int height[]){
        int n = height.length;
        //left max arr
        int leftMax[] = new int[n];
        leftMax[0] = height[0];
        for(int i=1; i<n; i++){
            leftMax[i] = Math.max(height[i],leftMax[i-1]);

        }
        //right max arr
        int rightMax [] = new int[n];
        rightMax[n-1] = height[n-1];
        for(int i=n-2; i>=0; i--){
            rightMax[i] = Math.max(height[i], rightMax[i+1]);
        }

        // loop
        int trappedRainWater = 0;
        for(int i=0; i<n; i++){
            int waterLevel = Math.min(leftMax[i],rightMax[i]);
            trappedRainWater += waterLevel - height[i];
        }
        return trappedRainWater;
    }
}