public class Football extends GameAbstract {
    @Override
    void Initialize() {
        System.out.println("Football game is being initialized.");
    }

    @Override
    void StartGame() {
        System.out.println("Football game is starting.");
    }

    @Override
    void EndGame() {
        System.out.println("Football game finished.\n");
    }
}
