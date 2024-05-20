1. N^3 is asymptotically greater because as N approaches infinity, it is greater.
2. n(log(n))^10 doesn't affect the asymptotic behavior compared to N^2. So answer is N^2(log(n))
3. base 2 exponential function 2^(sqrt(n)) grows faster than base n polynomial function.
4. 2^(2n) grows faster than 2^n. Hence it is asymptotically greater.

Problem 2
Best case is when n is less than or equal to 3. It immediately becomes false because i starts at 2.
The time complexity is O(1).
The worst case is when n is a large prime number. The loop will run i*i>n. The time complexity is
O(sqrt(n)). The average case will be the same.