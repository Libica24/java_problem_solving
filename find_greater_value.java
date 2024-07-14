import java.util.*;
class greater
{
    public static void main(String[] args)
    {
        Scanner j=new Scanner(System.in);
        int a=j.nextInt();
        int b=j.nextInt();
        int c=j.nextInt();
        if(a>b)
        {
            if(a>c)
            {
                System.out.print("a is greater");
            }
            else
            {
                System.out.print("c is greater");
            }
        }    
        else
        {
           if(b>c) 
           {
            System.out.print("B is greater");
           }
           else
           {
            System.out.print("c is greater");
           }

        }

    }
}