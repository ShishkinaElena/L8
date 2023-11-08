package dz7;

public class Main {
    public static void main(String[] args) {
        ApplePhone phone = new ApplePhone("777-777-777","Appele", 100.123);
        phone.receiveCall("Misha");
        phone.info();
    }
}