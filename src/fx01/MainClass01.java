package fx01;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;		// awt→swing→javafx
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class MainClass01 extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage arg0) throws Exception {
					//stage : 무대
		
		Label lb = new Label("Hello world");
		lb.setFont(new Font(20));
		
		//Scene scene = new Scene(lb);
		Scene scene = new Scene(lb, 200,100);	//가로 세로 사이즈
							//  ↑ scene에는 무조건 하나만 들어갈 수 있다
		
		arg0.setScene(scene);
		arg0.setTitle("연습중");	//타이틀 설정
		arg0.show();			
		
	}
	
	
}
