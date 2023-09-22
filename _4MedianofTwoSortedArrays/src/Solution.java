import java.util.Arrays;
import java.util.Collections;

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int[] sum = new int[m+n];
        System.arraycopy(nums1, 0, sum, 0, m);
        System.arraycopy(nums2, 0, sum, m, n);
        Arrays.sort(sum);


        if ((m+n)%2==0){
            int i = (m+n)/2-1;
            int j = (m+n)/2;
            double k = (sum[i]+sum[j])/2.0;
            return (k);
        } else if ((m+n)%2!=0){
            int i = (m+n)/2-1;
            return ((sum[i]));
        }



        //if m+n even /odd


        return 0;
    }
}