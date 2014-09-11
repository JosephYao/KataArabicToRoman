import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class AribicToRomanTest {

	private AribicToRoman convertor = new AribicToRoman();
	private int aribic;
	private String expectedRoman;
	
	public AribicToRomanTest(int theAribic, String theExpectedRoman) {
		aribic = theAribic;
		expectedRoman = theExpectedRoman;
	}
	
	@Parameterized.Parameters
	public static Collection<Object[]> allAribicToRomanCases() {
		return Arrays.asList(new Object[][] {
				{1, "I"},
				{5, "V"},
				{2, "II"},
				{3, "III"},
				{4, "IV"},
				{6, "VI"},
				{9, "IX"},
				{10, "X"},
				{40, "XL"},
				{50, "L"},
				{90, "XC"},
				{100, "C"},
				{400, "CD"},
				{500, "D"},
				{900, "CM"},
				{1000, "M"},
				{2457, "MMCDLVII"}
		});
	}
	
	@Test public void convert_aribic_to_roman() {
		String actualRoman = convertor.convert(aribic);
		assertEquals(expectedRoman, actualRoman);
	}

}
