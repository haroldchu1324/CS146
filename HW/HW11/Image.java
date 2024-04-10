public class Image {
    public int[][] floodFill(int[][] image, int sr, int sc, int color)
    {
        if (image == null||image[sr][sc] == color || image.length == 0 || image[0].length == 0)
        {
            return image;
        }

        graph(image, sr, sc, image[sr][sc], color);
        return image;
    }

    private void graph(int[][] image, int row, int col, int oldColor, int newColor)
    {
        if (row < 0 || row >= image.length || col < 0 || col >= image[0].length || image[row][col] != oldColor) {
            return;
        }
        image[row][col] = newColor;

        graph(image, row + 1, col, oldColor, newColor);
        graph(image, row, col + 1, oldColor, newColor);
        graph(image, row - 1, col, oldColor, newColor);
        graph(image, row, col - 1, oldColor, newColor);
    }
}

