import java.util.HashMap;
import java.util.Map;

class SqueakyClean {
	
	private static final Map<Character, Character> leet;
	
	static {
		leet = new HashMap<>();
		leet.put('4', 'a');
		leet.put('3', 'e');
		leet.put('6', 'g');
		leet.put('1', 'l');
		leet.put('0', 'o');
		leet.put('7', 't');
		leet.put('5', 's');
		leet.put('2', 'q');
		leet.put('8', 'b');
		leet.put('9', 'r');
		// Añade más pares clave-valor según sea necesario
	}
	static String clean(String identifier) {
		
		if (identifier == null || identifier.isEmpty()) {
			return identifier;
			
		}
		identifier = identifier.replaceAll(" ", "_");
		
		StringBuilder result = new StringBuilder();
		boolean toUpperCase = false;
		for (char c : identifier.toCharArray()) {
			if (c == '-') {
				toUpperCase = true;
			} else {
				if (toUpperCase) {
					result.append(Character.toUpperCase(c));
					toUpperCase = false;
				} else {
					result.append(c);
				}
			}
		}
		identifier = result.toString();
		
		identifier = replaceLeet(identifier);
		
		identifier = identifier.replaceAll("[^a-zA-Z0-9_]", "");
		
		return identifier;
	}
	
	
	static String replaceLeet(String identifier){
	
		StringBuilder result = new StringBuilder();
		for (char c : identifier.toCharArray()) {
			if (leet.containsKey(c)) {
				result.append(leet.get(c));
			} else {
				result.append(c);
			}
		}
		return result.toString();
	
	
	
	}
	
}
