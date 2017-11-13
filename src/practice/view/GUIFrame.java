package practice.view;

import practice.controller.PracticeController;
import javax.swing.JFrame;

public class GUIFrame extends JFrame
{

	private PracticeController appController;
	
	public GUIFrame(PracticeController appController)
	{
		super();
		this.appController = appController;
		
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setTitle("GUI");
		this.setSize(500, 500);
		
		this.setVisible(true);
	}

}
