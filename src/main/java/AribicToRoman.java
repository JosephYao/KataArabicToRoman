import java.util.Collections;
import java.util.SortedMap;
import java.util.TreeMap;


public class AribicToRoman {


	private static final SortedMap<Integer, String> ALL_ARIBIC_TO_ROMAN_SYMBOL_MAPPINGS =
			new TreeMap<Integer, String>(Collections.reverseOrder()) {{
		put(1, "I");
		put(4, "IV");
		put(5, "V");
		put(9, "IX");
		put(10, "X");
		put(40, "XL");
		put(50, "L");
		put(90, "XC");
		put(100, "C");
		put(400, "CD");
		put(500, "D");
		put(900, "CM");
		put(1000, "M");
	}};
	
	public String convert(int aribic) {
		return convertAssist(aribic, "");
	}
	
	private String convertAssist(int aribic, String roman) {
		if (aribic == 0)
			return roman;
		else {
			int largestRomanSymbolMappingAribicLessThanInput = 
					ALL_ARIBIC_TO_ROMAN_SYMBOL_MAPPINGS.tailMap(aribic).firstKey();
			return convertAssist(aribic - largestRomanSymbolMappingAribicLessThanInput, 
					roman + ALL_ARIBIC_TO_ROMAN_SYMBOL_MAPPINGS.get(largestRomanSymbolMappingAribicLessThanInput));
		}
	}

}
