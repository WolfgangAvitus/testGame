package testGame;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Stack;

import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.*;
import javafx.scene.image.*;
import javafx.stage.Stage;

public class Game extends Application{
	
	private Stack<State> states;
	
	public static Group ROOT;
	public static ResourceManager RESOURCES = new ResourceManager();
	
	@Override
	public void start(Stage stage) throws Exception {
		Game.ROOT = new Group();
		Scene scene = new Scene(ROOT, 600, 600);
		
		AnimationTimer timer = new AnimationTimer() {
			@Override
			public void handle(long arg0) {
				State currState = states.peek();
				currState.update();
			}
		};
		
		states.push(new TestState());
		
		stage.setScene(scene);
		stage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}

}
