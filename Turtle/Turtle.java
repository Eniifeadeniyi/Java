package Turtle;
public class Turtle {

	private int[][] floor = new int[20][20];
	private boolean isRow;
	private boolean penDown;
	private int turning;
	private int row;
	private int column;


	public void setPenDown(String command){
		if(command.equals("1")) penDown = false;
		if(command.equals("2")) penDown = true;
	}

	public void setTurning(String command){
		if(command.equals("3")){
			turning++;
			if(turning > 3) turning = 0;
		}
		if(command.equals("4")){
			turning--;
			if(turning < -3) turning = 0;
		}
		setIsRow();
	}

    public int getRow(){
        return row;
    }

    public int getColumn(){
        return column;
    }

	public int getTurning(){
		return turning;
	}

	public boolean getPenDown(){
		return penDown;
	}

	public void setIsRow(){
		if(turning == 0 || turning == 2 || turning == -2) isRow = false;
		else isRow = true;
	}

	public boolean getIsRow(){
		return isRow;
	}

	public void move(String commands){
		String[] input = commands.split(",");
		if(!isRow){
			if(turning == 0){
				for(int count = 1; count <= Integer.parseInt(input[1]); count++){
					if(column != 19)column++;
				}
			}
			if(turning == 2 || turning == -2){
				for(int count = 1; count <= Integer.parseInt(input[1]); count++){
					if(column > 0) column--;
				}
			}
		}
		if(isRow){
			if(turning == 3 || turning == -1){
				for(int count = 1; count <= Integer.parseInt(input[1]); count++){
					if(row > 0) row--;
				}
			}
			if(turning == 1 || turning == -3){
				for(int count = 1; count <= Integer.parseInt(input[1]); count++){
					if(row != 19) row++;
				}
			}
		}
	}

	public void draw(String commands){
		String[] input = commands.split(",");
		if(!isRow){
			if(turning == 0){
				for(int count = 1; count <= Integer.parseInt(input[1]); count++){
					if(column != 19){
						column++;
						floor[row][column] = 1;
					}
				}
			}
			if(turning == 2 || turning == -2){
				for(int count = 1; count <= Integer.parseInt(input[1]); count++){
					if(column > 0) {
						column--;
						floor[row][column] = 1;
					}
				}
			}
		}
		if(isRow){
			if(turning == 3 || turning == -1){
				for(int count = 1; count <= Integer.parseInt(input[1]); count++){
					if(row > 0) {
						row--;
						floor[row][column] = 1;
					}
				}
			}
			if(turning == 1 || turning == -3){
				for(int count = 1; count <= Integer.parseInt(input[1]); count++){
					if(row != 19) {
						row++;
						floor[row][column] = 1;
					}
				}
			}
		}
	}

    public int getSpotOnFloor(int count, int counter){
        return floor[count][counter];
    }

    public void getFloor(){
		for(int count = 0; count < 20; count++){
			for(int counter = 0; counter < 20; counter++){
				if(floor[count][counter] == 1) System.out.print("*");
				else System.out.print(" ");
			}
		System.out.println();
		}
	}
}