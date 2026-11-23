class Solution {
    public boolean hasDuplicate(int[] nums) {
        int n = nums.length;
        // for(int i =0; i<n;i++){
        //     for(int j =i+1; j<n; j++){
        //         if(nums[i]==nums[j]){
        //             return true;
        //         }
        //     }
        // }
        // return false;
        // now i solve this using Hashset which cost O(n) TC

        HashSet<Integer> set = new HashSet<>();
        for(int i =0; i<n ; i++){
            if(set.contains(nums[i])){  // checking if number already exit or not 
                return true;
            }
            set.add(nums[i]); // if number not exit add in HAshSet
        }
        return false;
    }
}