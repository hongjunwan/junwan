package application;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;

public class Main extends Application {
	public Main() {
		System.out.println(Thread.currentThread().getName() + ": AppMain() ȣ��");
	}

	@Override
	public void init() throws Exception {
		System.out.println(Thread.currentThread().getName() + ": init() ȣ��");
	}

	@Override
	public void start(Stage primaryStage) throws Exception{
		System.out.println(Thread.currentThread().getName()+": start() ȣ��");
		primaryStage.show();
	}
	
	@Override
	public void stop() throws Exception{
		System.out.println(Thread.currentThread().getName()+": stop() ȣ��");
	}
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName()+": main() ȣ��");
		launch(args);
	}
}
