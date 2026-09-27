class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int a[]=new int[2];
       List<Integer> l=new ArrayList<>();
       for(int i=1;i<=numbers.length;i++){
        for(int j=1;j<=numbers.length;j++){
         if(i!=j && numbers[i-1]+numbers[j-1]==target && i<j){
            a[0]=i;
            a[1]=j;
      break;
         }

        }
       }
       return a; 
    }
}
