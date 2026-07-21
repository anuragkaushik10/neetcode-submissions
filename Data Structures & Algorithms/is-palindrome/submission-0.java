class Solution {
    public boolean isPalindrome(String s) {
        String str = s.chars().
                filter(ch -> Character.isLetterOrDigit(ch)).
                mapToObj(ch -> String.valueOf((char)ch) ).
                collect(
                    Collectors.joining()
                );

        System.out.println(str.toLowerCase());

        System.out.println(new StringBuilder(str).reverse().toString().toLowerCase());

        return str.toLowerCase().equals(
            new StringBuilder(str).reverse().toString().toLowerCase()
        );
    }
}
