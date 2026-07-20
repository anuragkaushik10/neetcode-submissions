class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // List of map

        List < LinkedHashMap <Character, Long>> listOfMap = Arrays.stream(strs).
                                                    map(str -> str.chars().mapToObj(ch -> (char)ch).
                                                        collect(Collectors.groupingBy(val -> val, 
                                                        LinkedHashMap::new,
                                                        Collectors.counting()
                                                    ))).toList();

        List<List<String>> result = new ArrayList<>();
        boolean[] grouped = new boolean[strs.length];

        for (int i = 0; i < strs.length; i++) {

            if (grouped[i]) {
                continue;
            }

            List<String> currentGroup = new ArrayList<>();
            currentGroup.add(strs[i]);
            grouped[i] = true;

            for (int j = i + 1; j < strs.length; j++) {

                if (!grouped[j] &&
                    listOfMap.get(i).equals(listOfMap.get(j))) {

                    currentGroup.add(strs[j]);
                    grouped[j] = true;
                }
            }

            result.add(currentGroup);
        }

        return result;
    }
}
