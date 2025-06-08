import java.util.Scanner;
class Employee
{
 String n;
 String a;
 int y;
void setf(String p, String q, int r)
{
n=p;
a=q;
y=r;

}
void getf()
{
System.out.println("Name  Year of joining  Address");
System.out.println("+n");

}


}

class D8
{
public static void main(String x[])
{
 String name,address;
 int year;

Scanner s = new Scanner(System.in);
 
System.out.println("Enter Name: ");
name = s.nextLine();

System.out.println("Enter Year Of Joining: ");
year = Integer.parseInt(s.nextLine());

System.out.println("Enter Adress: ");
address =s.nextLine();

Employee e = new Employee();
e.setf(name,address,year);
e.getf();



}

}