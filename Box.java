/*class Calculator{
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
}*/


class Box{
	int h,b,l;
	int volume;
	Box(int h,int b,int l){
		this.h=h;
		this.b=b;
		this.l=l;
	}
	void getVolume(){
		volume=h*b*l;
		System.out.println("volume is"+volume);
	}
	public static void main(String args[]){
		Box box=new Box(3,4,5);
		box.getVolume();
	}
}