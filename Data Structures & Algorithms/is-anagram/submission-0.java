class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length() != t.length()){
            return false;
        }

        Map<Character, Long> string1 = s.chars().
                                        mapToObj(ch -> (char) ch).
                                        collect(Collectors.groupingBy(cha -> cha, 
                                            Collectors.counting()
                                        ));

        Map<Character, Long> string2 = t.chars().
                                        mapToObj(ch -> (char) ch).
                                        collect(Collectors.groupingBy(cha -> cha, 
                                            Collectors.counting()
                                        ));

        return string1.equals(string2);
    }
}
