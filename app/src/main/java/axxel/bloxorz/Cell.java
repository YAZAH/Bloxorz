package axxel.bloxorz;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.drawable.Drawable;


public class Cell {
	private final int CLOSE = 0;
	private final int OPEN = 1;
	private final int TOGGLE = 2;
	private final int FALL = 3;
	private final int NOACTION = 4;
	
	
	/**
	 * Cell image
	 */
	private Drawable image;
	
	/**
	 * Cell image width
	 */
	private int width;
	
	/**
	 * Cell image tempWidth
	 */
	private int tWidth;
	
	/**
	 * Cell image height
	 */
	private int height;
	
	/**
	 * Image top left point
	 */
	private Point point;
	
	/**
	 * Cell type
	 */
	private int type;
	
	/*
	 * Type of button. 0 - switches off the bridge; 1 - switches on the bridge; 2 - toggles the bridge
	 *
	private int buttonType;
	
	/**
	 * Array of bridges, controlled by button
	 *
	private Cell[][] bridges;*/
	
	/**
	 * Array of bridges coordinates and control types (switch on, off or toggle), controlled by button. 
	 * Array: {type, i, j, type_1, i_1, j_1, ....}. 
	 * As max array length is 30, 1 button can control max 10 bridges
	 */
	private int[] bridgesCoordinates;
	
	/**
	 * Bridge state. false - closed; true - opened
	 */
	private boolean isOpened = true;
	
	/**
	 * True for right bridge and false for left bridge
	 */
	private boolean isRight = false;
	
	/**
	 * Array of coordinates of teleport destination
	 */
	private int[] teleportCoordinates = new int[4];
	
	/**
	 * Array of cell types
	 */
	private int[][][] map = null;
	
	/**
	 * Exit of level
	 */
	private boolean isExit = false;
	
	/**
	 * Action for the bridge. OPEN/CLOSE/TOGGLE
	 */
	private int action = NOACTION;
	
	Drawable bridge, empty;
	
	/**
	 * Cell falling speed
	 */
	private int fallingSpeed =15;
	
	/**
	 * Constructor for map cell
	 * @param res (image)
	 * @param map 1 - simple cell; 2 - round button; 3 - cross button; 4 - bridge; 5 - teleport; 6 - start; 7 - exit; 8 - red cell
	 * @param i (point.x)
     * @param j (point.y)
	 */
	Cell(Resources res, int[][][] map, int i, int j) {
		switch (map[i][j][0])
		{
			case 1:	
				initCell(res.getDrawable(R.drawable.cell4), map, i, j);
				break;
			case 2: 
				initCell(res.getDrawable(R.drawable.round_button), map, i, j);
				bridgesCoordinates = new int[map[i][j].length-1];
				for(int c=1; c<map[i][j].length; c++)
					bridgesCoordinates[c-1] = map[i][j][c];
				break;
			case 3: 
				initCell(res.getDrawable(R.drawable.cross_button), map, i, j);
				bridgesCoordinates = new int[map[i][j].length-1];
				for(int c=1; c<map[i][j].length; c++)
					bridgesCoordinates[c-1] = map[i][j][c];
				break;
			case 4:
				this.bridge = res.getDrawable(R.drawable.bridge_1);
				this.empty = res.getDrawable(R.drawable.cell_empty);
				if (map[i][j][1]==1)
				{
					initCell(res.getDrawable(R.drawable.bridge_1), map, i, j);
				}
				else
				{
					isOpened = false;
					initCell(res.getDrawable(R.drawable.cell_empty), map, i, j);
				}
				if (map[i][j][2]==1)
					isRight = true;
				break;
			case 5:
				initCell(res.getDrawable(R.drawable.teleport), map, i, j);
				for (int c=0; c<4; c++)
					teleportCoordinates[c] = map[i][j][c+1];
				break;
			case 6:
				initCell(res.getDrawable(R.drawable.cell4), map, i, j);
				break;
			case 7: 
				initCell(res.getDrawable(R.drawable.exit2), map, i, j);
				isExit = true;
				break;
			case 8:
				initCell(res.getDrawable(R.drawable.cell4_red), map, i, j);
				break;
            case 201:
                initCell(res.getDrawable(R.drawable.lvl1), map, i, j);
                break;
            case 202:
                initCell(res.getDrawable(R.drawable.lvl2), map, i, j);
                break;
            case 203:
            initCell(res.getDrawable(R.drawable.lvl3), map, i, j);
            break;
            case 204:
            initCell(res.getDrawable(R.drawable.lvl4), map, i, j);
            break;
            case 205:
            initCell(res.getDrawable(R.drawable.lvl5), map, i, j);
            break;
            case 206:
            initCell(res.getDrawable(R.drawable.lvl6), map, i, j);
            break;
            case 207:
            initCell(res.getDrawable(R.drawable.lvl7), map, i, j);
            break;
            case 208:
            initCell(res.getDrawable(R.drawable.lvl8), map, i, j);
            break;
            case 209:
            initCell(res.getDrawable(R.drawable.lvl9), map, i, j);
            break;
            case 210:
            initCell(res.getDrawable(R.drawable.lvl10), map, i, j);
            break;
            case 211:
            initCell(res.getDrawable(R.drawable.lvl11), map, i, j);
            break;
            case 212:
            initCell(res.getDrawable(R.drawable.lvl12), map, i, j);
            break;
            case 213:
            initCell(res.getDrawable(R.drawable.lvl13), map, i, j);
            break;
            case 214:
            initCell(res.getDrawable(R.drawable.lvl14), map, i, j);
            break;
            case 215:
            initCell(res.getDrawable(R.drawable.lvl15), map, i, j);
            break;
            case 216:
            initCell(res.getDrawable(R.drawable.lvl16), map, i, j);
            break;
            case 217:
            initCell(res.getDrawable(R.drawable.lvl17), map, i, j);
            break;
            case 218:
            initCell(res.getDrawable(R.drawable.lvl18), map, i, j);
            break;
            case 219:
            initCell(res.getDrawable(R.drawable.lvl19), map, i, j);
            break;
            case 220:
            initCell(res.getDrawable(R.drawable.lvl20), map, i, j);
            break;
            case 221:
            initCell(res.getDrawable(R.drawable.lvl21), map, i, j);
            break;
            case 222:
            initCell(res.getDrawable(R.drawable.lvl22), map, i, j);
            break;
            case 223:
            initCell(res.getDrawable(R.drawable.lvl23), map, i, j);
            break;
            case 224:
            initCell(res.getDrawable(R.drawable.lvl24), map, i, j);
            break;
            case 225:
            initCell(res.getDrawable(R.drawable.lvl25), map, i, j);
            break;
            case 226:
            initCell(res.getDrawable(R.drawable.lvl26), map, i, j);
            break;
            case 227:
            initCell(res.getDrawable(R.drawable.lvl27), map, i, j);
            break;
            case 228:
            initCell(res.getDrawable(R.drawable.lvl28), map, i, j);
            break;
            case 229:
            initCell(res.getDrawable(R.drawable.lvl29), map, i, j);
            break;
            case 230:
            initCell(res.getDrawable(R.drawable.lvl30), map, i, j);
            break;
            case 231:
            initCell(res.getDrawable(R.drawable.lvl31), map, i, j);
            break;
            case 232:
            initCell(res.getDrawable(R.drawable.lvl32), map, i, j);
            break;
            case 233:
            initCell(res.getDrawable(R.drawable.lvl33), map, i, j);
            break;
            case 99:
            initCell(res.getDrawable(R.drawable.v), map, i, j);
            break;
            case 100:
            initCell(res.getDrawable(R.drawable.l), map, i, j);
            break;
		}
	}
	
	private void initCell(Drawable image, int[][][] map, int i, int j) {
		this.image = image;
		initPoint(i, j);

        width = 34;
        height = 22;

		this.image.setBounds(point.x, point.y, point.x + width, point.y + height);
		
		this.map = map;
		type = map[i][j][0];
	}

	public void initPoint(int i, int j)
	{
		point = new Point(365-i*26+j*9, 50+j*14+i*5);
	}

	
	/**
	 * Sets action for bridge. 
	 * @param action OPEN, CLOSE or TOGGLE
	 */
	void setAction(int action)
	{
		this.action = action;
	}
	
	public void refresh() {
		if(type==4){
			switch(action) {
				case NOACTION:
					break;
				case CLOSE:
					if(isOpened) {
						close();
					}
					else {
						//highlight bridge
					}
					break;
				case OPEN:
					if(!isOpened){
						open();
					}
					else {
						//highlight bridge
					}
					break;
				case TOGGLE:
					if(isOpened) {
						close();
					}
					else {
						open();
					}
					break;
			}
		}
		else if(type==8) {
			if(action==FALL) {
				point.y+=fallingSpeed;
				setBounds();
				fallingSpeed+=15;
				
				if(point.y>300) {
					action = NOACTION;
				}
			}
		}
	}
	
	private void open() {
		setImageBridge();
		isOpened = true;
		setAction(NOACTION);
	}
	
	private void close() {
		setImageEmpty();
		isOpened = false;
		setAction(NOACTION);
	}
	
	public void draw(Canvas canvas)
	{
		image.draw(canvas);
	}
	
	public int getType()
	{
		return type;
	}
	
	public boolean isExit()
	{
		return isExit;
	}
	
	public boolean isOpened()
	{
		return isOpened;
	}
	
	int[] getBridgesCoordinates()
	{
		return bridgesCoordinates;
	}
	
	void setBridgeState(boolean state)
	{
		isOpened = state;
	}
	
	void setImageBridge() {
		this.image = bridge;
		setBounds();
	}
	
	void setImageEmpty() {
		this.image = empty;
		setBounds();
	}
	
	void setBounds()
	{
		image.setBounds(point.x, point.y, point.x+width, point.y+height);
	}
	
	int[] getTeleportCoordinates()
	{
		return teleportCoordinates;
	}
}
