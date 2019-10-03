public class SongDriver
{
    public static void main (String args[])
    {
       //1. Create a Song, or more
       Song kaD = new Song("king for a day", "Peirce the Veil", true, 234,6.94);

       Song someSong = new Song();

        System.out.println(kaD.getTile());
        System.out.println(kaD.getArtist());
        System.out.println(kaD.getHasLyrics());

        //4  Checking other methods and properties
        kaD.setLength(-5);
        System.out.println(kaD);

        //System.out.println("In minutes: " + kaD.toMinSec());

      /*
        System.out.println("\n" + someSong);
        System.out.println(someSong.setTitle("lalalala"));
        someSong.setTitle("lalalalala");
        someSong.getArtist("A Singer");
*/
    }//end main method
}// end class SongDriver. This is where all the fun stuff happens
