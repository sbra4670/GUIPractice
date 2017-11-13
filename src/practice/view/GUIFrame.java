package practice.view;

import practice.controller.PracticeController;
import javax.swing.JFrame;

public class GUIFrame extends JFrame
{

	private PracticeController appController;
	private GUIPanel appPanel;
	
	public GUIFrame(PracticeController appController)
	{
		super();
		this.appController = appController;
		this.appPanel = new GUIPanel(appController);
		
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setContentPane(appPanel);
		this.setTitle("GUI");
		this.setSize(500, 500);
		this.setResizable(true);
		this.setVisible(true);
	}

}
