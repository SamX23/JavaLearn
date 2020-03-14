package LibCatalogue;
public class Book {

    //Properties, field, global varibles
    String title;
    int pageCount;
    int ISBN;
    boolean isCheckedOut;
    int dayCheckedout = -1;

    //constructor
    public Book(String bTitle, int bPageCount, int bISBN) {
        this.title = bTitle;
        this.pageCount = bPageCount;
        this.ISBN = bISBN;
        isCheckedOut = false;
    }

    //getters
    public String getTitle() {
        return this.title;
    }

    public int getPageCount() {
        return this.pageCount;
    }

    public int getISBN() {
        return this.ISBN;

    }

    public boolean getIsCheckedOut() {
        return this.isCheckedOut;
    }

    public int getDayCheckedout() {
        return this.dayCheckedout;
    }

    //setters
    void setIsCheckedOut(boolean newIsCheckedOut, int currentDayCheckedOut) {
        this.isCheckedOut = newIsCheckedOut;
        setDayCheckedout(currentDayCheckedOut);
    }

    private void setDayCheckedout(int day) {
        this.dayCheckedout = day;
    }

}
