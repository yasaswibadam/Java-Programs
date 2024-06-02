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



import java.util.*;
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
}
			