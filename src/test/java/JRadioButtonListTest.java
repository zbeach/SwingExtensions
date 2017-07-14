import org.junit.Test;

import swing_extensions.JCheckBoxList;
import swing_extensions.JRadioButtonList;

import static org.junit.Assert.*;

import java.util.Arrays;

public class JRadioButtonListTest {
	@Test
	public void testJRadioButtonList() {
		JRadioButtonList rbl = new JRadioButtonList();
		
		assert(rbl.getData().length == 0);
	}
	
	@Test
	public void testJRadioButtonList_String_array() {
		String[] data = {"", "a", "b", "aa", "ab"};
		JRadioButtonList rbl = new JRadioButtonList(data);
		
		assert(Arrays.equals(rbl.getData(), data));
	}
	
	@Test
	public void testSetData() {
		JRadioButtonList rbl = new JRadioButtonList();
		
		String[] data = {"", "a", "b", "aa", "ab"};
		
		rbl.setData(data);
		assert(Arrays.equals(data, rbl.getData()));
	}
	
	@Test
	public void testGetData() {
		testSetData();
	}
	
	@Test
	public void testGetData_int() {
		JRadioButtonList rbl = new JRadioButtonList();
		
		String[] data = {"", "a", "b", "aa", "ab"};
		
		rbl.setData(data);
		for (int i = 0; i < data.length; i++)
			assert(rbl.getData(i).equals(data[i]));
	}
	
	@Test
	public void testGetSelectedValue() {
		String[] data = {"", "a", "b", "aa", "ab"};
		JRadioButtonList rbl = new JRadioButtonList(data);
		
		rbl.select(2);
		rbl.select(3);
		rbl.select(1);
		
		String selected = data[1];
		
		assert(selected.equals(rbl.getSelectedValue()));
	}
	
	@Test
	public void testGetSelectedIndex() {
		String[] data = {"", "a", "b", "aa", "ab"};
		JRadioButtonList rbl = new JRadioButtonList(data);
		
		rbl.select(2);
		rbl.select(3);
		rbl.select(1);
		
		int selected = 1;
		
		assert(selected == rbl.getSelectedIndex());
	}
	
	@Test
	public void testSelect() {
		testGetSelectedIndex();
	}
}
