public class Main {
    public static void main(String[] args) {
        SongComponent industrialMusic = new SongGroup("Industrial",
                "is a genre that combines elements of hardcore punk rock, " +
                        "heavy metal, electronic music, and propulsive club beats.");
        SongComponent heavyMetalMusic = new SongGroup("Heavy Metal",
                "is a loud distorted guitars, emphatic rhythms," +
                        " dense bass-and-drum sound, and vigorous vocals.");
        SongComponent dubstepMusic = new SongGroup("Dubstep",
                "a genre of electronic music descended from 2-step garage, " +
                        "characterised by its dark mood, sparse half-step and two-step rhythms, and emphasis on sub-bass");
        SongComponent everySong = new SongGroup("SongList", "Every Song Available");
        everySong.add(industrialMusic);
        industrialMusic.add(new Song("Head like a Hole", "NIN", 1990));
        industrialMusic.add(new Song("Headhunter", "Front 242", 1988));

        industrialMusic.add(dubstepMusic);
        dubstepMusic.add(new Song("Centipede", "Knife Party", 2012));
        dubstepMusic.add(new Song("Tetris", "Doctor P", 2011));

        everySong.add(heavyMetalMusic);
        heavyMetalMusic.add(new Song("War Pigs", "Black Sabbath", 1970));
        heavyMetalMusic.add(new Song("Ace of Spades", "Motorhead", 1980));

        DiscJockey crazyLarry = new DiscJockey(everySong);
        crazyLarry.getSongList();
    }
}