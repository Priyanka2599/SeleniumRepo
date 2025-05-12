package week1.day2;

public class LibraryManagement {

	public static void main(String[] args) 
	{
		//call the methods of Library Class
		Library lib = new Library();
		String library=lib.addBook("Book added successfully");
		System.out.println(library);
		lib.issueBook();

	}

}
