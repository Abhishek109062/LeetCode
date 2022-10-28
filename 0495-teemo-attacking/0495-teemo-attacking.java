class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int total = 0;
        int currentStart = -1;
        int currentEnd = -1;
        for(int attackTime: timeSeries)
            if(attackTime < currentEnd)
                currentEnd = attackTime+duration;
            else {
                total += currentEnd - currentStart;
                currentStart = attackTime;
                currentEnd = attackTime + duration;
            }
        total += currentEnd - currentStart;
        return total;
    }
}