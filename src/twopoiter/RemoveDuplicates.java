package twopoiter;

import java.util.HashMap;

public class RemoveDuplicates {

    public int removeDuplicates(int[] nums) {
        int count =1;
        int index = 1;
        for(int i=1;i<=nums.length-1;i++){
            if(nums[i]!=nums[i-1]){
                count++;
                nums[index]= nums[i];
                index++;
            }

        }
        return count;

    }

}
