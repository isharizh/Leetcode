/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int s =1;
        int e = n;
        while(s<=e){
            if(isBadVersion(s + (e-s)/2) == false ){
                s = (s + (e-s)/2)+1;
            }
            else{
                e = (s + (e-s)/2)-1;
            }
        } 
        return s;  
    }
}