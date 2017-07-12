import java.util.ArrayList;

import javax.swing.*;

public class JCheckBoxList extends JPanel {
	// Check boxes
	private ArrayList<JCheckBox> checkBoxes;
	
	/**
	 * Constructs a JCheckBoxList object with an empty data set.
	 */
	public JCheckBoxList() {
		this(new String[0]);
	}
	
	/**
	 * Constructs a JCheckBoxList object and sets the data on which it's built.
	 * @param data A String array containing the text for each JCheckBox
	 */
	public JCheckBoxList(String[] data) {
		this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		
		this.setData(data);
	}
	
	/**
	 * Sets the data on which the JCheckBoxList is built.
	 * @param data A String array containing the text for each JCheckBox
	 */
	public void setData(String[] data) {
		this.checkBoxes = new ArrayList<JCheckBox>();
	
		for (int i = 0; i < data.length; i++) {
			this.checkBoxes.add(new JCheckBox(data[i]));
			this.add(checkBoxes.get(i));
		}
	}
	
	/**
	 * Gets the text from each of the JCheckBoxes
	 * @return A String array containing the text from each JCheckBox
	 */
	public String[] getData() {
		String[] data = new String[this.checkBoxes.size()];
		
		for (int i = 0; i < data.length; i++)
			data[i] = checkBoxes.get(i).getText();
		
		return data;
	}
}
