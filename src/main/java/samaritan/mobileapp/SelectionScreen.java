package samaritan.mobileapp;
import samaritan.mobileapp.*;

public class SelectionScreen {
	
	private Menu menu;
	public SelectionScreen(Menu menu) {	
		this.menu = menu;
	}
	
	
		protected void truckChoice() {
				asciiart.titleBanner();
				System.out.println("\n" +"Do you..");
			  final String OPTION_1 = " have a truck?";	
			  final String OPTION_2 = " need a truck?";
			  final String [] OPTIONS = {OPTION_1, OPTION_2}; 

		while(true) {
			String choice = (String)menu.getChoiceFromOptions(OPTIONS);		
			if(choice.equals(OPTION_1)) {
				   hasTruckOptions(); 
			}
			  else if(choice.equals(OPTION_2)) {
				  needTruckOptions();
			  }
		}																						
	}

		private void hasTruckOptions() {
			  System.out.println("\n" +"Do you..");
			final String OPTION_1 = " have a trailer & hitch?";
			final String OPTION_2 = " have a plow?";
			final String[] OPTIONS = { OPTION_1, OPTION_2 };
			Menu menu = new Menu(System.in, System.out);
			
			while (true) { 
				String choice = (String) menu.getChoiceFromOptions(OPTIONS); 
				if (choice.equals(OPTION_1)) {
					distanceForTruck();
				} else if (choice.equals(OPTION_2)) {
					distanceForTruck();
				} 
				return;
			}
		} //END OF hastruckoptions

		private void needTruckOptions() {
			  System.out.println("\n" +"Why do you need a truck?");
			final String OPTION_1 = "I'm moving stuff!";
			final String OPTION_2 = "I need my driveway plowed!";
			final String OPTION_3 = "I just need a truck!";
			final String[] OPTIONS = { OPTION_1, OPTION_2, OPTION_3 };
			Menu menu = new Menu(System.in, System.out);
			while (true) { 
				String choice = (String) menu.getChoiceFromOptions(OPTIONS); 
				if (choice.equals(OPTION_1)) {
					distanceForTruck();
				} else if (choice.equals(OPTION_2)) {

				} else if (choice.equals(OPTION_3)) {
					distanceForTruck();
				}
			}
		} //END OF needtruckoptions

		private void distanceForTruck() {
			System.out.println("\n" +"Travel distance?");
			final String OPTION_1 = "5-10 miles";
			final String OPTION_2 = "10-25 miles";
			final String OPTION_3 = "25-50 miles";
			final String OPTION_4 = "50+ miles";

			final String[] OPTIONS = { OPTION_1, OPTION_2, OPTION_3, OPTION_4 };
			Menu menu = new Menu(System.in, System.out);
			while (true) {
				String choice = (String) menu.getChoiceFromOptions(OPTIONS); 
				if (choice.equals(OPTION_1)) {

				} else if (choice.equals(OPTION_2)) {
					
				} else if (choice.equals(OPTION_3)) {
					
				}else if (choice.equals(OPTION_4)) {
					
				}
				
				return;
				}
			
		
		
	}

		private void moreoptions() {
			final String OPTION_1 = "";
			final String OPTION_2 = "2";
			final String OPTION_3 = "3";
			final String[] OPTIONS = { OPTION_1, OPTION_2, OPTION_3 };
			Menu menu = new Menu(System.in, System.out);
			while (true) {
				String choice = (String) menu.getChoiceFromOptions(OPTIONS); 
				if (choice.equals(OPTION_1)) {

				} else if (choice.equals(OPTION_2)) {
				} else if (choice.equals(OPTION_3)) {
				}
				return;
			}
		
		
	}
		
} //END OF BODY
		
		

