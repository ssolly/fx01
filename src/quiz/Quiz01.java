package quiz;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/*
public class Quiz01 extends Application{

	@Override
	public void start(Stage arg0) throws Exception {
		
		FlowPane flowpane = new FlowPane();
		FlowPane flowpane02 = new FlowPane(Orientation.VERTICAL);
		FlowPane flowpane03 = new FlowPane(Orientation.VERTICAL);
		FlowPane flowpane04 = new FlowPane();
		BorderPane borderpane = new BorderPane();
		GridPane gridpane = new GridPane();
		
		Label label_menu = new Label("메뉴");
		Label label_home = new Label("홈");
		Label label_login = new Label("로그인");
		flowpane.getChildren().addAll(label_menu,label_home,label_login);
		
		Button btn = new Button("메뉴 나열");
		flowpane02.getChildren().add(btn);
		
		Button btn02 = new Button("내용 들어가는 곳");
		flowpane03.getChildren().add(btn02);
		
		Button id = new Button("아이디 입력");
		GridPane.setConstraints(id, 0, 0);
		Button pass = new Button("비밀번호 입력");
		GridPane.setConstraints(pass, 0, 1);
		Button login = new Button("로그인");
		GridPane.setConstraints(login, 1,1,1,2);
		gridpane.getChildren().addAll(id,pass,login);
		gridpane.setPadding(new Insets(20));
		
		Button btn03 = new Button("바닥글 들어가는 곳");
		flowpane04.getChildren().add(btn03);
		
		borderpane.setTop(flowpane);
		borderpane.setLeft(flowpane02);
		borderpane.setCenter(flowpane03);
		borderpane.setRight(gridpane);
		borderpane.setBottom(flowpane04);
		
		arg0.setScene(new Scene(borderpane,300,300));
		arg0.setTitle("Quiz01");
		arg0.show();
		
	}
*/

// 선생님 버전
public class Quiz01 extends Application{

	@Override
	public void start(Stage arg0) throws Exception {
		
		BorderPane bp = new BorderPane();
		
		Label labelMenu = new Label();
		labelMenu.setText("메뉴");
		Label labelHome = new Label("홈");
		Label labelLogin = new Label("로그인");
		
		FlowPane topPane = new FlowPane();
		topPane.getChildren().addAll(labelMenu,labelHome,labelLogin);
		topPane.setAlignment(Pos.CENTER_RIGHT);
		topPane.setHgap(30);
		topPane.setPadding(new Insets(10,30,10,0));
		topPane.setStyle("-fx-background-color:pink;");
		topPane.setPrefSize(500, 50);
		bp.setTop(topPane);
		
		FlowPane leftPane = new FlowPane();
		Button leftBtn = new Button("메뉴 나열");
		leftPane.getChildren().add(leftBtn);
		leftPane.setStyle("-fx-background-color:skyblue;");
		leftPane.setPrefSize(100, 300);
		bp.setLeft(leftPane);
		
		FlowPane centerPane = new FlowPane();
		Button centerBtn = new Button("내용 들어가는 곳");
		centerPane.getChildren().add(centerBtn);
		centerPane.setStyle("-fx-background-color:#CEF279;");	//RGB팔레트
		bp.setCenter(centerPane);
		
		FlowPane bottomPane = new FlowPane();
		Button bottomBtn = new Button("바닥글 들어가는 곳");
		//bottomBtn.setPrefSize(500,50);
		bottomPane.setAlignment(Pos.CENTER);
		bottomPane.getChildren().add(bottomBtn);
		bottomPane.setStyle("-fx-background-color:orange;");
		bp.setBottom(bottomPane);
		
		GridPane rightPane = new GridPane();
		Button idBtn = new Button("아이디 입력");
		idBtn.setPrefSize(100,20);
		Button pwdBtn = new Button("비밀번호 입력");
		pwdBtn.setPrefSize(100,20);
		Button loginBtn = new Button("로그인");
		loginBtn.setPrefSize(70,40);
		rightPane.add(idBtn, 0, 0);
		rightPane.add(pwdBtn, 0, 1);
		rightPane.add(loginBtn, 1, 0, 1, 2);
		rightPane.setPadding(new Insets(50,20,0,20));
		rightPane.setStyle("-fx-background-color:yellow;");
		rightPane.setPrefSize(200, 350);
		bp.setRight(rightPane);
		
		arg0.setScene(new Scene(bp,500,400));
		arg0.show();
		
	}
	


	public static void main(String[] args) {
		launch(args);
	}

}
