package com.education.arrays;

public class MaximumProductOfSubArray {

    public static int maxProduct(int[] nums) {
        int n = nums.length;
        int currentProduct;
        int totalPrevProduct = nums[0];
        int prevProduct = nums[0];
        int maxProduct = Integer.MIN_VALUE;

        if (nums.length == 1) {
            return nums[0];
        }

        for (int i = 0; i < n - 1; i++) {
            currentProduct = nums[i] * nums[i + 1];
            int value = Math.max(nums[i], nums[i + 1]);
            int prev = Math.max(totalPrevProduct, prevProduct);
            int product;
            if (currentProduct > prev) {
                product = currentProduct;
            } else {
                product = currentProduct * (prev != 0 ? prev / nums[i] : 0);
            }
            totalPrevProduct = currentProduct * (totalPrevProduct != 0 ? totalPrevProduct / nums[i] : 0);
            maxProduct = Math.max(product, maxProduct);
            maxProduct = Math.max(maxProduct, value);
            prevProduct = currentProduct;
        }
        return Math.max(totalPrevProduct, maxProduct);
    }

    public static void main(String[] args) {
        int test6 = maxProduct(new int[]{1, 0, -1, 2, 3, -5, -2}); // 24
        int test5 = maxProduct(new int[]{2, -5, -2, -4, 3}); // 24
        int test4 = maxProduct(new int[]{-1, -2, -9, -6}); // 108
        int test3 = maxProduct(new int[]{-2, 3, -4}); // 24
        int test2 = maxProduct(new int[]{3, -1, 4}); // 4
        int test1 = maxProduct(new int[]{-2, 0, -1});// 0
        int test0 = maxProduct(new int[]{-3, -1, -1});// 3
    }
}
