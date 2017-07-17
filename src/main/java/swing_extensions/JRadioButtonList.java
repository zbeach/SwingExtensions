package swing_extensions;

import java.awt.Color;
import java.util.ArrayList;

import javax.swing.*;

public class JRadioButtonList extends JPanel {
	// Radio buttons
	private ArrayList<JRadioButton> radioButtons = null;
	
	/**
	 * Constructs a JRadioButtonList object with an empty data set.
	 */
	public JRadioButtonList() {
		this(new String[0]);
	}
	
	/**
	 * Constructs a JRadioButtonList object and sets the data on which it's
	 * built.
	 * @param data A String array containing the text for each JRadioButton
	 */
	public JRadioButtonList(String[] data) {
		this.setBackground(Color.WHITE);
		this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		
		this.radioButtons = new ArrayList<JRadioButton>();
		this.setData(data);
	}
	
	/**
	 * Sets the data on which the JRadioButtonList is built.
	 * @param data A String array containing the text for each JRadioButton
	 */
	public void setData(String[] data) {
		this.radioButtons.clear();
		this.removeAll();
	
		for (int i = 0; i < data.length; i++) {
			this.radioButtons.add(new JRadioButton(data[i]));
			this.add(radioButtons.get(i));
		}
	}
	
	/**
	 * Gets the text from each of the JRadioButton.
	 * @return A String array containing the text from each JRadioButton
	 */
	public String[] getData() {
		String[] data = new String[this.radioButtons.size()];
		
		for (int i = 0; i < data.length; i++)
			data[i] = radioButtons.get(i).getText();
		
		return data;
	}
	
	/**
	 * Gets the text from the JRadioButton at the provided index.
	 * @param index Index at which the JRadioButton is located
	 * @return the text from the JRadioButton at the provided index
	 */
	public String getData(int index) {
		return this.radioButtons.get(index).getText();
	}
	
	/**
	 * Gets the JRadioButton at the provided index.
	 * @param index Index at which the JRadioButton is located
	 * @return the JRadioButton at the provided index
	 */
	public JRadioButton get(int index) {
		return this.radioButtons.get(index);
	}
	
	/**
	 * Gets the selected value.
	 * @return the selected value
	 */
	public String getSelectedValue() {
		for (int i = 0; i < this.radioButtons.size(); i++)
			if (this.radioButtons.get(i).isSelected())
				return this.radioButtons.get(i).getText();
		
		return null;
	}
	
	/**
	 * Gets the selected index.
	 * @return the selected index
	 */
	public int getSelectedIndex() {
		for (int i = 0; i < this.radioButtons.size(); i++)
			if (this.radioButtons.get(i).isSelected())
				return i;
		
		return -1;
	}
	
	/**
	 * Selects the JRadioButton at the provided index, and deselects all the
	 * other JRadioButtons.
	 * @param index JRadioButton at the provided index
	 */
	public void select(int index) {
		// Deselect all radio buttons
		this.deselectAll();
		
		// Select radio button at index
		this.radioButtons.get(index).setSelected(true);
	}
	
	public void deselectAll() {
		// Deselect all radio buttons
		for (int i = 0; i < this.radioButtons.size(); i++)
			this.radioButtons.get(i).setSelected(false);
	}
	
	@Override
	public void setEnabled(boolean enabled) {
		for (int i = 0; i < this.radioButtons.size(); i++)
			this.radioButtons.get(i).setEnabled(enabled);
	}
}
