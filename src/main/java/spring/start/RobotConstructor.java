package spring.start;

import spring.impls.sony.SonyHand;
import spring.impls.sony.SonyHead;
import spring.impls.toshiba.ToshibaLeg;

public class RobotConstructor {
    public static void main(String[] args) {
        SonyHand sonyHand = new SonyHand();
        SonyHead sonyHead = new SonyHead();
        ToshibaLeg toshibaLeg = new ToshibaLeg();

        Robot robot = new Robot(sonyHand,sonyHead,toshibaLeg);
        robot.action();
    }

}
