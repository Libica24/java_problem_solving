import java.util.*;
class sample
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int c=0,a=0;
        int[] arr=new int[size];
        for(int i=0;i<size;i++){
        arr[i]=sc.nextInt();
        int a=10,b=0;
        int d=0;
        }
        try{
          d=a/b;
          System.out.print(d);

        for(int i=0;i<size;i++)
        {
          for( int j=0;j<size;j++)
          {
            if(arr[i]==arr[j]&&j!=i)
           { 
            a=arr[i];
              c=1;
              break;
           }
          }
        }
        }
        catch(arithmatic exception e){
          System.out.print("exception occured");
        
        if(c==1)
        {
          System.out.println("duplicate value is :"+a);
        }
        else{
          System.out.println("no duplicate");
        }
        }

      }


    }

