package java;
import java.util.*;
public class Simplei
{
    int p,t,r;
    public  Simplei(int p, int t, int r){

    
    this.p=p;
    this.t=t;
    this.r=r;
}
public double Calculatei()
{
    double si=(p*r*t)/100;
    return si;
}
public static void main(String []args){
    Scanner sc=new Scanner (System.in);
    int p1,r1,t1;
    System.out.println("enter the princiapl");
    p1=sc.nextInt();
    System.out.println("enter the rate");
    r1=sc.nextInt();
    System.out.println("enter the time");
    t1=sc.nextInt();
    Simplei si=new Simplei(p1,r1,t1);
    double result=si.Calculatei();

System.out.println("the simple interest is"+result);
}
}