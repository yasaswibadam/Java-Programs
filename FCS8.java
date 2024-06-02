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


import java.util.*;
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
}



