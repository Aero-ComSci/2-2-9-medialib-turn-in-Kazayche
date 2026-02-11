
public class Movie
{
  private int rating;
  private String title;
  private double duration;

  /*** Constructor ****/
  public Movie(String t, double d)
  {
    title = t;
    duration = d;
  }
  
  /*** Accessor methods ***/
  public String getTitle() {
    return title;
  }

  public double getDuration() {
    return duration;
  }

  public int getRating() {
    return rating;
  }
  
  public boolean equals(Movie m)
  {
    if(this.title.equals(m.title) && this.duration == m.duration)
      return true; 
      
    return false;
  }

  public String toString() 
  {
    String info = "\"" + title + "\", " + duration;
    if (rating != 0) 
      info += ", rating is " + rating;
    
    return info;
  }

   
  /*** Mutator methods ***/
  public void setDuration(double d) {
    duration = d;
  }
    
  public void setTitle(String t) {
    title = t;
  }
//adjuster if it is between the threshold of 0 and 10 
  public void adjustRating(int r)
  {
    if ((rating + r >= 0) && (rating + r <= 10))
      rating += r;
  }

}
