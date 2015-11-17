package hipster.view;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import hipster.controller.HipsterController;

public class HipsterFrame extends JFrame
{
	private HipsterController baseController;
	private HipsterPanel basePanel;
	
	public HipsterFrame(HipsterController baseController)
	{
		this.baseController = baseController;
		basePanel = new HipsterPanel(baseController);
		setupFrame();
	}
	
	public String getRespone(String prompt)
	{
		String responce = JOptionPane.showInputDialog(this, prompt);
		return responce;
	}
	
	private void setupFrame()
	{
		this.setContentPane(basePanel);
		this.setSize(500,500);
		this.setResizable(false);
		this.setVisible(true);
	}
	
	public HipsterController getBaseController()
	{
		return baseController;
	}
	

}
