class Solution {
    public boolean isFascinating(int n) {
        int arr[] = new int[10];
        StringBuffer s = new StringBuffer();
        s.append(n);
        s.append(2*n);
        s.append(3*n);
        char[] charArray = new char[s.length()];
        s.getChars(0, s.length(), charArray, 0);
        for(int i=0;i<s.length();i++){
            int o = Character.getNumericValue(charArray[i]);
            arr[0] = 0;
            if(arr[o]==0 && arr[0] == 0){
                arr[o] = 1;
            }else{
                return false;
            }
        }
        for(int i=1;i<10;i++){
            if(arr[i]!=1){
                return false;
            }
        }
        return true;
    }
}