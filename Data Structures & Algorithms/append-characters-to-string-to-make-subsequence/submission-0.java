class Solution {
    public int appendCharacters(String s, String t) {
        Set<Character> set=new LinkedHashSet<>();
        char s1[]=s.toCharArray();
          char t1[]=t.toCharArray();
          int j=0;
          int i=0;
          while(i<s1.length && j< t1.length)
           {
            if(s1[i]==t1[j]){
                j++;
               }
               i++;
}
return t1.length-j;
    }
}