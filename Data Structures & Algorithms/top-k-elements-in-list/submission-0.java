class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // [1, 2, 2, 3, 3, 3], k = 2

        LinkedHashMap <Integer, Long> freq = Arrays.stream(nums).boxed().
                                        collect(Collectors.groupingBy(num -> num,
                                                LinkedHashMap::new,
                                                Collectors.counting()
                                            )
                                        ).entrySet().stream().sorted(
                                            Map.Entry.<Integer, Long>comparingByValue().reversed()
                                        ).collect(Collectors.toMap(
                                                Map.Entry::getKey,
                                                Map.Entry::getValue,
                                                (oldValue, newValue) -> oldValue,
                                                LinkedHashMap::new
                                        ));

        System.out.println(freq);
        int arr[] = new int[k];
        int i = 0;

        for(Map.Entry<Integer, Long> entry : freq.entrySet()){
            if(i < k){
                arr[i] = entry.getKey();
                i++;
            }
        }

        return arr;
    }
}
