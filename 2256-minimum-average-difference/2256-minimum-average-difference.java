class Solution {
    public int minimumAverageDifference(int[] nums) {
        long total = 0;
        for(int num : nums)
            total += num;
        int n = nums.length;
        int min = 0;
        int min_avg = 100000;
        long sum = 0;
        for(int i = 0; i < n-1; ++i) {
            sum += nums[i];
            //System.out.println("first = " + sum/(i+1) + ", second = " + (total-sum))
            int avg = (int) Math.abs((sum / (i+1)) - ((total-sum)/(n-i-1)));
            if(avg < min_avg) {
                min_avg = avg;
                min = i;
            }
        }
        if(total/n  < min_avg) //compute for last elem here to avoid divide by zero in for loop
            min = n-1;
        return min;
    }
}