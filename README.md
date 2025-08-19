# aug19_2025
The problem that i solved today in leetcode

Given an integer array nums, return the number of subarrays filled with 0.

A subarray is a contiguous non-empty sequence of elements within an array.

Code:
class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long cnt=0;
        long x=0;
        for(int a:nums)
        {
            if(a==0)
                x++;
            else if(x>0)
            {
                cnt+=x*(x+1)/2;
                x=0;
            }
        }
        if(x>0)
            cnt+=x*(x+1)/2;
        return cnt;
    }
}
