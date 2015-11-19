package hipster.model;

public class Hipster 
{
	private String name;
	private String [] hipsterPhrases;
	private Book [] hipsterBooks;
	
	

	public Hipster()
	{
		this.name = "";
		this.hipsterPhrases = new String[4];
		this.hipsterBooks = new Book[3];
		setupArray();
		setupBooks();
	}
	
	private void setupArray()
	{
		hipsterPhrases[0] = "That is so mainstream!";
		hipsterPhrases[1] = "I don't mean to sound like a hipster, but, ";
		hipsterPhrases[2] = "Insert sarcastic phrase here";
		hipsterPhrases[3] = "I was into pokemon before it was cool";
	}
	
	private void setupBooks()
	{
		Book firstBook, secondBook, thirdBook;
		firstBook = new Book();
		firstBook.setAuthor("Brent Weeks");
		firstBook.setTitle("The Black Prism");
		firstBook.setSubject("Fantasy");
		firstBook.setPageCount(688);
		firstBook.setPrice(12.40);
		
		secondBook = new Book();
		secondBook.setAuthor("John Flanagan");
		secondBook.setTitle("The Ruins of Gorlan");
		secondBook.setSubject("Fantasy");
		secondBook.setPageCount(288);
		secondBook.setPrice(8.99);
		
		thirdBook = new Book(1280,"Brandon Sanderson", "The Way of Kings" , "Fantasy" , 6.15);
		
		hipsterBooks[0] = firstBook;
		hipsterBooks[1] = secondBook;
		hipsterBooks[2] = thirdBook;
	}
	
	public Hipster(String name)
	{
		
	}
	
	public String[] getHipsterPhrases() 
	{
		return hipsterPhrases;
	}

	public void setHipsterPhrases(String[] hipsterPhrases) 
	{
		this.hipsterPhrases = hipsterPhrases;
	}

	public String getName() 
	{
		return name;
	}

	public void setName(String name) 
	{
		this.name = name;
	}

	public Book[] getHipsterBooks() 
	{
		return hipsterBooks;
	}

	public void setHipsterBooks(Book[] hipsterBooks) 
	{
		this.hipsterBooks = hipsterBooks;
	}
	
}
