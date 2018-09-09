package engine;

import base.Game;

/**
 * essentially a euclidean 2d vector class except it contains a gridIdx. For simplicity a 
 * 2d array was not used to represent the grid world
 * @author James
 *
 */
public class GridPosition {
	private int gridIdx;
	private double xPos;
	private double yPos;
	
	public GridPosition(int idx) {
		this.gridIdx = idx;
		this.xPos = getGridXFromIdx(idx);
		this.yPos = getGridYFromIdx(idx);
	}
	
	
	public int getIdx() {
		return gridIdx;
	}
	
	public double getX() {
		return xPos;
	}
	
	public double getY() {
		return yPos;
	}
	
	public void moveLeft() {
		this.gridIdx -= 1;
		updateXY();
	}
	
	public void moveRight() {
		this.gridIdx += 1;
		updateXY();
	}
	
	public void moveUp() {
		this.gridIdx -= Game.NUMGRIDCOL;
		updateXY();
	}
	
	public void moveDown() {
		this.gridIdx += Game.NUMGRIDCOL;
		updateXY();
	}
	
	public void updateXY() {
		this.xPos = getGridXFromIdx(this.gridIdx);
		this.yPos = getGridYFromIdx(this.gridIdx);
	}
	
	/**
	 * Gets the x location on screen in terms of the grid number
	 * @param idx
	 * @return
	 */
	public double getGridXFromIdx(int idx){
		if (idx < 0){
			return Game.GRIDLEN/2;
		}
		if (idx > Game.TOTALGRIDS){
			return Game.WINDIM - Game.GRIDLEN/2;
		}
		return idx%Game.NUMGRIDCOL * Game.GRIDLEN;
	}
	
	public double getGridYFromIdx(int idx){
		if (idx < 0){
			return Game.GRIDLEN/2;
		}
		if (idx > Game.TOTALGRIDS){
			return Game.WINDIM - Game.GRIDLEN/2;
		}
		return (int)Math.floor(idx/Game.NUMGRIDCOL) * Game.GRIDLEN;
	}
	
	public int getGridIdxFromCoords(double x, double y){
		//ADD ERROR CHECKING!!!!!!!
		///IMPORTANT
		int xpos = (int)Math.floor(x%Game.GRIDLEN);
		int ypos = (int)Math.floor(y%Game.GRIDLEN);
		
		if (ypos%2 == 0){ //if even
			return ypos*2 + xpos;
		}
		else{//y is odd
			return ypos*2 + xpos + 1;
		}
	}

}