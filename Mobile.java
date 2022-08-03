public class Mobile implements ITelephone {
    private int myNumber;
    boolean isOn;
    private boolean isRinging;

    public Mobile(int myNumber){
        this.myNumber = myNumber;
        this.isOn = false;
    }

    @Override
    public void powerOn() {
        System.out.println("Mobile phone is now on"); 
        this.isOn = true;       
    }
    @Override
    public void dial(int phoneNumber) {
        if (isOn) {
            System.out.println("Now ringing " + phoneNumber + " on mobile phone");
        } else {
            System.out.println("Moble phone is currently off");
        }
       
        
    }
    @Override
    public void answer() {
        if (isRinging && isOn) {
            System.out.println("Answering the mobile phone");
            isRinging = false;
        }  else {
            System.out.println("Moble phone is currently off");
        }     
    }
    @Override
    public boolean callPhone(int phoneNumber) {
        if (phoneNumber == myNumber && isOn) {
            isRinging=true;
            System.out.println("Ring ring");
        } else {
            System.out.println("Moble phone is currently off or wrong number");
            isRinging = false;
        }
        return isRinging;
    }
    @Override
    public boolean isRinging() {
        // 
        return false;
    }



}