package base;

import java.util.Stack;

import engine.ResourceManager;
import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.*;
import javafx.stage.Stage;

/**
 * Entry point for the game
 * @author James
 *
 */
public class Game extends Application{
	
	private Stack<State> states;
	
	public static int WINDIM = 800;
	public static int NUMGRIDCOL = 10; //number of grids in a column
	public static int TOTALGRIDS = NUMGRIDCOL * NUMGRIDCOL;
	public static double GRIDLEN = WINDIM/NUMGRIDCOL;
	
	public static Group ROOT;
	public static Scene SCENE;
	public static ResourceManager RESOURCES = new ResourceManager();
	
	@Override
	public void start(Stage stage) throws Exception {
		states = new Stack<State>();
		Game.ROOT = new Group();
		Game.SCENE = new Scene(ROOT, WINDIM, WINDIM);
		
		
		/**
		 * main game loop. 
		 */
		AnimationTimer timer = new AnimationTimer() {
			/**
			 * handle is called 60(?) times per second. In each loop, check the current state and update it
			 */
			@Override
			public void handle(long arg0) {
				State currState = states.peek();
				currState.update();
			}
		};
		
		/**
		 * Game setup. starts loop and shows window
		 */
		states.push(new TestState());
		timer.start();
		stage.setScene(Game.SCENE);
		stage.show();
	}

	
	
	public static void main(String[] args) {
		launch(args);
	}

}
