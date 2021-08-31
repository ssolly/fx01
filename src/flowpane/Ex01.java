package flowpane;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class Ex01 extends Application {

	@Override
	public void start(Stage arg0) throws Exception {
		
		//FlowPane flowPane = new FlowPane();							//가로정렬
		FlowPane flowPane = new FlowPane(Orientation.VERTICAL);	//세로정렬(옵션)
		
//		Button btn01 = new Button("버튼01");
//		Button btn02 = new Button("버튼02");
//		Button btn03 = new Button("버튼03");
//		
//		flowPane.getChildren().add(btn01);
//		flowPane.getChildren().add(btn02);
//		flowPane.getChildren().add(btn03);
		
		for(int i=1;i<=15; i++) {
			flowPane.getChildren().add(new Button("버튼0"+i));
		}
		
		//padding : 안쪽으로 여백을 준다.   (상,우,하,좌)
		flowPane.setPadding(new Insets(10,10,10,10));
		
		flowPane.setVgap(80); 		//가로
		flowPane.setHgap(10);		//세로
		
		Scene sc = new Scene(flowPane,200,100);
		
		arg0.setScene(sc);
		arg0.setTitle("flowpane");
		arg0.show();
	}

	public static void main(String[] args) {
		
		launch(args);
		
	}
}
