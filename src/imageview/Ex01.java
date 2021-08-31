package imageview;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Ex01 extends Application {

	@Override
	public void start(Stage arg0) throws Exception {
		AnchorPane ap = new AnchorPane();
		ImageView iv = new ImageView("/img/smilerere.png");
		//iv.setImage(new Image("/img/calendar.png"));
		
		//iv.setFitHeight(100);		//높이
		iv.setFitWidth(80);			//넓이
		iv.setPreserveRatio(true);	//사이즈 한개를 설정하면 자동으로 맞춰서 사이즈를 설정
		iv.setRotate(45);			//45도만큼 회전
		ap.getChildren().add(iv);
		
		arg0.setScene(new Scene(ap,300,200));
		arg0.setTitle("imageview");
		arg0.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}

}
