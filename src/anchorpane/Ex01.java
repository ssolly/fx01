package anchorpane;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Ex01 extends Application {

	@Override
	public void start(Stage arg0) throws Exception {
		
		AnchorPane ap = new AnchorPane();	//좌표로 움직이는 팬
		Button btn1 = new Button();
		Button btn2 = new Button();
		
		AnchorPane.setTopAnchor(btn1, 10.0);
		AnchorPane.setRightAnchor(btn1,10.0);
		
		AnchorPane.setBottomAnchor(btn2, 10.0);
		AnchorPane.setLeftAnchor(btn2, 10.0);
		
		ap.getChildren().addAll(btn1,btn2);
		arg0.setScene(new Scene(ap,300,300));
		arg0.setTitle("anchorpane");
		arg0.show();
		
	}
	
	public static void main(String[] args) {
		
		launch(args);
	}

}
