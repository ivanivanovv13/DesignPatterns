public class Basketball extends GameAbstract {
    @Override
    void Initialize() {
        System.out.println("Basketball game is being initialized.");
    }

    @Override
    void StartGame() {
        System.out.println("Basketball game is starting.");
    }

    @Override
    void EndGame() {
        System.out.println("Basketball game finished.\n");
    }
}
