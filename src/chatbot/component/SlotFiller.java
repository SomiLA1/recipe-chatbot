/*
 * SlotFiller.java is added for Assignment 1-3 (Language Understanding)
 */

package chatbot.component;

import java.util.Hashtable;

public class SlotFiller {

	/*
	 * Task 1: Build the Slot Filler (extractSlotValues() in SlotFiller.java)
	 * 
	 * [Input] 
	 * One user message (e.g., "What's the weather in State College?")
	 * 
	 * [Output]
	 * A hash table that contains a set of (key, value) tuples, where the "key"
	 * is the name of the slot (e.g., "location") and "value" is the extracted
	 * value (e.g., "State College").
	 * 
	 */
	public Hashtable<String, String> extractSlotValues(String nowInputText) {
		
		//initialize the hash table. You do not need to change this line of code.
		Hashtable<String, String> result = new Hashtable<String, String>();
		
		//-------------- Modify Code Here (Assignment 1-3) Begins ---------------
		
		//modify the following code to implement your own slot extractor
		String[] allergensList = new String[] {"GLUTEN", "PEANUT", "DAIRY", "SHELLFISH", "SHRIMP"};
		for(String nowallergens: allergensList) {
			if(nowInputText.toUpperCase().contains(nowallergens)) {
				//adding value to the result hash table
				result.put("Allergens", nowallergens);
			}
		}
		
		//modify the following code to implement your own slot extractor
	//	String[] caloriesList = new String[] {"KCAL", "CALORIES","DIET", "BULK"};
		//for(String nowcalories : caloriesList) {
		//	if(nowInputText.toUpperCase().contains(nowcalories)) {
				//adding value to the result hash table
			//	result.put("Calories ", nowcalories);
		//	}
		//}
		
		//-------------- Modify Code Here (Assignment 1-3) Ends ---------------
		
		//return the result hash table. You do not need to change this part of code.
		return result;
		
	}

}
