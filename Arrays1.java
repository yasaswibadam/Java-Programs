/*import java.util.*;
public class Arrays1{
	public static void main(String args[]){
		int[] a={10,20,30,40,50};
		int max=a[0];
		int min=a[0];
		int sum=0;int avg=0;
		for(int i=0;i<a.length;i++){
			if(a[i]>max){
				max=a[i];
			}
			if(a[i]<min){
				min=a[i];
			}
			//sum=sum+a[i];
			//avg=sum/a.length;
		}
		//System.out.println(sum);
		//System.out.println(avg);
		System.out.println(max);
		System.out.println(min);

	}
}*/
	


import java.util.*;
public class Arrays1{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int[] a={10,20,30,40,50};
		System.out.println("enter a number");
		int n=sc.nextInt();
		int index=arraySearch(a,n);
		if(index!=-1){
			System.out.println("the number is found at " +index);
		}else{
			System.out.println("the number is not found");
		}
		sc.close();
	}
	public static int arraySearch(int [] a,int n){
		for(int i=0;i<a.length;i++){
			if(a[i]==n){
				return i;
			}
		}
		return -1;
	}
}