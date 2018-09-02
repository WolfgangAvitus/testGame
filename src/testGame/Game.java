package testGame;

import java.util.Stack;

import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.*;
import javafx.stage.Stage;

public class Game extends Application{
	
	private Stack<State> states;
	
	public static int WINX = 800;
	public static int WINY = 800;
	public static int NUMGRIDX = 20;
	public static int NUMGRIDY = 20;
	
	public static Group ROOT;
	public static Scene SCENE;
	public static ResourceManager RESOURCES = new ResourceManager();
	
	@Override
	public void start(Stage stage) throws Exception {
		states = new Stack<State>();
		Game.ROOT = new Group();
		Game.SCENE = new Scene(ROOT, WINX, WINY);
		
		
		AnimationTimer timer = new AnimationTimer() {
			@Override
			public void handle(long arg0) {
				State currState = states.peek();
				currState.update();
			}
		};
		
		
		states.push(new TestState());
		timer.start();
		stage.setScene(Game.SCENE);
		stage.show();
	}

	
	
	public static void main(String[] args) {
		launch(args);
	}

}
