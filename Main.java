public class Main{
    
    public static void main(String[] args) {
        ITelephone bilPhone;
        bilPhone = new DeskPhone(123456);
        bilPhone.powerOn();
        bilPhone.callPhone(123456);
        bilPhone.answer();
        System.out.println("$$$$$$$$$$");
        bilPhone = new Mobile(334455);
        // bilPhone.powerOn();
        bilPhone.callPhone(334455);
        bilPhone.answer();
    }
}
