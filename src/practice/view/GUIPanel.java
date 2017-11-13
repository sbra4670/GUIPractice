package practice.view;

import javax.swing.JPanel;
import practice.controller.PracticeController;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.SpringLayout;



public class GUIPanel extends JPanel
{
	private PracticeController appController;
	
	public GUIPanel(PracticeController appController)
	{
		super();
		this.appController = appController;
	}
}
