import java.util.Arrays;

public class Playlist {
    private final String[] songs;
    private int songCount;

    public Playlist(int capacity) {
        if (capacity < 0) throw new IllegalArgumentException("Capacity cannot be negative");
        songs = new String[capacity];
        songCount = 0;
    }

    public void addSong(String title) {
        if (songCount >= songs.length) {
            System.out.println("Playlist is full");
            return;
        }
        songs[songCount++] = title;
    }

    public String[] getSongs() {
        return Arrays.copyOf(songs, songCount);
    }

    public int getSongCount() {
        return songCount;
    }

    public static void main(String[] args) {
        Playlist p = new Playlist(10);
        p.addSong("Song A");
        p.addSong("Song B");
        String[] copy = p.getSongs();
        copy[0] = "Hacked";
        System.out.println(Arrays.toString(p.getSongs()));
        System.out.println("Song count: " + p.getSongCount());
    }
}
