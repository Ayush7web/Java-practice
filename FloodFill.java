import java.util.*;

class Solution {

  // DFS helper
  public void helper(int[][] image, int sr, int sc, int color, boolean[][] vis, int orgCol) {

    if (sr < 0 || sc < 0 || sr >= image.length || sc >= image[0].length
        || vis[sr][sc] || image[sr][sc] != orgCol) {
      return;
    }

    vis[sr][sc] = true;
    image[sr][sc] = color;

    helper(image, sr, sc - 1, color, vis, orgCol); // left
    helper(image, sr, sc + 1, color, vis, orgCol); // right
    helper(image, sr - 1, sc, color, vis, orgCol); // up
    helper(image, sr + 1, sc, color, vis, orgCol); // down
  }

  public int[][] floodFill(int[][] image, int sr, int sc, int color) {

    int orgCol = image[sr][sc];

    // important optimization
    if (orgCol == color)
      return image;

    boolean[][] vis = new boolean[image.length][image[0].length];

    helper(image, sr, sc, color, vis, orgCol);

    return image;
  }

  // main method (inside class)
  public static void main(String[] args) {
    Solution obj = new Solution();

    int[][] image = {
        { 1, 1, 1 },
        { 1, 1, 0 },
        { 1, 0, 1 }
    };

    int sr = 1, sc = 1, color = 4;

    int[][] result = obj.floodFill(image, sr, sc, color);

    // print result
    for (int i = 0; i < result.length; i++) {
      for (int j = 0; j < result[0].length; j++) {
        System.out.print(result[i][j] + " ");
      }
      System.out.println();
    }
  }
}