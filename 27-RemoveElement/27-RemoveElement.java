class Solution {
    public int removeElement(int[] nums, int val) {

        int l=nums.length;
        int index = 0;

        for(int i=0; i<l; i++){
            if(nums[i]!=val){
                nums[index]=nums[i];
                index++;
            }
        }
        return index;
        
    }
}