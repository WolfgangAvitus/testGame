package base;

import javafx.scene.layout.Pane;

/**
 * Abstract class for states. There will most likely be 3 states implemented: Menu, Playing and Creating
 * @author James
 *
 */
public abstract class State {
	private Pane pane;
	
	abstract public void startUp(); //SHOULD BE CALLED WHEN THE STATE IS CALLED
	abstract public void cleanUp(); //SHOULD BE CALLED WHEN THE STATE IS POPPED FROM THE GAME STATE STACK
	abstract public void update(); //CALLED EVERY TICK OF THE GAME LOOP
	//abstract public void pause(); 
	/**
	 * Above ^ do we want to have a pause functionality for states? Would be useful in changing between playing and creating states
	 */
	
	
	public State() {
		this.pane = new Pane();
		Game.ROOT.getChildren().add(this.pane); //add the state to the javafx game tree
	}
	
	public Pane getPane() {
		return this.pane;
	}
}
