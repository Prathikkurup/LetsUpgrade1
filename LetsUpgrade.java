package com.example.letsupgrade1;
public class LetsUpgrade1
{
        public static int findMajorityElement(int[] nums) {
        int count = 0;
        Integer candidate = null;

        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            if (num == candidate) {
                count++;
            } else {
                count--;
            }
        }

        // Verify if the candidate is the majority element
        count = 0;
        for (int num : nums) {
            if (num == candidate) {
                count++;
            }
        }

        if (count > nums.length / 2) {
            return candidate;
        } else {
            return -1;
        }
    }

        public static void main(String[] args) {
        int[] nums = {3, 2, 3};
        int result = findMajorityElement(nums);
        System.out.println(result);  // Output: 3
    }
}

//We initialize two variables: count and candidate. The count variable keeps track of the count of the current candidate, and the candidate variable stores the current candidate for the majority element.
//We iterate through the array nums and perform the following steps:
//If the count is 0, we update the candidate to the current element.
//If the current element is the same as the candidate, we increment the count by 1. Otherwise, we decrement the count by 1.
//After the first iteration, the candidate variable will contain a potential majority element.
//We then verify if the candidate is indeed the majority element by counting its occurrences in the array.
//If the count is greater than len(nums) // 2, we return the candidate as the majority element. Otherwise, we return -1 to indicate that no majority element exists.
