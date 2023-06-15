# LetsUpgrade1
majority number in array 

//We initialize two variables: count and candidate. The count variable keeps track of the count of the current candidate, and the candidate variable stores the current candidate for the majority element.
//We iterate through the array nums and perform the following steps:
//If the count is 0, we update the candidate to the current element.
//If the current element is the same as the candidate, we increment the count by 1. Otherwise, we decrement the count by 1.
//After the first iteration, the candidate variable will contain a potential majority element.
//We then verify if the candidate is indeed the majority element by counting its occurrences in the array.
//If the count is greater than len(nums) // 2, we return the candidate as the majority element. Otherwise, we return -1 to indicate that no majority element exists.
