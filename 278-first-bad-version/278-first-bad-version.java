/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        if(n==1) return n;
        int low=1;
        int high=n;
        int index=0;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(isBadVersion(mid)) high=mid-1;
            else low=mid+1;
            index=mid;
        }
        if(!isBadVersion(index)) return index+1;
        else return index;
    }
}
