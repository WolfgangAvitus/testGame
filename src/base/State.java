package base;

import javafx.scene.layout.Pane;

public abstract class State {
	private Pane pane;
	
	abstract public void startUp();
	abstract public void cleanUp();
	abstract public void update();
	
	
	public State() {
		this.pane = new Pane();
		Game.ROOT.getChildren().add(this.pane);
	}
	
	public Pane getPane() {
		return this.pane;
	}
}
