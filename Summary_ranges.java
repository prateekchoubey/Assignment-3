// import java.util.ArrayList;
// import java.util.List;

// class Solution {
//     public List<String> summaryRanges(int[] nums) {
//         List<String> l=new ArrayList<>();
//         int start=0;
//         for(int i=0;i<nums.length;i++)
//         {
//             if(nums[i+1]-nums[i]!=1)
//             {
//                 if(start==i)
//                 {
//                     String str=""+nums[i];
//                     l.add(str);
//                 }
//                 else
//                 {
//                     String str1=""+nums[start];
//                     String str2=""+nums[i];
//                     l.add(str1+"->"+str2);
//                 }
//             }
//             start=i;
//         }
//         return l;
//     }
// }

class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> result = new ArrayList<>();
        
        for (int i = 0; i < nums.length; i++) {
            int start = nums[i];
            while (i < nums.length - 1 && nums[i] + 1 == nums[i + 1]) {
                i++;
            }
            if (start != nums[i]) {
                result.add(start + "->" + nums[i]);
            } else {
                result.add(Integer.toString(start));
            }
        }
        
        return result;
    }
}
