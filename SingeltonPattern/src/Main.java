public class Main {
    public static void main(String[] args) {
        Database firstInstance = Database.getInstance("First Instance");
        Database secondInstance = Database.getInstance("Second Instance");

        firstInstance.printInstanceName();
        secondInstance.printInstanceName();
    }
}