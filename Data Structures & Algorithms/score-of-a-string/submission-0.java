class Solution {
    public int scoreOfString(String s) {
        char c[]=s.toCharArray();
        int sum=0;
        for(int i=0;i<c.length-1;i++){
            int a=c[i];
            int b=c[i+1];
            sum=sum+Math.abs(a-b);

        }
      return sum;
        
    }
}