class Solution {
    public int[] twoSum(int[] nums, int target) {
        int len=nums.length;
        int[] arr = new int[2];
        HashMap<Integer, Integer> hashtable = new HashMap<>();
        for(int i=0;i<len;i++){
            hashtable.put(target-nums[i],i);
        }
        for(int i =0;i<len;i++){
           if(hashtable.containsKey(nums[i])&& hashtable.get(nums[i])!=i){
               arr[0]=hashtable.get(nums[i]);
               arr[1]=i;
               return arr;
           }

        }
    return arr;
 
    }
}
