


import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.Tooltip;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

/**
 * This panel is the basic panel, inside which other panels are placed.  
 * Before beginning to implement, design the structure of your GUI in order to 
 * understand what panels go inside which ones, and what buttons or other components
 * go in which panels.  
 * @author ralexander
 *
 */
//make the main panel's layout be a VBox
public class FXMainPane extends VBox {

	//student Task #2:
	//  declare five buttons, a label, and a textfield
	Button hello = new Button("Hello");
	Button howdy = new Button("Howdy");
	Button chinese = new Button("Chinese");
	Button clear = new Button("Clear");
	Button exit = new Button("Exit");
	Label label = new Label("Feedback");
	TextField text = new TextField();
	//  declare two HBoxes
	HBox box1 = new HBox();
	HBox box2 = new HBox();
	//student Task #4:
	//  declare an instance of DataManager
	DataManager data = new DataManager();
	/**
	 * The MainPanel constructor sets up the entire GUI in this approach.  Remember to
	 * wait to add a component to its containing component until the container has
	 * been created.  This is the only constraint on the order in which the following 
	 * statements appear.
	 */
	FXMainPane() {
		//student Task #2:
		//  instantiate the buttons, label, and textfield
		hello.setOnAction(new ButtonHandler());
		howdy.setOnAction(new ButtonHandler());
		chinese.setOnAction(new ButtonHandler());
		clear.setOnAction(new ButtonHandler());
		exit.setOnAction(new ButtonHandler());
		//  instantiate the HBoxes
		HBox box1 = new HBox();
		HBox box2 = new HBox();
		//student Task #4:
		//  instantiate the DataManager instance
		//  set margins and set alignment of the components
		
		box1.setAlignment(Pos.CENTER); 
		box2.setAlignment(Pos.CENTER); 
		
		
		
		//student Task #3:
		//  add the label and textfield to one of the HBoxes
		box1.getChildren().addAll(label, text);
		//  add the buttons to the other HBox
		box2.getChildren().addAll(hello, howdy, chinese, clear, exit);
		//  add the HBoxes to this FXMainPanel (a VBox)
		getChildren().addAll(box2, box1);  
	}
	
	//Task #4:
	//  create a private inner class to handle the button clicks
		class ButtonHandler implements EventHandler<ActionEvent> {
			
		
		@Override
		public void handle(ActionEvent event) {	
			
			if(event.getTarget() == hello) {
				text.setText("Hello");
			} else if(event.getTarget() == howdy) {
				text.setText("Howdy");
			} else if(event.getTarget() == chinese) {
				text.setText("Chinese");
			} else if(event.getTarget() == clear) {
				text.setText("");
			} else if(event.getTarget() == exit) {
				Platform.exit();
				System.exit(0);
			}
		}
			
			

		}
}
	
