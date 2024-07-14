import java.util.*;
class leapyeear
{
public static void main(String[] args)
{
Scanner obj=new Scanner(System.in);
int yy=obj.nextInt();
if((yy>=1000)&&(yy<=9999)){
    if(yy%4==0)
    {
        if(yy%100==0)
        {
            if(yy%400==0)
            {
                System.out.println("leap year");
            }
            else{
                System.out.printf("not a leap year");
            }
            
        }
        else
        {
            System.out.println("leap year");
        }
    }
     else
     {
       System.out.println("not a leap year");
     }
}
else
{
  System.out.println("Invalid year");
}
}
}