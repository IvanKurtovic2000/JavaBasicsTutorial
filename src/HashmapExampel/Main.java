package HashmapExampel;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		
		
		//Creating a empty ArrayList
		List<QuestionAnswered> questionAnsweredList = new ArrayList<QuestionAnswered>();
		
		//Put some QuestionAnswered Objects in the ArrayList
		questionAnsweredList.add(new QuestionAnswered("1", "5456455", "A", "A1", "Question 1"));
		questionAnsweredList.add(new QuestionAnswered("2", "5456455", "B", "A2", "Question 2"));
		questionAnsweredList.add(new QuestionAnswered("3", "5456455", "C", "A3", "Question 3"));
		questionAnsweredList.add(new QuestionAnswered("4", "5456455", "D", "A4", "Question 4"));
		questionAnsweredList.add(new QuestionAnswered("5", "5456455", "E", "A5", "Question 5"));
		questionAnsweredList.add(new QuestionAnswered("6", "5456455", "F", "A6", "Question 6"));
		questionAnsweredList.add(new QuestionAnswered("7", "5456455", "G", "A7", "Question 7"));
		questionAnsweredList.add(new QuestionAnswered("8", "5456455", "H", "A8", "Question 8"));
		
		
		//Creating a empty HashMap -> The Key is a String (textTag) of a QuestionAnswered Object 
		// -> The Value is a QuestionAnswered Object 
		Map<String, QuestionAnswered> questionAnsweredMap = new HashMap<>();


		//Put  Key Valuie Pairs in the Hashmap
		for (QuestionAnswered questionAnswered : questionAnsweredList) {
			questionAnsweredMap.put(questionAnswered.getTextTag(), questionAnswered);
		}

		// Print Value with the Key "A3"
		System.out.println(questionAnsweredMap.get("A3"));
		
		
		System.out.println("////////////////////////////////////////////////////////////////");
		
		// Print keys
		for (String i : questionAnsweredMap.keySet()) {
		  System.out.println(i);
		}
		
		System.out.println("////////////////////////////////////////////////////////////////");
		
		// Print values
		for (QuestionAnswered questionAnswered : questionAnsweredMap.values()) {
		  System.out.println( questionAnswered );
		}

	}

}
