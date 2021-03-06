/**
 * A class that maintains information on a book.
 * This might form part of a larger application such
 * as a library system, for instance.
 *
 * @author Ahmet Can Turk
 * @version February 7 2019
 */
class Book
{
     // The fields.
    private String author;
    private String title;
    private int pages;
    private String refNumber;
    private int borrowed;
    boolean courseText;
   

    /**
     * Set the author and title fields when this object
     * is constructed.
     */
  
    public Book(String bookAuthor, String bookTitle, int pages, boolean course)
    {
        
        author = bookAuthor;
        title = bookTitle;
        refNumber = "";
        courseText = course;
        
    }

        // Add the methods here ...
   
    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public String getAuthor(){
        
        return author;
   
    
    }
    
    public String getTitle(){
        
        return title;
   
    
    }
    
    public int getPages(){
        
        return pages;
   
    
    }
    public String getRefNumber(){
        
        return refNumber;
   
    
    }
    
    public void setRefNumber(String refNumber){
        
        refNumber = this.refNumber;
   
    
    }
    
    
    public int getBorrowed(){
        
        return borrowed;
   
    
    }
    
    public void borrow(){
    
    borrowed =+ 1;
    
    
    }
    public boolean isCourseText(){
    
        return courseText;
    }
    public void printDetails(){
        
        System.out.println("Title: "+pages + "Author: "+ author +"Title: "+ title);
    
    
    
    
    
    }
}
