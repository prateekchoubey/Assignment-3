import java.util.HashMap;

class Solution {
    public int singleNumber(int[] nums) {
        HashMap <Integer,Integer> map=new HashMap<>();
        int ans=0;
        for(int i=0;i<nums.length;i++)
        {
            int value=map.getOrDefault(nums[i],0);
            map.put(nums[i],value+1);
        }

        for(int i=0;i<nums.length;i++)
        {
            if(map.get(nums[i])==1)
            ans=nums[i];
        }
        return ans;
    }
}

// USING XOR

// class Solution {
//     public int singleNumber(int[] nums) {
//         int ans=0; 
//         for(int i=0; i<nums.length; i++){
//             ans ^= nums[i];  
//         }
//         return ans;    
//     }
// }