package codecademy;

import java.util.ArrayList;
/*
This example shows:

1. How to create a Playlist.

2. Adding songs to the Playlist.

3. How to remove the element at a given index in an ArrayList | remove(int index)

4. How to remove an element from an ArrayList | remove(Object o)

5. How to swap one element with another in an ArrayList.

6. Use set in order to swap.
 */

class Playlist {

    public static void main(String[] args) {

        // Create a new Playlist called desertIslandPlaylist
        ArrayList <String> desertIslandPlaylist = new ArrayList <String>();

        // adding songs to the playlist
        desertIslandPlaylist.add("Jesus Lover of my soul");
        desertIslandPlaylist.add("Jesus source of life eternal");
        desertIslandPlaylist.add("No mortal tongue");
        desertIslandPlaylist.add("I'll enter the Holy of Holies");
        desertIslandPlaylist.add("We rest on thee");
        desertIslandPlaylist.add("Come ye sinner");
        desertIslandPlaylist.add("Why should i worry");
        desertIslandPlaylist.add("His eye is on the sparrow");

        // System.out.println(desertIslandPlaylist);

        // Get size of the playlist
        // System.out.println(desertIslandPlaylist.size());

        //removing songs to make compact playlist, get size, and print the playlist
        desertIslandPlaylist.remove("We rest on thee");
        desertIslandPlaylist.remove("Come ye sinner");
        desertIslandPlaylist.remove("Jesus Lover of my soul");
        System.out.println("The size of the playlist is: " + desertIslandPlaylist.size());
        //System.out.println("The song in the Playlist are: " + desertIslandPlaylist);

        // get indices of song to swap
        int songA = desertIslandPlaylist.indexOf("No mortal tongue");
        int songB = desertIslandPlaylist.indexOf("Why should i worry");
        System.out.println("The index of songA is:" + songA);
        System.out.println("The index of songB is:" + songB);

        // creat tempA to store value of songA
        String tempA = "No mortal tongue";

        // set songB in songA index
        desertIslandPlaylist.set(1, "Why should i worry");
        //System.out.println(desertIslandPlaylist);

        // swap songA with songB
        desertIslandPlaylist.set(songB, tempA);
        System.out.println(desertIslandPlaylist);

    }

}
