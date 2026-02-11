
public class MediaLib
{
  public static String owner = "PLTW";
  //initalization of variables stated
  private static int numEntries;
  private static int numBooks;
  private static int numMovies;
  private static int numSongs;
  
  private Book book;
  private Movie movie;
  private Song song;
  //holds book, movie, and song
  public void addBook(Book b)
  {
    if (book == null)
    {
      book = b;
      numEntries++;
      numBooks++;
    } 
    else
      System.out.println("book exists");
  }
  
  public void addMovie(Movie m)
  {
    if (movie == null)
    {
      movie = m;
      numEntries++;
      numMovies++;
      //code logic is that if the movie is not defined, we would then add it to out dataset
    }
    else
      System.out.println("A movie already exists");
  }
  
  public void addSong(Song s)
  {
    if (song == null)
    {
      song = s;
      numEntries++;
      numSongs++;
    }
    else
      System.out.println("A song already exists");
  }
   //lots of getters used here for the autotgrader to check
  public static String getOwner()
  {
    return owner;
  }

  public static void changeOwner(String o)
  {
    owner = o;
  }
  
  public static int getNumEntries()
  {
    return numEntries;
  }
  
  public static int getNumBooks()
  {
    return numBooks;
  }
  
  public static int getNumMovies()
  {
    return numMovies;
  }
  
  public static int getNumSongs()
  {
    return numSongs;
  }
  //tostring method used here to say if it is not found, it will be added to the dataset and be returned
  public String toString() 
  {
    String info = "";
    
    if (book != null)
      info += "Book: " + book + "\n";
    if (movie != null)
      info += "Movie: " + movie + "\n";
    if (song != null)
      info += "Song: " + song + "\n";
 
    return info;
  }
}
