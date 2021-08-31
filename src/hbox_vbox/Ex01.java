package hbox_vbox;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Ex01 extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage arg0) throws Exception {

		HBox hbox = new HBox();		//가로
		Button btn1 = new Button("btn1");
		Button btn2 = new Button("btn2");
		Button btn3 = new Button("btn3");
		
		VBox vbox = new VBox();
		Label lb1 = new Label("label1");
		Label lb2 = new Label("label2");
		Label lb3 = new Label("label3");
		
		vbox.getChildren().addAll(lb1,lb2,lb3);
		vbox.setSpacing(20);
		
		hbox.getChildren().addAll(btn1,btn2,btn3,vbox);
		hbox.setSpacing(20);		//공간 띄어주기
		
		arg0.setScene(new Scene(hbox,300,300));
		arg0.setTitle("hbox_vbox");
		arg0.show();
		
	}
}
