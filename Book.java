/**
 * A class that maintains information on a book.
 * This might form part of a larger application such
 * as a library system, for instance.
 *
 * @author (Insert your name here.)
 * @version (Insert today's date here.)
 */
class Book
{
     // The fields.
    private String author;
    private String title;
    private int pages;
    private String refNumber;
    private int borrowed;

    /**
     * Set the author and title fields when this object
     * is constructed.
     */
  
    public Book(String bookAuthor, String bookTitle,int pages, String refNumber, int borrowed)
    {
        pages = this.pages;
        author = bookAuthor;
        title = bookTitle;
        refNumber = "";
        borrowed
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
    
    public String setRefNumber(String refNumber){
        
        return refNumber;
   
    
    }
    
    
    public int getBorrowed(){
        
        return borrowed;
   
    
    }
    public void printDetails(){
        
        System.out.println("Title: "+pages + "Author: "+ author +"Title: "+ title);
    
    
    
    
    
    }
}
