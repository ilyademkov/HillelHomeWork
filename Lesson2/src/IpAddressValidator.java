import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class IpAddressValidator
{
  public static void main(String[] args)
  {
    Scanner ipAd = new Scanner(System.in);
    System.out.println("Введите ip через точку: ");
    String ip = ipAd.nextLine();
    isValid(ip);
    if (isValid(ip))
    {
      System.out.println("IP адрес валиден");
    }
    else
    {
      System.out.println("IP адрес не валиден");
    }
    System.out.println();
  }
  public static boolean isValid(String ip)
  {
    for (int i = 0; i < ip.length(); i++)
    {
      try
      {
        Pattern adr = Pattern.compile("^(25[0-5]|2[0-4][0-9]|[0-1][0-9]{2}|[0-9]{2}|[0-9])(\\.(25[0-5]|2[0-4][0-9]|[0-1][0-9]{2}|[0-9]{2}|[0-9])){3}$");
        Matcher m = adr.matcher(ip);
        return m.matches();
      }
      catch (PatternSyntaxException ex)
      {
        return false;
      }
    }
    return true;
  }
}