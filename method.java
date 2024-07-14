import java.util.*;
class Student
{
    int roll_no;
    String name;
    void assign_value(int a,String str)
    {
        roll_no=a;
        name=str;
    }
    void assign_value1(int b,String str1)
    {
        roll_no=b;
        name=str1;
    }
    void display()
    {
        System.out.println(roll_no+" "+name);
    }
}
class main{
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        Student st=new Student();
        Student st1=new Student();
        int a=obj.nextInt();
        String str=obj.nextLine();
        int b=obj.nextInt();
        String str1=obj.nextLine();
        st.assign_value(a,str);
        st.display();
        st1.assign_value(b,str1);
        st1.display();
    }
}