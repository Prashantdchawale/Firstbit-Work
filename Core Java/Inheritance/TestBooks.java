class Book {
    String title;
    String author;

    Book() {
        this.title = "Shyamchi Aai";
        this.author = "Sane Guruji";
    }

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    String getTitle() {
        return title;
    }

    void setTitle(String title) {
        this.title = title;
    }

    String getAuthor() {
        return author;
    }

    void setAuthor(String author) {
        this.author = author;
    }

    void display() {
        System.out.println(">>Book Title : " +title);
        System.out.println(">>Author     : " +author);
    }
}//class Book ends here


class TextBook extends Book {
    String subject;
    String type; // e.g., Science, Math

    TextBook() {
        super();
        this.subject = "General";
        this.type = "Education";
        System.out.println("TextBook Default Constructor");
    }

    TextBook(String title, String author, String subject, String type) {
        super(title, author);
        this.subject = subject;
        this.type = type;
        System.out.println("TextBook Parameterized Constructor");
    }

    String getSubject() {
        return subject;
    }

    void setSubject(String subject) {
        this.subject = subject;
    }

    String getType() {
        return type;
    }

    void setType(String type) {
        this.type = type;
    }

    void display() {
        super.display();
        System.out.println("Subject : "+subject);
        System.out.println("Type    : "+type);
    }
}//class TextBook ends here


class Printing extends Book {
    boolean blackAndWhite; 

    Printing() {
        super();
        this.blackAndWhite = true;
        System.out.println("Printing Default Constructor");
    }

    Printing(String title, String author, boolean blackAndWhite) {
        super(title, author);
        this.blackAndWhite = blackAndWhite;
        System.out.println("Printing Parameterized Constructor");
    }

    boolean isBlackAndWhite() {
        return blackAndWhite;
    }

    void setBlackAndWhite(boolean blackAndWhite) {
        this.blackAndWhite = blackAndWhite;
    }

    void display() {
        super.display();
        System.out.println("Printing Type: " +(blackAndWhite ? "Black & White" : "Colored"));
    }
}//class Printing ends here


class TestBook {
    public static void main(String[] args) {
        Book b1 = new Book();
        b1.display();
        System.out.println();

        TextBook tb1 = new TextBook("Numerical Apptitude", "R.S.Sharma", "Math", "Compitative Exam");
        tb1.display();
        System.out.println();

        Printing pr1 = new Printing("The War of Cry", "John Smith", false);
        pr1.display();
    }
}
