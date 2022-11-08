import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SongsOfThe70s implements SongIterator {
    List<SongInfo> bestSongs;

    public SongsOfThe70s() {
        this.bestSongs = new ArrayList<SongInfo>();

        addSong("Imagine", "John Lennon", 1971);
        addSong("American Pie", "Don McLean", 1971);
        addSong("I will Survive", "Gloria Gaynor", 1979);
    }

    public void addSong(String songName, String bandName, int yearReleased) {
        SongInfo songInfo = new SongInfo(songName, bandName, yearReleased);
        bestSongs.add(songInfo);
    }

    @Override
    public Iterator createIterator() {
        return bestSongs.iterator();
    }
}
