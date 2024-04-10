The floodfill method will first check for edge cases where the image is null or the 2D array given is
empty or if the coordinates given is already the same color as the color given in the parameter. If
any of these conditions suffice, we will return the exact same image and make no change. Else, we
will recursively check 4 directions north, south, east, west of the starting coordinates and only
return if they are on the edges of the matrix and hit the maximum row or column. As long as it is
within bounds, the color will change to the given color in the parameter.