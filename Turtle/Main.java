public class Main {
    public static void main(String[] args) {
        String[] steps = {"2","5,12","3","5,12","3","5,12","3","5,12","1","6","9"};
        Turtle turtle = new Turtle();

        for(String command : steps){
            switch(command){
                case "1" -> {
                        turtle.setPenDown(command);
                }
                case "2" -> {
                    turtle.setPenDown(command);
                }
                case "3"-> {
                    turtle.setTurning(command);
                }
                case "4" -> {
                    turtle.setTurning(command);
                }
                case "5,12" -> {
                    if(turtle.getPenDown()) turtle.draw(command);
                    if(!turtle.getPenDown()) turtle.move(command);
                }
                case "6" -> {
                    turtle.getFloor();
                }
                case "9" -> {
                    break;
                }
            }
        }
    }
    
    
}
