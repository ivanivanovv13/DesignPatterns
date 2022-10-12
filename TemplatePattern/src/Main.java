public class Main {
    public static void main(String[] args) {
        GameAbstract footballGame = new Football();
        GameAbstract basketballGame = new Basketball();

        footballGame.playGame();
        basketballGame.playGame();
    }
}