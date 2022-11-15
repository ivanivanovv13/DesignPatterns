public class MessageSenderImpl implements MessageSender {
    Message message;

    public MessageSenderImpl(Message message) {
        this.message = message;
    }

    @Override
    public void sendMessage() {
        message.setMessageDetails();
        message.sendMessage();
    }
}
