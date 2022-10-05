public class Subscriber implements Observer {
    private String name;
    private Channel channel;

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void update(){
        System.out.println("Hey "+name+" Video Uploaded: "+channel.getTitle());
    }

    @Override
    public  void subscribeChannel(Channel ch){
        this.channel=ch;
    }
}
