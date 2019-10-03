public class Song
{
    //1) Instance Variables
  private String title;
  private String artist; //can also be composer
   private boolean hasLyrics;
   private int length; //in seconds
  private double fileSize; /// in megabytes

    //2) Constructors
    public Song()
    {
        title = null;
        artist = null;
        hasLyrics = false;
        length = 0;
        fileSize = 0.0;
    }//end zero arg or default constructor

    private int checkLength(int newLength)
    {
        int tempLength = newLength;
        if (tempLength < 0)
        {
            tempLength = 0;
        }// end if
        else if (tempLength > 1200)
        {
            tempLength = 1200;
        }// end else if
        return tempLength;
    }// end length validation method checkLengths

    public Song(String newTitle, String newArtist, boolean newHasLyrics)
    {
        title = newTitle;
        artist = newArtist;
        hasLyrics = newHasLyrics;

    }

    public Song(String newTitle, String newArtist, Boolean newHasLyrics, int newLength, double newFileSize)
    {
        title = newTitle;
        artist = newArtist;
        hasLyrics = newHasLyrics;
        length = checkLength(newLength);
        fileSize = newFileSize;
    }// end multi-arg contructer

    public String getTile()
    {
        return title;
    }//title getter

    public String getArtist()
    {
        return artist;
    }//artist generator
    public void setHasLyrics(boolean newHasLyrics)
    {
        hasLyrics = newHasLyrics;
    }
    public boolean getHasLyrics()
    {
        return hasLyrics;
    }//hasLyrics greater
  public void setTitle(String newTitle)
  {
      title = newTitle;
  }
public void setLength(int newLength)
{
    length = checkLength(newLength);
}//end setLength
  //6 brain method
    public String toMinSec()
    {
        int minutes = length / 60;
     int seconds = length % 60;
     return minutes + " min " + seconds + " sec ";
    }//end brain method tp convert length

    //3. toString
    public String toString()
    {
        String output = "";
        output += "title: " + title;
        output += "\nartist: " + artist;
        output += "\nHas Lyrics?: " + hasLyrics;
        output += "\nLength in Song? " + length;
        output += "\nFile size (in mB) " + fileSize;

        return output;

    }//end toString

}// end class song
