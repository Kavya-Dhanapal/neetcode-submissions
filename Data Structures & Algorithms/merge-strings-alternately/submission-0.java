class Solution {
    public String mergeAlternately(String word1, String word2) {
        String s="";
        int l=0;
        int r=0;
        if(word1.length()>word2.length()){
        l=word2.length();
       
        }
        else {
            l=word1.length();

        }
        for(int i=0;i<l;i++){
            s=s+word1.charAt(i);
             s=s+word2.charAt(i);
        }
      if(l<word1.length()){
        for(int i=l;i<word1.length();i++){
            s=s+word1.charAt(i);
        }
        
      }
      else{
        for(int i=l;i<word2.length();i++){
            s=s+word2.charAt(i);
        }
        
      }
      return s;
    }
}