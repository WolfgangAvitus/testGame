package entities;

import base.Game;
import base.World;
import engine.GridPosition;
import javafx.scene.image.Image;

public class Enemy1 extends Entity{

	public Enemy1(GridPosition pos, World world) {
		super(new Image(Game.RESOURCES.getResource("enemy1.png")), pos);
	}

	@Override
	public void update(World world) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		
	}

}
