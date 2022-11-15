import java.util.Scanner;

public class Email implements Message {

    private String emailFrom;
    private String emailTo;
    private String message;

    @Override
    public void setMessageDetails() {
        Scanner in = new Scanner(System.in);
        System.out.println("Input the email of the receiver: ");
        setEmailTo(in.next());
        System.out.println("Input the email of the sender: ");
        setEmailFrom(in.next());
        System.out.println("Input the message to be send: ");
        setMessage(in.nextLine());
    }

    @Override
    public void sendMessage() {
        System.out.println("Email FROM: " + emailFrom);
        System.out.println("Email TO: " + emailTo);
        System.out.println("Message: " + message);
    }

    public void setEmailFrom(String emailFrom) {
        this.emailFrom = emailFrom;
    }

    public void setEmailTo(String emailTo) {
        this.emailTo = emailTo;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
