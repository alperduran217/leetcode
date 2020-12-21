package com.education.binarySearch;

public class SearchA2DMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        if( matrix.length == 0){
            return false;
        }
        if(matrix[0].length == 0){
            return false;
        }
        for(int[] nums : matrix){
            if(nums[0] <= target && nums[nums.length - 1] >= target){
                return binarySearch(nums,target);
            }
        }
        return false;
    }
    
    public boolean binarySearch(int[] nums, int target){
        int left = 0;
        int right = nums.length - 1;
        if(nums.length == 1){
            return nums[0] == target;
        }
        while(left < right){
            int mid = left +(right - left)/2;
            if(nums[mid] > target){
                right = mid;
            }
            
            if(nums[mid] < target){
                left = mid + 1;
            }
            
            if(nums[mid] == target){
                return true;
            }
            
        }

        return left == nums.length - 1 && nums[left] == target;
    }
}