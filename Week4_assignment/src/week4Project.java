import java.util.ArrayList;

public class week4Project {

	public static void main(String[] args) {    ///arrays ( you need to change the size  or youll have a wrong error.
		String[] fruits = new String[4];
		fruits[0] = "Mango";
		fruits[1] = "apple";
		fruits[2] = "Grapefruit";
		fruits[3] = "Strawberry";
		System.out.println(fruits[1]);
		
		
		
		
		
		//array list can change without changing the amount.
		ArrayList fruitList = new ArrayList();
		fruitList.add("Mango");
		fruitList.add("Apple");
		fruitList.add("Strawberry");
		fruitList.add("Watermelon");
		
		//fruitList.remove("Apple");  ///This command will remove from the console list
	  // this command will erase the list of fruits // fruitList.clear();
		
		System.out.println(fruitList);
		
		System.out.println(fruitList.contains("Raspberry")); /*
		
		 
		 This command will let you know items in the list and if there is none the command 
		will come out as false.
		*/
		
		
		
	}


}