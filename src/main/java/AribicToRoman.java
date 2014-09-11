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
        if (aribic == 0)
            return "";

        int largestRomanSymbolMappingAribicLessThanInput =
                ALL_ARIBIC_TO_ROMAN_SYMBOL_MAPPINGS.tailMap(aribic).firstKey();

        return ALL_ARIBIC_TO_ROMAN_SYMBOL_MAPPINGS.get(largestRomanSymbolMappingAribicLessThanInput) +
                convert(aribic - largestRomanSymbolMappingAribicLessThanInput);
	}
	
}
