Dynamic programming will be used for this lab. We will initialize an array filled with amount +1 besides
the first element which will be set to 0 since it takes 0 coins to make an amount of 0. The other elements
represent that making this amount is not possible. We loop through the coins array starting from the first
denomination up to the total amount. Each iteration we will update the array with the minimum number of
coins needed. If the amount is not possible, then we return -1. Otherwise, we return the minimum number of
coins needed.