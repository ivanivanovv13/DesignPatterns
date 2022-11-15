public class Main {
    public static void main(String[] args) {
        Message emailMessage = new Email();
        Message smsMessage = new SMS();
        MessageSender messageSenderEmail = new MessageSenderImpl(emailMessage);
        MessageSender messageSenderSMS = new MessageSenderImpl(smsMessage);

        messageSenderSMS.sendMessage();
        messageSenderEmail.sendMessage();
    }
}