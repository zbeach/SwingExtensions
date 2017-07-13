import org.junit.Test;

import swing_extensions.JCheckBoxList;

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
	
	@Test
	public void testGetData_int() {
		JCheckBoxList cbl = new JCheckBoxList();
		
		String[] data = {"", "a", "b", "aa", "ab"};
		
		cbl.setData(data);
		for (int i = 0; i < data.length; i++)
			assert(cbl.getData(i).equals(data[i]));
	}
	
	@Test
	public void testGetSelectedValues() {
		String[] data = {"", "a", "b", "aa", "ab"};
		JCheckBoxList cbl = new JCheckBoxList(data);
		
		cbl.select(2);
		cbl.select(3);
		
		String[] selected = {data[2], data[3]};
		
		assert(Arrays.equals(selected, cbl.getSelectedValues()));
	}

	@Test
	public void testGetSelectedIndices() {
		String[] data = {"", "a", "b", "aa", "ab"};
		JCheckBoxList cbl = new JCheckBoxList(data);
		
		cbl.select(2);
		cbl.select(3);
		
		int[] selectedIndices = {2, 3};
		
		assert(Arrays.equals(selectedIndices, cbl.getSelectedIndices()));
	}

	@Test
	public void testSelect() {
		testGetSelectedValues();
		testGetSelectedIndices();
	}
	
	@Test
	public void testDeselect() {
		String[] data = {"", "a", "b", "aa", "ab"};
		JCheckBoxList cbl = new JCheckBoxList(data);
		
		cbl.selectAll();
		
		cbl.deselect(0);
		cbl.deselect(1);
		cbl.deselect(4);
		
		String[] selected = {data[2], data[3]};
		
		assert(Arrays.equals(selected, cbl.getSelectedValues()));
	}

	@Test
	public void testSelectAll() {
		String[] data = {"", "a", "b", "aa", "ab"};
		JCheckBoxList cbl = new JCheckBoxList(data);
		
		cbl.selectAll();
		
		assert(Arrays.equals(cbl.getData(), cbl.getSelectedValues()));
	}
	
	@Test
	public void testDeselectAll() {
		String[] data = {"", "a", "b", "aa", "ab"};
		JCheckBoxList cbl = new JCheckBoxList(data);
		
		cbl.deselectAll();
		
		assert(Arrays.equals(new String[0], cbl.getSelectedValues()));
	}
}
