package testGame;

import javafx.event.Event;
import javafx.event.EventHandler;

public interface GameEvent<T extends Event> {
	public EventHandler<T> getHandler();
}
