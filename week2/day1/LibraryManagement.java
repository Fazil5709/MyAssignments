package week2.day1;

public class LibraryManagement {
    public static void main(String[] args) {
        Library lib = new Library();
        String book1 = lib.addBook("The Great Indian Novel");
        System.out.println("The book name is: " + book1);
        lib.issueBook();
    }

}
