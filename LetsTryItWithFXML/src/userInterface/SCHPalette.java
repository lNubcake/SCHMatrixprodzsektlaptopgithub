package userInterface;

import userInterface.SCHColor;
import javafx.geometry.Insets;
import javafx.scene.control.ColorPicker;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;

public class SCHPalette
{
	public VBox myPalette;
	
	public SCHPalette()
	{
		myPalette = new VBox();
		myPalette.setPadding(new Insets(5));
		myPalette.getChildren().add(new SCHColor(Color.BLACK));
		myPalette.getChildren().add(new SCHColor(Color.BLUE));
		myPalette.setVisible(true);
	}
	
}
