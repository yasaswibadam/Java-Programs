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


/*import java.util.*;
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
}*/

//ITERATIVE FABINOCCI

/*import java.util.*;
public class Fabinocci{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the n value:");
		int n=sc.nextInt();
		sc.close();
		if(n<=0)
			System.out.println("Enter positive number");
		else
			System.out.println("the nth fabinocci number is:" +fabinoccisearch(n));
	}
	public static int fabinoccisearch(int n){
		if(n==1)
			return 0;
		if(n==2)
			return 1;
		int a=0;
		int b=1;
		int fib=0;
		for(int i=3;i<=n;i++){
			fib=a+b;
			a=b;
			b=fib;
		}
		return fib;
	}
}*/

//N-TH PRIME

/*port java.util.Scanner;

public class NthPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n to find the n-th prime number: ");
        int n = sc.nextInt();
        sc.close();

        if (n <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            int nthPrime = findNthPrime(n);
            System.out.println("The " + n + "-th prime number is: " + nthPrime);
        }
    }

    public static int findNthPrime(int n) {
        int count = 0; // To count the number of primes found
        int number = 1; // Number to be checked for prime

        while (count < n) {
            number++;
            if (isPrime(number)) {
                count++;
            }
        }
        
        return number;
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}*/


import java.util.*;
public class SumofDigits{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the n value:");
		int n=sc.nextInt();
		int sum=0;
		int temp=n;
		while(temp!=0){
			sum+=temp%10;
			temp/=10;
		}
		System.out.println("the sum of digits:" +sum);
		sc.close();
	}
}
