package base;

import java.util.Stack;

import engine.ResourceManager;
import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.*;
import javafx.stage.Stage;

public class Game extends Application{
	
	private Stack<State> states;
	
	public static int WINDIM = 800;
	public static int NUMGRID = 20; //number of grids in a column
	public static double GRIDLEN = Game.WINDIM/Game.NUMGRID;
	
	public static Group ROOT;
	public static Scene SCENE;
	public static ResourceManager RESOURCES = new ResourceManager();
	
	@Override
	public void start(Stage stage) throws Exception {
		states = new Stack<State>();
		Game.ROOT = new Group();
		Game.SCENE = new Scene(ROOT, WINDIM, WINDIM);
		
		
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
