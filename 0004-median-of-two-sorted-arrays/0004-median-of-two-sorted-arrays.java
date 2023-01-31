class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
    int median = (nums1.length + nums2.length)/2;
        int first = 0;
        int second  = 0;
        int i = 0 , j = 0;
        int n = nums1.length , m = nums2.length;
        while( i < n && j < m && median >=0){
            if(nums1[i] < nums2[j]){
                second = first;
                first = nums1[i++];
            }
            else{
                second = first;
                first = nums2[j++];
            }
            median--;
            //System.out.println("HES");
        }
        
        while(median >= 0 && i < n){
            second = first;
            first = nums1[i++];
            median--;
        }
        
        while(median >= 0 && j < m){
            second = first;
            first = nums2[j++];
            median--;
        }
        System.out.println(first+"\n"+second);
        if( (n+m) %2 == 0)
            return (first+second)/2.0;
        else
            return first;
        
    }
}