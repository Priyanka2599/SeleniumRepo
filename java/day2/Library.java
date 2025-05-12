package week1.day2;

public class Library 
{
	
	// Method AddBook
	public String addBook(String bookTitle)
	{
		return bookTitle;
	}
	//Method IssueBook
	public void issueBook()
	{
		System.out.println("Book issued successfully");
	}


	public static void main(String[] args) 
	{
		//Creating object for Library class
		Library lib = new Library();
		//calling addBook method
		String library=lib.addBook("Book added successfully");
		System.out.println(library);
		//Calling issueBook method
		lib.issueBook();
	}

}
