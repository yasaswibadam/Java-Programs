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


/*class Box{
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
}*/


public class Author {
    private String name;
    private String email;
    private char gender;

    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Author[name=" + name + ", email=" + email + ", gender=" + gender + "]";
    }
}

public class Book {
    private String name;
    private Author author;
    private double price;
    private int qtyInStock;

    public Book(String name, Author author, double price, int qtyInStock) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.qtyInStock = qtyInStock;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQtyInStock() {
        return qtyInStock;
    }

    public void setQtyInStock(int qtyInStock) {
        this.qtyInStock = qtyInStock;
    }

    @Override
    public String toString() {
        return "Book[name=" + name + ", author=" + author + ", price=" + price + ", qtyInStock=" + qtyInStock + "]";
    }

    public static void main(String[] args) {
        Author author = new Author("J.K. Rowling", "jkrowling@example.com", 'F');
        Book book = new Book("Harry Potter", author, 29.99, 1000);

        System.out.println(book);
    }
}

