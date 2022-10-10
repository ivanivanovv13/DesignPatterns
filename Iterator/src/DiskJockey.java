import java.util.Iterator;

public class DiskJockey {


    SongIterator iter70sSongs;
    SongIterator iter80sSongs;
    SongIterator iter90sSongs;

    public DiskJockey(SongIterator song70s, SongIterator song80s, SongIterator song90s) {
        this.iter70sSongs = song70s;
        this.iter80sSongs = song80s;
        this.iter90sSongs = song90s;
    }

    public void showTheSongs() {
        Iterator songs70s = iter70sSongs.createIterator();
        Iterator songs80s = iter70sSongs.createIterator();
        Iterator songs90s = iter70sSongs.createIterator();

        System.out.println("Songs of the 70s\n");
        printSongs(songs70s);
        System.out.println("Songs of the 80s\n");
        printSongs(songs80s);
        System.out.println("Songs of the 90s\n");
        printSongs(songs90s);
    }

    private void printSongs(Iterator<SongInfo> iterator) {
        while (iterator.hasNext()) {
            SongInfo songInfo = (SongInfo) iterator.next();
            System.out.println(songInfo.getSongName());
            System.out.println(songInfo.getBandName());
            System.out.println(songInfo.getYearReleased());
        }
    }
}
