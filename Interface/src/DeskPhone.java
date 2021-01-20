public class DeskPhone implements ITelephone{
    private int myNumer;
    private boolean isRing;


    @Override
    public void powerOn() {
        System.out.println("Turning on");
    }

    @Override
    public void dial(int phoneNumber) {
        if(phoneNumber==myNumer){
            if(!isRinging()){
                isRing = true;
            }else{
                System.out.println("The phone is busy");
            }
        }else{
            System.out.println("Not for me");
        }
//            System.out.println("Dialing number " + phoneNumber);

    }

    @Override
    public boolean isRinging() {
        return isRing;
    }

    @Override
    public void pickUp() {
        if(isRinging()){
            isRing = false;
            System.out.println("Answered the call");
        }
    }
}
