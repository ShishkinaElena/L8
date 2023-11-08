package p2;

public class Market implements Seller{

    @Override
    public void sale() {
        System.out.printf("SOLD");
    }
}
