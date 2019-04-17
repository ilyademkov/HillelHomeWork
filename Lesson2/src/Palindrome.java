import java.util.Scanner;
public class Palindrome
{

  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
    String s = scan.next();
    isPalindrome(s);
    if (isPalindrome(s))
    {
      System.out.println("It IS a palindrome!");
    }
    else
    {
      System.out.println("It is NOT a palindrome!");
    }
    System.out.println();
  }

  private static Boolean isPalindrome(String s)
  {
    for (int i = 0; i < s.length(); i++)
    {
      s = s.toLowerCase();
      s = s.replace(" ", "");
    }
    int n = s.length();
    for (int i = 0; i < (n / 2); ++i)
    {
      if (s.charAt(i) != s.charAt(n - i - 1))
      {
        return false;
      }
    }
    return true;
  }
}