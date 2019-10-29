package com.nix;

public class ContainerWithMostWater {
    public static int[] array = {1,8,6,2,5,4,8,3,7};
    public int maxArea(int[] height) {
        int max=0, left=0, right=height.length-1;
        while (left < right) {
            int area = (right-left) * Math.min(height[left], height[right]);
            max = Math.max (max, area);

            if (height[left] < height[right]) {
                int i = left;
                while (height[left] <= height[i] && left < right) left++;
            } else {
                int j = right;
                while (height[j] >= height[right] && left < right) right--;
            }
        }
        System.out.println(max);

        return max;
    }

    public static void main(String[] args) {
        ContainerWithMostWater containerWithMostWater = new ContainerWithMostWater();
        containerWithMostWater.maxArea(array);
    }
}
