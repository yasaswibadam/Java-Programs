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


/*import java.util.*;
public class FCS2{
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	int a=Integer.parseInt(sc.nextLine());
	int b=Integer.parseInt(sc.nextLine());
	if(a%10==b%10){
		System.out.println("true");
	}
	}
}*/


/*import java.util.*;
public class FCS3{
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	int a=Integer.parseInt(sc.nextLine());
	if(a%2==0){
		System.out.println("Even");
	}
	if(a%2!=0){
		System.out.println("Odd");
	}
	}
}*/


/*import java.util.*;
public class FCS5{
	public static void main(String args[]){
	char ch='8';
	if(Character.isLetter(ch)){
		System.out.println("ALPHABET");
	}
	if(Character.isDigit(ch)){
		System.out.println("DIGIT");
	}
	else{
		System.out.println("SPECIAL CHARACTER");
	}
	}
}*/


/*import java.util.*;
public class FCS8{
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the colourcode(R,G,B,O,Y,W):");
	char colourcode=sc.next().charAt(0);
	switch(colourcode){
		case 'R':
			System.out.println("RED");
			break;
		case 'G':
			System.out.println("GREEN");
			break;
		case 'B':
			System.out.println("BLUE");
			break;
		case 'O':
			System.out.println("ORANGE");
			break;
		case 'Y':
			System.out.println("YELLOW");
			break;
		case 'W':
			System.out.println("WHITE");
			break;
		default: 
			System.out.println("Invalid");
			break;
		}
	sc.close();
 	}
}*/


/*import java.util.*;
public class FCS11{
	public static void main(String args[]){
	for(int i=23;i<=57;i++){
		if(i%2==0){
			System.out.println(i);
		}
	}	
	}
}*/


/*import java.util.*;
public class FCS14{
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
 	int sum=0;
	for(int i=n;i!=0;i=i/10){
		sum=sum+i%10;
	}
	System.out.println(sum);
	sc.close();
	}
}*/

/*import java.util.*;
public class FCS16{
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int reversed=0;
	while(n!=0){
		int digit=n%10;
		reversed=reversed*10+digit;
		n=n/10;
	}
	System.out.println(reversed);
	sc.close();
	}
}*/


import java.util.*;
public class FCS12{
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	boolean isPrime=true;
	if(n<1){
		isPrime=false;
	}else {
		for(int i=2;i<=n/2;i++){
			if(n%i==0){
				isPrime=false;
				break;
			}
		}
	}
	if(isPrime){
		System.out.println(n+" is a prime number");
	}
	else{
		System.out.println(n+" is not prime number");
	}
	}
}