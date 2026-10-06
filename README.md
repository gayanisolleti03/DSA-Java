# DSA-Java

# Day 01 – Two Sum

### Problem
Given an integer array and a target, find two indices whose values
add up to the target.

### LeetCode
Two Sum – [LeetCode](https://leetcode.com/problems/two-sum/)

### Approach
HashMap

### Complexity
Time: O(n)
Space: O(n)



### Problem

Given four integer arrays nums1, nums2, nums3 and nums4,
return the number of tuples (i, j, k, l) such that:

nums1[i] + nums2[j] + nums3[k] + nums4[l] == 0


### LeetCode

Four Sum II - LeetCode 454


### Approach

1. Calculate all possible sums of nums1 + nums2.
2. Store each sum and its frequency in a HashMap.
3. Calculate all possible sums of nums3 + nums4.
4. For every sum, find its complement using:
   
   complement = -sum

5. Check the complement in the HashMap.
6. Add its frequency to count.
7. Return the total count.


### Complexity

Time: O(n²)

Space: O(n²)

