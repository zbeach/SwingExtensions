import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;

public class JCheckBoxListTest {
	@Test
	public void testJCheckBoxList() {
		JCheckBoxList cbl = new JCheckBoxList();
		
		assert(cbl.getData().length == 0);
	}
	
	@Test
	public void testJCheckBoxList_String_array() {
		String[] data = {"", "a", "b", "aa", "ab"};
		JCheckBoxList cbl = new JCheckBoxList(data);
		
		assert(Arrays.equals(cbl.getData(), data));
	}
	
	@Test
	public void testSetData() {
		JCheckBoxList cbl = new JCheckBoxList();
		
		String[] data = {"", "a", "b", "aa", "ab"};
		
		cbl.setData(data);
		assert(Arrays.equals(data, cbl.getData()));
	}
	
	@Test
	public void testGetData() {
		testSetData();
	}
}
