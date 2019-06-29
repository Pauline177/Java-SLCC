/**********************************************
 * Author: Pauline Makoma
 *
 * RobotApp solved three challenges where a
 * robot needs to figure out the number
 * of rooms in a given grid.
 *
 * Important:
 * The code still needs to work when you change
 * the values of the variables n, h, and w.
 ***********************************************/

public class RobotApp {
    public static void main(String[] args) {
        // square 4x4 grid to demo how the robot can be controlled
        Robot robot = new Robot(4, 4, 3, 0);


        int n = 7;
        int h = 5;
        int w = 6;

        //1 square nxn grid with the robot in the north-east corner
        robot = new Robot(n, n, n-1, 0);
        challenge1(robot);

        //2 rectangular grid with width w and height h
        // robot in the north-east corner
        robot = new Robot(w, h, w-1, 0);
        challenge2(robot);

        //3 square nxn grid
        // robot's starting position: 1 over, 2 down
        robot = new Robot(n, n, 3, 2);
        challenge3(robot);

        //4 rectangular grid with width w and height h
        // robot's starting position: 3 over, 1 down
        robot = new Robot(w, h, 3, 1);
        challenge4(robot);
    }

    private static void challenge1(Robot robot) {

            int y = 1;
            int x = 1;

            while (robot.check('S')) {
                robot.go('S');
                y++;
            }

            while (robot.check('W')){
                robot.go('W');
                x++;

            }

            robot.say("challenge1. Total: " + (x*y) + " rooms in " + ((y-1)+(x-1)) + " moves");
    }

    private static void challenge2(Robot robot) {

        int y = 1;
        int x = 1;

        while (robot.check('S')) {
            robot.go('S');
            y++;
        }

        while (robot.check('W')){
            robot.go('W');
            x++;

        }

        robot.say("challenge2. Total: " + (x*y) + " rooms in " + ((y-1)+(x-1)) + " moves. " + "(H: " + y + " W: " + x + ")");
    }

    private static void challenge3(Robot robot) {

        int ys = 1;
        int yn = 1;
        int y;


        int xw = 1;
        int xe =1;
        int x;

        while (robot.check('S')) {
            robot.go('S');
            ys++;
        }

        while (robot.check('N')){
            robot.go('N');
            yn++;
        }

        while (robot.check('W')){
            robot.go('W');
            xw++;

        }

        while (robot.check('E')){
            robot.go('E');
            xe++;

        }

        ///finding actual y
        if (yn > ys){
             y = yn;
        } else {
            y = ys;
        }

        ///findind actual x
        if (xe > xw){
            x = xe;
        } else {
            x = xw;
        }

        robot.say("challenge3. Total: " + (x * y) + " rooms in " + (xw + xe + ys + yn) + " moves");

    }

    private static void challenge4(Robot robot) {

        int ys = 1;
        int yn = 1;
        int y;


        int xw = 1;
        int xe =1;
        int x;

        while (robot.check('S')) {
            robot.go('S');
            ys++;
        }

        while (robot.check('N')){
            robot.go('N');
            yn++;
        }

        while (robot.check('W')){
            robot.go('W');
            xw++;

        }

        while (robot.check('E')){
            robot.go('E');
            xe++;

        }

        ///finding actual y
        if (yn > ys){
            y = yn;
        } else {
            y = ys;
        }

        ///findind actual x
        if (xe > xw){
            x = xe;
        } else {
            x = xw;
        }

        robot.say("challenge4. Total: " + (x * y) + " rooms in " + (xw + xe + ys + yn) + " moves."+ "(H: " + y + " W: " + x + ")");

    }

}

