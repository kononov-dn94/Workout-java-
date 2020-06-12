public class Robot {
	int x=0;
	int y=0;
	Direction direction = Direction.UP;

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
		System.out.println("Поворот против часовой стрелки");

		if (direction == Direction.DOWN) {
			this.direction = Direction.RIGHT;
			return;
		}
        
		if (direction == Direction.UP) {
			this.direction = Direction.LEFT;
			return;
		}
        
		if (direction == Direction.LEFT) {
			this.direction = Direction.DOWN;
			return;
		}
        
		if (direction == Direction.RIGHT) {
			this.direction = Direction.UP;
			return;
		}
	}

	public void turnRight() {
		System.out.println("Поворот по часовой стрелке");
		if (this.direction == Direction.DOWN) {
			System.out.println("Вниз -> влево");
			this.direction = Direction.LEFT;
			return;
		}
        
		if (this.direction == Direction.UP) {
			System.out.println("Вверх -> вправо");
			this.direction = Direction.RIGHT;
			return;
		}
        
		if (this.direction == Direction.LEFT) {
			System.out.println("Влево -> вверх");
			this.direction = Direction.UP;
			return;
		}
        
		if (this.direction == Direction.RIGHT) {
			System.out.println("Вправо -> вниз");
			this.direction = Direction.DOWN;
			return;
		}
	}

	public void stepForward() {
		System.out.println("Движение");
		if (direction == Direction.DOWN) {
			System.out.println("Вниз");
			this.y--;
		}
        
		if (direction == Direction.UP) {
			System.out.println("Вверх");
			this.y++;
		}
        
		if (direction == Direction.LEFT) {
			System.out.println("Налево");
			this.x--;
		}
        
		if (direction == Direction.RIGHT) {
			System.out.println("направо");
			this.x++;
		}
	}
}
