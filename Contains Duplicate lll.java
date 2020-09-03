class Solution {
    public boolean containsNearbyAlmostDuplicate(int[] a, int k, int t) {
       int n=a.length;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                long s=Math.abs(1L*a[i]-a[j]);
                int v=Math.abs(i-j);
                if(s<=t)
                {
                if(v<=k)
                    return true;
                }
                
                
            }
        }
            return false;
    }
    
}
