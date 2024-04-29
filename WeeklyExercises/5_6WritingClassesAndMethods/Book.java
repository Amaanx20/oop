// 2) Books
//Design and implement a class called Book that contains instance data for title, author, publisher and copyright date.
//-   Define that Book constructor to accept and initialize these data.
//-   Include setter and getter methods for all instance data.
//-   Include a toString method that returns a nicely formatted, multiline description of the book.
//-   Create a driver class called Bookshelf, whose main method instantiates and updates several Book objects.
class Boook {
    private String title;
    private String author;
    private String publisher;
    private int copy_right_date;
    public Boook(String title, String author, String publisher, int copy_right_date) {
        this.title = title;
        this.author= author;
        this.publisher = publisher;
        this.copy_right_date = copy_right_date;
    }
    public String get_title(){
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String get_Author(){
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public String get_publisher(){
        return publisher;
    }
    public void setPublisher(String publisher){
        this.publisher = publisher;
    }
    public int getCopy_right_date() {
        return copy_right_date;
    }
    public void setCopy_right_date(int copy_right_date){
        this.copy_right_date = copy_right_date;
    }
    public String toString(){
        return "Title is..." + title + "Author is..." + author + "Publisher is..." + publisher + "Copyright date is..." + copy_right_date;
    }
}
class Bookshelf { public static void main(String[] args) {
        // Instantiate Boook objects
        Boook book1 = new Boook("Harry Potter and the Philosopher's Stone", "J.K. Rowling", "Bloomsbury Publishing", 1997);
        Boook book2 = new Boook("Harry Potter and the Chamber of Secrets", "J.K. Rowling", "Bloomsbury Publishing", 1998);
        System.out.println("Book 1:");
        System.out.println(book1);
        System.out.println("Book 2:");
        System.out.println(book2);
    }
}




