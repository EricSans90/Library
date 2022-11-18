public class TestBook {
    public static void main (String[] argv){

        Author anAuthor = new Author("Tan Ah Teck", "ahtack@somewhere.com", 'm');
        Book aBook = new Book ("Java for dummy", anAuthor, 19.95, 1000);
        System.out.println(anAuthor);
        System.out.println(aBook.toString());
        System.out.println(aBook.getAuthor().getName());
        System.out.println(aBook.getAuthor().getEmail());
        System.out.println(aBook.getAuthorName());
        System.out.println(aBook.getAuthorEmail());
        Author favourite = new Author("Eiichiro Oda", "eiichiroOdaShūeisha@invented.jp", 'm');

        Book [] myLibrary = new Book [5];
        myLibrary [0] = new Book("Romance Dawn: Bōken no Yoake", favourite, 9.99, 100);
        myLibrary [1] = new Book("Bagī Kaizoku-Dan", favourite, 9.99, 100);
        myLibrary [2] = new Book("Itsuwarenu Mono", favourite, 9.99, 100);
        myLibrary [3] = new Book("Mikazuki", favourite, 9.99, 100);
        myLibrary [4] = new Book("Tagatameni Kane wa Naru", favourite, 9.99, 100);

        //Printing array of books
        for (int i = 0; (i < 5); i++) {
            System.out.println(myLibrary[i]);
        }
    }
}
