package java;
import java.util.*;
public class TwinPrimenumber {
    public boolean checkPrime(int num){
int count=0;
for(int i=1;i<=num;i++)
{
    if(num%i==0)
    {
        count++;
    }
}
if(count==2)
{
    return true;

}
else
{
    return false;
}
    }

    
}
public static void main(String [] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the first number");
    int num1=sc.nextInt();
    System.out.println("enter the Second number");
    int num2=sc.nextInt();
TwinPrimenumber twin=new TwinPrimenumber(num)

}
