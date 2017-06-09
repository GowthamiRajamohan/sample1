import java.io.*;
import java.util.*;
public class number
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int a=s.nextInt();
if(a==0)
{
System.out.println("zero");
}
else if(a%2==0)
{
System.out.println("even");
}
else
{
System.out.println("odd");
}
}
}
