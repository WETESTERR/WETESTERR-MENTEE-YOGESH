package Opps;

public class booksInfo {

	String title;
	int pages;
	int year;
	
	
	public booksInfo(String Title, int Pages, int Year)
	{
		this.title = Title;
		this.year = Year;
		this.pages = Pages;
	}
	
	
	public String toString()
	{
		return this.title +","+ this.pages +" Pages " + this.year;
	}
	
	public String tit() {
		
		return this.title;
	}
}
