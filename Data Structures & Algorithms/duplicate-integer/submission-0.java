class Solution {
    public boolean hasDuplicate(int[] nums) {
        Map <Integer, Long> hm = Arrays.stream(nums).boxed().
                                    collect(Collectors.groupingBy(
                                        num -> num, Collectors.counting()
                                    ));

        for(Map.Entry<Integer, Long> entry : hm.entrySet()){
            if(entry.getValue() > 1) return true;
        }

        return false;
    }
}