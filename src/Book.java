public class Book {
    private String bookName;
    private int quantityBook;//
    private int numBooksBor;//Number of books to be loaned

    public void InformationBook(){
        System.out.println("Name of Book: " + bookName + "; Quantity of book: " + quantityBook + "; Number of books to be loaned" +numBooksBor);
    }

    public int NumberOfBooksRemaining(){
        return quantityBook - numBooksBor;
    }
}
