import java.util.Scanner;
class Telephone
{
 int calls;
String a;
Double rent;
void get()
{
Scanner s = new Scanner(System.in);
System.out.println("enter name of customer");
a = s.nextLine(); 
System.out.println("enter number of calls");
calls = s.nextInt();
if(calls>300)
{ rent=calls*(0.3); }
else
{  rent=calls*(0.6); }
}
 static Telephone rentcal(Telephone ob1 , Telephone ob2)
{
   Telephone ob4 = new Telephone(); 
 if(ob1.rent>ob2.rent)
{ ob4.rent=ob1.rent;
  ob4.a=ob1.a; }
else
{  ob4.rent=ob2.rent;
  ob4.a=ob2.a; }
  return ob4;   }
void disp()
{
  System.out.println("teleohone bill of-" + a + " is" + rent );
}
}
class ABC
{
public static void main(String[] args)
{
Telephone ob1 = new Telephone();
Telephone ob2 = new Telephone();
Telephone ob3 = new Telephone();
ob1.get();
ob2.get();
ob3=Telephone.rentcal(ob1,ob2);
ob3.disp();
}
}