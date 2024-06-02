/*import java.util.*;
public class FCS1{
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	int a=Integer.parseInt(sc.nextLine());
	if(a==0){
		System.out.println("the number is 0.");
	}
	if(a>0){
		System.out.println("the number is positive.");
	}
	if(a<0){
		System.out.println("the number is negative.");
	}
	}
}*/


import java.util.*;
public class FCS2{
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	int a=Integer.parseInt(sc.nextLine());
	int b=Integer.parseInt(sc.nextLine());
	if(a%10==b%10){
		System.out.println("true");
	}
	}
}