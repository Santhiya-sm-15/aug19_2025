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