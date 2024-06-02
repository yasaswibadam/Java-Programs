class Calculator{
	public static void static1(int a,int b){
		a=2;
		b=3;
		System.out.println(Math.pow(a,b));
	}
	public static void static2(double x,double y){
		x=25;
		y=10;
		System.out.println(Math.pow(x,y));
	}
	public static void main(String args[]){
		static1(0,0);
		static2(0,0);
	}
}