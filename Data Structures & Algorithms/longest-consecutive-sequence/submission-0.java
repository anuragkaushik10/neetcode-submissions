class Solution {
    public int longestConsecutive(int[] nums) {

        Set <Integer> hashSet = Arrays.stream(nums).boxed().collect(Collectors.toSet());

        int count = 0;

        for(Integer value:hashSet){
            if(!hashSet.contains(value-1)){
                int currentCount = 1;
                int currentValue = value;

                while(hashSet.contains(currentValue+1)){
                    currentValue++;
                    currentCount++;
                }

                count = Math.max(currentCount, count);
            }
        }

        return count;
    }
}
