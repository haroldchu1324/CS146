class Image:
    def floodFill(self, image, sr, sc, color):
        if not image or image[sr][sc] == color or len(image) == 0 or len(image[0]) == 0:
            return image

        self.graph(image, sr, sc, image[sr][sc], color)
        return image

    def graph(self, image, row, col, oldColor, newColor):
        if row < 0 or row >= len(image) or col < 0 or col >= len(image[0]) or image[row][col] != oldColor:
            return
        image[row][col] = newColor

        self.graph(image, row + 1, col, oldColor, newColor)
        self.graph(image, row, col + 1, oldColor, newColor)
        self.graph(image, row - 1, col, oldColor, newColor)
        self.graph(image, row, col - 1, oldColor, newColor)
