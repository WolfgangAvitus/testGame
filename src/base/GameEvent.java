package base;

import javafx.event.Event;
import javafx.event.EventHandler;

/**
 * Game event class 
 * @author James
 *
 * @param <T> KeyEvent will be mostly used, MouseEvent for map design(?)
 */
public interface GameEvent<T extends Event> {
	public EventHandler<T> getHandler();
}
