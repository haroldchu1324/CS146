1. The best case for Insertion sort is when the array is already sorted. The time complexity is O(n).
The worst case is when the array is reverse sorted with time complexity of O(n^2). This is because
every element in the array needs to be moved to the beginning of the array. The average time complexity
is also O(n^2).

2. The best case is when matrices A and B's product and the addition operation is completed with just one.
The worst case is when the matrices A and B results in maximum operations. The time complexity is
O(rowsA*colA*colB). The average case is the same. The outer loops iterate over each element of the
matrix result, which has dimensions rowsA x colsB. For each element result[i][j], it requires
colsA multiplications and additions.