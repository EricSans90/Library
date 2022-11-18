public class Book {
    private String name;

    private Author author;
    private double price=0;
    private int qtyInStock;

    public Book (String name, Author author, double price, int qtyInStock){
        this.name = name;
        this.author = author;
        this.price = price;
        this.qtyInStock = qtyInStock;
    }

    public String toString(){
        return this.name+" by "+this.author;
    }
    public Author getAuthor() {
        return author;
    }
    public String getAuthorName() {
        return author.getName();
    }
    public String getAuthorEmail() {
        return author.getEmail();
    }
    public char getAuthorGender() {
        return author.getGender();
    }
}
