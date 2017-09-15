package application;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;

public class Main extends Application {
	public Main() {
		System.out.println(Thread.currentThread().getName() + ": AppMain() 호출");
	}

	@Override
	public void init() throws Exception {
		System.out.println(Thread.currentThread().getName() + ": init() 호출");
	}

	@Override
	public void start(Stage primaryStage) throws Exception{
		System.out.println(Thread.currentThread().getName()+": start() 호출");
		primaryStage.show();
	}
	
	@Override
	public void stop() throws Exception{
		System.out.println(Thread.currentThread().getName()+": stop() 호출");
	}
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName()+": main() 호출");
		launch(args);
	}
}
