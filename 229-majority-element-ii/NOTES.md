_and finally return list this approch will take nlogn time and O(1) space
​
__second solution is in TC O(n) and space complexity O(1)
_we know that there can be only 2 ele which are more than n/3 in an array
_first thing is we need to capture most frequent 2 ele in arr so define ele1 & ele2 as
nums[0] initially and initiate count as 0
_once we got most freq ele then process is simple to count and if they appears more than
n/3 then push to list and return it
_solution is self explainatory go through it
​
*/
​
​
class Solution {
public List<Integer> majorityElement(int[] nums) {
// corner case
if(nums==null || nums.length==0)
return new ArrayList<>();
// as we already know that there will be 2 nos we are searching for
// so create vars to store those numbers and there count
int num1=nums[0], num2=nums[0], c1=0, c2=0;
// thransverse through the array
for(int num : nums){
// update the nums and count with each number
// if current number matches to any of nos
// then update the count
if(num==num1)       c1++;
else if(num==num2)  c2++;
// if counts are 0 update the nums
else if(c1==0){
num1=num;
c1=1;
} else if(c2==0) {
num2=num;
c2=1;
}
// if any one of above is not true
// decrease counts
else {
c1--;
c2--;
}
}