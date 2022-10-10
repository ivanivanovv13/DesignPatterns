import java.util.Arrays;
import java.util.Iterator;

public class SongsOfThe80s implements SongIterator {
    SongInfo[] bestSongs;
    int arrayValue=0;

    public SongsOfThe80s() {
        this.bestSongs = new SongInfo[3];

        addSong("Roam", "B52s", 1989);
        addSong("Cruel Summer", "Bananarama", 1984);
        addSong("Head Over Heels", "Tears of Fears", 1985);
    }

    public void addSong(String songName, String bandName, int yearReleased) {
        SongInfo songInfo = new SongInfo(songName, bandName, yearReleased);
        bestSongs[arrayValue]=songInfo;
        arrayValue++;
    }

    @Override
    public Iterator createIterator() {
        return Arrays.stream(bestSongs).iterator();
    }
}
