package bai1;

public class FictionBook extends Book{
    private String category;
    public static double sum1;
    public static int count1;
    public static int count2;

    public FictionBook(String category) {
        this.category = category;
    }

    public FictionBook(int bookCode, String name, double price, String author, String category) {
        super(bookCode, name, price, author);
        this.category = category;
        sum1 += price;
        if (category == "Viễn tưởng 1") {
            count1++;
        }
        if (price < 100) {
            count2++;
        }
    }

}

