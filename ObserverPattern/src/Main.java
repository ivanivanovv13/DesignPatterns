public class Main {
    public static void main(String[] args) {
        Channel Intel = new Channel();

        Subscriber sub1 = new Subscriber("ivanivanov13");
        Subscriber sub2 = new Subscriber("georgi.petkov");
        Subscriber sub3 = new Subscriber("asen_vasilev");
        Subscriber sub4 = new Subscriber("nikolayL");

        Intel.addSubscriber(sub1);
        Intel.addSubscriber(sub2);
        Intel.addSubscriber(sub3);
        Intel.addSubscriber(sub4);

        Intel.removeSubscriber(sub2);

        sub1.subscribeChannel(Intel);
        sub2.subscribeChannel(Intel);
        sub3.subscribeChannel(Intel);
        sub4.subscribeChannel(Intel);


        Intel.upload("New Intel processor!");
    }
}