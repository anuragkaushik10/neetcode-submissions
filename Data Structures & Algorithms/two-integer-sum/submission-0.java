class Solution {

    public boolean isSumEqual(int a, int b, int target){
        return a + b == target;
    }

    public int[] twoSum(int[] nums, int target) {
        int arr[] = new int[2];

        for(int i = 0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                if(isSumEqual(nums[i], nums[j], target)){
                    arr[0] = i;
                    arr[1] = j;
                    return arr;
                }
            }
        }

        arr[0] = -1;
        arr[1] = -1;

        return arr;
       
    }
}
