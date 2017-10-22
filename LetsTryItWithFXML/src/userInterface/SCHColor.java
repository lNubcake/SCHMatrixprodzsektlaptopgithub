package userInterface;

import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class SCHColor extends Rectangle
{
	public SCHColor(Color hexColor) 
	{
		super();
		this.setHeight(15);
		this.setWidth(15);
		this.setFill(hexColor);
		this.setVisible(true);
	}
	// TODO finish this later
	/*
	@Override
	public void onMousePressed()
	{
		
	}
	*/
}
