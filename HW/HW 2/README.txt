We set the left counter to 1 and set the right counter to n. Then we use the while loop to do the binary
search. If isBadVersion(mid) is true it means the bad version is at mid or earlier. Now we update
the right to mid and repeat the process. If false, the bad version is after the mid. Now we update
the left to mid+1 then repeat the process. When we left is equal to right, we return left since
we found the bad version.