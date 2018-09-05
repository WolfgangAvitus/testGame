package engine;

import entities.Entity;

public interface Collision {
	public boolean checkCollision(Entity e1, Entity e2);
	public void onCollision();
}
