package hipster.controller;

import hipster.model.Hipster;
import hipster.view.HipsterFrame;

public class HipsterController 
{
	private Hipster firstHipster;
	private HipsterFrame baseFrame;
	
	public void start()
	{
		String myName = baseFrame.getResponce("What is your name?");
		firstHipster.setName(myName);
		baseFrame.setTitle(myName + " 's Hipster Project!");
	}
	
	public Hipster getFirstHipster()
	{
		return firstHipster;
	}
	
	public HipsterFrame getBaseFrame()
	{
		return baseFrame;
	}
}
