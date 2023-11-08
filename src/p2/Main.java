package p2;



public class Main {
    public static void main(String[] args) {
        Xerox.Printer printer = new Document();
        printer.print();
        Seller seller = createSeller("Test", true); // объект с текстом и переменной
        seller.sale();
        runSelle(new Market());
        runSelle(new OnlaineMarket());


    }
    static void runSelle(Seller seller){
        seller.sale();
    }
    static Seller createSeller(String text, boolean isOnlaine) { // результат createSeller
        if (isOnlaine) {
            return new OnlaineMarket();
        } else {
            return new Market();
        }
    }
}