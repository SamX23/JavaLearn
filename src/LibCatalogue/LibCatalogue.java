package LibCatalogue;

import java.util.HashMap;
import java.util.Map;

public class LibCatalogue {

    // properties, variables
    Map<String, Book> bookCollection;
    int currentDay = 0;
    int lengthOfCheckoutPeriod = 7;
    double initialLateFee = 0.50;
    double feePerLateDay = 1.00;

    //constructors
    public LibCatalogue(Map<String, Book> collection) {
        this.bookCollection = collection;
    }

//    public LibCatalogue(Map<String, Book> collection, int lengthOfCheckoutPeriod,
//                        double initialLateFee, double feePerLateDay) {
//        this.bookCollection = collection;
//        this.lengthOfCheckoutPeriod = lengthOfCheckoutPeriod;
//        this.initialLateFee = initialLateFee;
//        this.feePerLateDay = feePerLateDay;
//    }

    //getters
    public int getCurrentDay() {
        return this.currentDay;
    }

    public Map<String, Book> getBookCollection() {
        return this.bookCollection;
    }

    public Book getBook(String bookTitle) {
        return getBookCollection().get(bookTitle);
    }

    public int getLengthOfCheckoutPeriod() {
        return this.lengthOfCheckoutPeriod;
    }

    public double getInitialLateFee() {
        return this.initialLateFee;
    }

    public double getFeePerLateDay() {
        return this.feePerLateDay;
    }

    //setters
    public void nextDay() {
        currentDay++;
    }

    public void setDay(int day) {
        currentDay = day;
    }

    //instance method

    public void checkOutBook(String title) {
        Book book = getBook(title);
        if (book.getIsCheckedOut()) {
            sorryBookAlreadyCheckedOut(book);
        } else {
            book.setIsCheckedOut(true, currentDay);
            System.out.println("You just checked out "+title+". It is due on day " +
                    (getCurrentDay()+getLengthOfCheckoutPeriod())+" .");
        }
    }

    public void returnBook(String title) {
        Book book = getBook(title);
        int dayLate = currentDay - (book.getDayCheckedout()) + getLengthOfCheckoutPeriod();
        if (dayLate > 0) {
            System.out.println("You owe the library $" + (getInitialLateFee() + dayLate + getFeePerLateDay()) +
                    " because your bank is " + dayLate + " days overdue.");
        } else {
            System.out.println("Book Returned, Thank you");
        }
        book.setIsCheckedOut(false, -1);
    }

    public void sorryBookAlreadyCheckedOut(Book book) {
        System.out.println("Sorry, " + book.getTitle() + " is already checked out." +
                " It should be back on day " + (book.getDayCheckedout() + getLengthOfCheckoutPeriod()) + ".");
    }

    public static void main(String[] args) {
        Map<String, Book> bookCollection = new HashMap<String, Book>();
        Book samy = new Book("Sami's Book", 123321, 22334455);
        Book rifka = new Book("Rifka's Book", 421232, 3131231);
        Book doy = new Book("Doy's Book", 23322, 9987981);
        bookCollection.put("Sami's Book", samy);
        bookCollection.put("cekcek", rifka);
        bookCollection.put("Tesing", doy);
        LibCatalogue lib = new LibCatalogue(bookCollection);

        lib.checkOutBook("Sami's Book");
        lib.checkOutBook("cekcek");
        lib.checkOutBook("Tesing");
        lib.nextDay();
        lib.nextDay();
        lib.checkOutBook("Sami's Book");
        lib.setDay(20);
        lib.returnBook("cekcek");
        lib.returnBook("Tesing");
        lib.returnBook("Sami's Book");
        lib.checkOutBook("Sami's Book");
    }
}
