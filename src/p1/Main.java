package p1;

public class Main {
    public static void main(String[] args) {
        Document document = new Document("Diplom.docx", "Alex");
        document.print();
        document.search();
        Printer printer = new Note("Som text");
        printer.print();
        String text = ((Note)printer).getText();
        System.out.println(text);
        Book book = new Book();
        book.print();
        Printer.counterPrint();
    }
}
