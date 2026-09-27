class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int a[]=new int[2];
       List<Integer> l=new ArrayList<>();
       for(int i=-0;i<numbers.length;i++){
        for(int j=1;j<numbers.length;j++){
         if(i!=j && i+j==target && i<j){
            a[0]=i;
            a[1]=j;
      break;
         }

        }
       }
       return a; 
    }
}
