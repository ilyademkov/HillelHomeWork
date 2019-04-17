import java.util.Arrays;

public class ImageRotator
{
  public static void main(String[] args)
  {
    int[][] array = {{1, 2, 3}, {4, 5, 6}};
    int[][] toLeft = turnToLeft(array);
    printArray(toLeft);
  }
  private static int[][] turnToLeft(int[][] array)
  {
    int[][] resultArray = new int[array[0].length][array.length];
    for (int i = 0; i < array.length; i++)
    {
      for (int j = 0; j < array[i].length; j++)
      {
        resultArray[array[i].length - j - 1][i] = array[i][j];
      }
    }
    return resultArray;
  }
  private static void printArray(int[][] array)
  {
    System.out.println("Array = ");
    for (int i = 0; i < array.length; i++)
    {
      System.out.println(Arrays.toString(array[i]));
    }
  }
}