/*import java.util.*;
public class Iseven{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(n%2==0)
			System.out.println("Even");
		else
			System.out.println("Odd");
	}
}*/


/*import java.util.*;
public class Lastdigit{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(n>=0)
			System.out.println("the last digit is:" +(n%10));
		else
			System.out.println("the last digit is:" +((-1)*n%10));
		sc.close();
	}
}*/


/*import java.util.*;
public class Last2nddigit{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int x,y;
		int n=sc.nextInt();
		x=n/10;
		y=x%10;
		if(n>=0)
			System.out.println("the last 2nd digit is:" +y);
		else
			System.out.println("the last 2nd digit is:" +(-1)*y);
		sc.close();
	}
}*/



/*import java.util.*;
public class Sumlast2digits{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int x,y,z;
		int n=sc.nextInt();
		x=n/10;
		y=x%10;
		z=n%10;
		if(n>=0)
			System.out.println("the sum of last 2nd digits is:" +(y+z));
		else
			System.out.println("the sum of last 2nd digits is:" +(-1)*(y+z));
		sc.close();
	}
}*/


/*import java.util.*;
public class Multiple{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the n value:");
		int n=sc.nextInt();
		System.out.println("Enter the m value:");
		int m=sc.nextInt();
		if(n>=m && n%m==0)
			System.out.println("n is exact multiple of m");
		else
			System.out.println("not eaxct multiple");

	}
}*/


/*import java.util.*;
public class M1{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int count=0;
		System.out.println("enter the 5 numbers:");
		for(int i=0;i<5;i++){
			int n=sc.nextInt();
			if(n%2!=0){
				System.out.println("odd");
				count++;
			}
		}
		System.out.println("the no.of odd numbers are:" +count);
		sc.close();
	}
}*/


import java.util.*;
public class Factorial{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the n value:");
		int n=sc.nextInt();
		int factorial=1;
		for(int i=1;i<=n;i++){
			factorial=factorial*i;
		}
		System.out.println(factorial);
		sc.close();
	}
}