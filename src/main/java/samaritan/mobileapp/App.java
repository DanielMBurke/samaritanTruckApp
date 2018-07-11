package samaritan.mobileapp;


public class App 
{ 
	
	public static void main(String[] args) {
		Menu menu = new Menu(System.in, System.out);
		SelectionScreen select = new SelectionScreen(menu); //
		select.truckChoice();

	}

}