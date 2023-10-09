package ra.bussinessImp;

import ra.bussiness.IBook;

import java.util.Scanner;

public class Book implements IBook {
    private int bookId;
    private String bookName;
    private String title;
    private int numberOfPages;

    private float importPrice;
    private float exportPrice;
    private float interest;
    private boolean bookStatus;

    public Book() {
    }

    public Book(int bookId, String bookName, String title, int numberOfPages, float importPrice, float exportPrice, float interest, boolean bookStatus) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.title = title;
        this.numberOfPages = numberOfPages;
        this.importPrice = importPrice;
        this.exportPrice = exportPrice;
        this.interest = interest;
        this.bookStatus = bookStatus;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public float getImportPrice() {
        return importPrice;
    }

    public void setImportPrice(float importPrice) {
        this.importPrice = importPrice;
    }

    public float getExportPrice() {
        return exportPrice;
    }

    public void setExportPrice(float exportPrice) {
        this.exportPrice = exportPrice;
    }

    public float getInterest() {
        return interest;
    }

    public void setInterest(float interest) {
        this.interest = interest;
    }

    public boolean isBookStatus() {
        return bookStatus;
    }

    public void setBookStatus(boolean bookStatus) {
        this.bookStatus = bookStatus;
    }

    @Override
    public void inputData() {

        Scanner scanner= new Scanner(System.in);
        System.out.println("Nhập thông tin sách:");
        System.out.print("Mã sách: ");
        bookId = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Tên sách: ");
        bookName = scanner.nextLine();
        System.out.print("Tiêu đề sách: ");
        title = scanner.nextLine();
        System.out.print("Số trang sách: ");
        numberOfPages = scanner.nextInt();
        System.out.print("Giá nhập sách: ");
        importPrice = scanner.nextFloat();
        System.out.print("Giá bán sách: ");
        exportPrice = scanner.nextFloat();
        interest = exportPrice - importPrice;
        System.out.print("Trạng thái sách (true/false): ");
        bookStatus = scanner.nextBoolean();
    }

    @Override
    public void displayData() {
        System.out.println("Mã sách: " + this.bookId);
        System.out.println("Tên sách: " + this.bookName);
        System.out.println("Tiêu đề sách: " + this.title);
        System.out.println("Số trang sách: " + this.numberOfPages);
        System.out.println("Giá nhập: " + this.importPrice);
        System.out.println("Giá xuất: " + this.exportPrice);
        System.out.println("Lợi nhuận: " + this.interest);
        System.out.println("Trạng thái: " + (this.bookStatus ? "Còn hàng" : "Hết hàng"));
    }}
