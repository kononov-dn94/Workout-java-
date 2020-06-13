
/*	int direction; 
	0 - UP
	1 - DOWN
	2 - RIGHT
	3 - LEFT

	///
	String direction;

	direction = "UP";
	direction = "DOWN";
	direction = "RIGHT";
	direction = "LEFT";*/

enum Direction {
	UP,
	DOWN,
	RIGHT,
	LEFT,
	v
}


class Robot {

	Direction direction;
	int x = 0;
	int y = 0;

	public Robot (int x, int y, Direction direction) {
		this.x = x;
		this.y = y;
		this.direction = direction;
	}
	
	public Direction getDirection() {
		return direction;
	}
	
	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public void turnLeft() {

		switch(direction) {
			case UP:
				direction = Direction.LEFT;
				break;

			case LEFT:
				direction = Direction.DOWN;
				break;

			case DOWN:
				direction = Direction.RIGHT;
				break;

			case RIGHT:
				direction = Direction.UP;
				break;
		}
	}

	/*public void turnLeft() { //функция поворота влево


		if(direction == Direction.UP) {
			direction = Direction.LEFT;
		}

		else if(direction == Direction.LEFT) {
			direction = Direction.DOWN;
		}

		else if(direction == Direction.DOWN) {
			direction = Direction.RIGHT;
		}

		else if(direction == Direction.RIGHT){
			direction = Direction.UP;
		}
	}*/

	public void turnRight() { //функция поворота вправо
		if(direction == Direction.UP) {
			direction = Direction.RIGHT;
		}

		else if(direction == Direction.RIGHT) {
			direction = Direction.DOWN;
		}

		else if(direction == Direction.DOWN) {
			direction = Direction.LEFT;
		}

		else if(direction == Direction.LEFT) {
			direction = Direction.UP;
		}
	}

	public void stepForward() {
		if(direction == Direction.UP) {
			y++;
		}

		if(direction == Direction.RIGHT) {
			x++;
		}

		if(direction == Direction.DOWN) {
			y--;
		}

		if(direction == Direction.LEFT) {
			x--;
		}
	}
}


class testRobot {

	/*Object Robot1 {
		x = 3;
		y = 5;
		direction = UP;
	}*/

	/*Object Robot2 {
		x = 10;
		y = 10;
		direction = DOWN;
	}*/
	moveRobot

	public void moveRobot(Robot Robot1, int toX, int toY) {
		/*Object Robot1 {
			x = 3;
			y = 5;
			direction = UP;
		}*/
		// x = -2; y = -1;


		Robot1.stepForward();
		Robot1.turnLeft();
	}  

	public static void main(String[] args) {
		Robot Robot1 = new Robot(0, 0, Direction.UP);
		System.out.println(Robot1.getDirection());
		System.out.println(Robot1.getX());
		System.out.println(Robot1.getY());
		
		Robot1.stepForward();
		/*Object Robot1 {
			x = 0;
			y = 1;
			direction = UP;
		}*/
		Robot1.stepForward();
		/*Object Robot1 {
			x = 0;
			y = 2;
			direction = UP;
		}*/
		Robot1.turnRight();		

		Robot1.stepForward();

		moveRobot(Robot1, 1, 2);

		System.out.println(Robot1.getDirection());
		System.out.println(Robot1.getX());
		System.out.println(Robot1.getY());

	}
}



/*Object Robot {
	int x;
	int y;
	Direction direction = { UP, DOWN, LEFT, RIGHT };
	String name;
}*/