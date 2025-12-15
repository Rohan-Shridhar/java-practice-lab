import java.util.Scanner;

public class Book {
    String name, author;
    int price, pages;

    Book(String name, String author, int price, int pages){
        this.name=name;
        this.author=author;
        this.price=price;
        this.pages=pages;
    }

    void setName(String name){
        this.name=name;
    }
    void setAuthor(String author){
        this.author=author;
    }
    void setPrice(int price){
        this.price=price;
    }
    void setPages(int pages){
        this.pages=pages;
    }

    String getName(){
        return name;
    }
    String getAuthor(){
        return author;
    }
    int getPrice(){
        return price;
    }
    int getPages(){
        return pages;
    }
    @Override
    public String toString(){
        String Name, Author,Price,Pages;
        Name="Name of the book: "+getName()+"\n";
        Author="Author of the book: "+getAuthor()+"\n";
        Price="Price of the book: "+getPrice()+"\n";
        Pages="Number of pages: "+getPages()+"\n";
        return Name+Author+Price+Pages;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of books:");
        int n=sc.nextInt();
        Book[] books=new Book[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter details of book "+(i+1)+":");
            sc.nextLine();
            System.out.print("Enter name : ");
            String name=sc.nextLine();
            System.out.print("Enter author : ");
            String author=sc.nextLine();
            System.out.print("Enter price : ");
            int price=sc.nextInt();
            System.out.print("Enter number of pages : ");
            int pages=sc.nextInt();
            books[i]=new Book(name,author,price,pages);
        }
        System.out.println("\nBook Details:");
        for(int i=0;i<n;i++){
            System.out.println("Book "+(i+1)+":");
            System.out.println(books[i].toString());
        }
        sc.close();
    }
}
