public abstract class GameAbstract {

    public final void playGame() {
        Initialize();
        StartGame();
        EndGame();
    }

    abstract void Initialize();

    abstract void StartGame();

    abstract void EndGame();
}
