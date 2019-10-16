
package Lesson6;

public class Book {
    private String title;
    private String author;
    public Book (String t, String a){
        title=t;
        author=a;
    }
  public String toString(){
      String s = "\n Title > \t" + title;
             s += "\n Author > \t" + author;
             s += "\n--------------";
             return s;
  }  
   public String getTitle(){
       return title;
   } 
}
