public class removeelementleetcode {
    public int removeElement(int[] nums, int val) {
        int navan = 0;  
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {  
                nums[navan] = nums[i]; 
                navan++; 
            }
        }
        return navan; 
    }
}
