package practice.view;

import javax.swing.JPanel;
import practice.controller.PracticeController;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.SpringLayout;



public class GUIPanel extends JPanel
{
	private PracticeController appController;
	private SpringLayout appLayout;
	private JButton firstButton;
	
	public GUIPanel(PracticeController appController)
	{
		super();
		this.appController = appController;
		firstButton = new JButton("Click on me!");
		
		setupPanel();
	}
	
	/**
	 * Used to add all components to the screen and install a layout manager.
	 * Also set da color ;)
	 */
	
	
	private void setupPanel()
	{
		this.setBackground(Color.GRAY);
		this.add(firstButton);
	}
	
	private void setupLayout()
	{
		
	}
	
	private void setupListeners()
	{
		
	}
	
}
