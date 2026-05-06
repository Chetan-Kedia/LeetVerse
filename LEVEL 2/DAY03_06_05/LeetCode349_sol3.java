import java.util.*;
class Solution3
{
    public int[] intersection(int[] nums1, int[] nums2){
        HashSet<Integer> s1=new HashSet<>();
        HashSet<Integer> res=new HashSet<>();
        for(int n:nums1)
        {
            s1.add(n);
        }
        for(int n:nums2)
        {
            if(s1.contains(n))
            res.add(n);
        }
        int r[]=new int[res.size()];
        int i=0;
        for(int n:res)
        r[i++]=n;

        return r;
    }
}




        
