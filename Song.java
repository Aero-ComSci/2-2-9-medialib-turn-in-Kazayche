
public class Song
{
  private int rating;
  private String title;

  /*** Constructor ****/
  public Song(String t)
  {
    title = t;
  }
  
  /*** Accessor methods ***/
  public String getTitle() {
    return title;
  }

  public int getRating() {
    return rating;
  }
  
  public boolean equals(Song s)
  {
    if(this.title.equals(s.title))
      return true; 
      
    return false;
  }

  public String toString() 
  {
    String info = "\"" + title + "\"";
    if (rating != 0) 
      info += ", rating is " + rating;
    
    return info;
  }

   
  // acts like setters
  public void setTitle(String t) {
    title = t;
  }

  public void adjustRating(int r)
  {
    if ((rating + r >= 0) && (rating + r <= 10))
      rating += r;
  }

}
