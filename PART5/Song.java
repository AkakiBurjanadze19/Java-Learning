package PART5;

public class Song {
    private String name;
    private String author;
    private int duration;

    public Song(String name, String author, int duration) {
        this.name = name;
        this.author = author;
        this.duration = duration;
    }

    public boolean equals(Object compared) {
        if (this == compared) {
            return true;
        }

        if (!(compared instanceof Song)) {
            return false;
        }

        Song comparedSong = (Song) compared;

        if (this.name.equals(comparedSong.name) && this.author.equals(comparedSong.author) && this.duration == comparedSong.duration) {
            return true;
        }

        return false;
    }
}
