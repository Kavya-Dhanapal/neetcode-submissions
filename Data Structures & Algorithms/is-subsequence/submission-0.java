class Solution {
    public boolean isSubsequence(String s, String t) {
     
     int end=0;
     int j=0;int i=0;
     for(i=0;i<s.length();i++){
        boolean a=false;
     for(j=end;j<t.length();j++){
    if(s.charAt(i)==t.charAt(j)){
       end=j+1;
      a=true;
       break;
    }
   
}
if(!a){
    return false;
}
}

return true;
}
}