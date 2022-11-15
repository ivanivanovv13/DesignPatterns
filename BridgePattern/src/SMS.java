import java.util.Scanner;

public class SMS implements Message {

    private String receiverPhoneNumber;
    private String senderPhoneNumber;
    private String message;

    @Override
    public void setMessageDetails() {
        Scanner in = new Scanner(System.in);
        System.out.println("Input the phone number of the receiver: ");
        setReceiverPhoneNumber(in.next());
        System.out.println("Input the phone number of the sender: ");
        setSenderPhoneNumber(in.next());
        System.out.println("Input the message to be send: ");
        setMessage(in.nextLine());
    }

    @Override
    public void sendMessage() {
        System.out.println("Message FROM: " + senderPhoneNumber);
        System.out.println("Message TO: " + receiverPhoneNumber);
        System.out.println("Message: " + message);
    }

    public void setReceiverPhoneNumber(String receiverPhoneNumber) {
        this.receiverPhoneNumber = receiverPhoneNumber;
    }

    public void setSenderPhoneNumber(String senderPhoneNumber) {
        this.senderPhoneNumber = senderPhoneNumber;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
