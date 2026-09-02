class Solution {
    public int[] getConcatenation(int[] nums) {
       List<Integer> list=new ArrayList<>();
       for(int i=0;i<nums.length;i++){
        list.add(nums[i]);
       } 
       for(int i=0;i<nums.length;i++){
        list.add(nums[i]);
       } 
       int arr[]=new int[list.size()];
       for(int i=0;i<arr.length;i++){
        arr[i]=list.get(i);
       }
       return arr;
    }
}