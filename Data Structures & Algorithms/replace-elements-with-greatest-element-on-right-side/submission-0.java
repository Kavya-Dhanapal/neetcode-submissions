class Solution {
    public int[] replaceElements(int[] arr) {
      
        for(int i=0;i<arr.length-1;i++){
           int a=0;
            for(int j=i+1;j<arr.length;j++){
               if(arr[j]>a){
                a=arr[j];
               }
            }
            arr[i]=a;
        }
        arr[arr.length-1]=-1;
        return arr;
    }
}