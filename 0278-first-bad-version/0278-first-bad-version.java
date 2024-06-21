public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int start = 1;
        int end = n;
        while(start<end){
        if(isBadVersion(start+(end-start)/2)){
            end = start+(end-start)/2;
        }
        else{
            start = start+(end-start)/2 +1; 
        }
        }
        return start;
    }
}