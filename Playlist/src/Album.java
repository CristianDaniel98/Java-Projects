import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String name;
    private String artist;
    private ArrayList<Song> songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<>();
    }

    public boolean addSong(String title, double duration){
        for(Song song : songs){
            if(song.getTitle().equals(title)){
                return false;
            }
        }
        songs.add(new Song(title, duration));
        return true;
    }

    private Song findSong(String title){
        for(Song song : songs){
            if(song.getTitle().equals(title)){
                return song;
            }
        }
        return null;
    }

    public boolean addToPlayList(int track, LinkedList<Song> list){
        for(int i=0; i<songs.size(); i++){
            if((i+1) == track){
                list.add(songs.get(i));
                return true;
            }
        }
        return false;
    }

    public boolean addToPlayList(String title, LinkedList<Song> list){
        Song song = findSong(title);
        list.add(song);

        return song != null;
    }
}
