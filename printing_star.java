import java.util.*;
class star
{
  public static void main(String[] args)
  {  
    Scanner obj=new Scanner(System.in);
    int a=obj.nextInt();
    for(int i=0;i<=a;i++)
   {
    for (float j=0;j<=i;j+=0.5)
    {
        System.out.printf("*");
    }
    System.out.printf("\n");
   }
 }
} 