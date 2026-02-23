class Solution {
    public int trap(int[] height) {
    //     int sum = 0;
    //     int n = height.length;
    //     for(int i=0; i<n; i++){
    //       int left = max_left(height,i-1,0);
    //       int right =  max_right(height,i+1,n-1);
    //      int Minimum = Math.min(left,right);
    //       int water_Stored = Minimum - height[i];
    //       if(water_Stored > 0){
    //           sum = sum + water_Stored; 
    //       }

    //     } 
    //     return sum;
    // }

    // public int max_left(int[] height, int j, int index){
    //     if(j<0){
    //         return 0;
    //     }
    //     int max_val = height[j];
    //     for(int i=j;i>=index;i--){
    //         if(height[i]>max_val){
    //             max_val = height[i];
    //         }
    //     }
    //     return max_val;
    // }

    //  public int max_right(int[] height, int j, int index){
    //     if(j>=height.length){
    //         return 0;
    //     }
    //     int max_val = height[j];
    //     for(int i=j;i<=index;i++){
    //         if(height[i]>max_val){
    //             max_val = height[i];
    //         }
    //     }
    //     return max_val;

     int left = 0;
        int right = height.length - 1;
        // int leftMax = height[left];
        // int rightMax = height[right];
        int water = 0;

    //     while (left < right) {
    //         if (leftMax < rightMax) {
    //             left++;
    //             leftMax = Math.max(leftMax, height[left]);
    //             water += leftMax - height[left];
    //         } else {
    //             right--;
    //             rightMax = Math.max(rightMax, height[right]);
    //             water += rightMax - height[right];
    //         }
         
    //   }
    //   return water;
        int leftMax = 0;
        int rightMax = 0;
        while(left < right){
            leftMax = Math.max(leftMax,height[left]);
            rightMax = Math.max(rightMax,height[right]);

            if(leftMax < rightMax){
                water = water + (leftMax - height[left]);
                left++;
            }
            else{
                water = water + (rightMax-height[right]);
                right--;
            }
        }
       return water;
    }
}