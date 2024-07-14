import java.util.*;
public class pangram
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        char[] arr=new char[str.length()];
        for(int i=0;i<=str.length();i++)
        {
            arr[i]=str.charAt(i);
            arr[i]=str.toLowerCase()
            if((arr[i]>=65 && arr[i] <=90) || (arr[i]>=97 && arr[i]<=122))
            {
              for( char ch='a';)
            }
        }
    }
}