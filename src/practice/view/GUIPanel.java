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
		appLayout = new SpringLayout();

		
		setupPanel();
		setupLayout();
	}
	
	/**
	 * Used to add all components to the screen and install a layout manager.
	 * Also set da color ;)
	 */
	
	
	private void setupPanel()
	{
		this.setBackground(Color.GRAY);
		this.setLayout(appLayout);
		this.add(firstButton);
	}
	
	/**
	 * Used to hold the constraint positioning for SpringLayout.
	 * AKA a giant dumping ground for all the xxxx.putConstraint(....) lines.
	 */
	
	
	private void setupLayout()
	{
		appLayout.putConstraint(SpringLayout.NORTH, firstButton, 134, SpringLayout.NORTH, this);
		appLayout.putConstraint(SpringLayout.WEST, firstButton, 162, SpringLayout.WEST, this);
	}
	
	private void setupListeners()
	{
		
	}
	
}
