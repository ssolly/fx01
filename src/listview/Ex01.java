package listview;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Ex01 extends Application {
	
	@Override
	public void start(Stage arg0) throws Exception {
		
		AnchorPane ap = new AnchorPane();
		ListView<String> listView = new ListView<String>();
		
		listView.getItems().addAll("item1","item2","item3");
		listView.setPrefSize(100, 100);			//list에 대한 사이즈
		listView.setLayoutX(20);	//x축
		listView.setLayoutY(40);	//y축
		
		ap.getChildren().add(listView);
		ap.setPrefSize(300, 200);				//scene에 대한 사이즈
		
		arg0.setScene(new Scene(ap));
		arg0.setTitle("listView");
		arg0.show();
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}

}
