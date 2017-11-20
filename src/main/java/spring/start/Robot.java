package spring.start;

import spring.interfaces.Hand;
import spring.interfaces.Head;
import spring.interfaces.Leg;
import spring.objects.SonyHand;
import spring.objects.SonyHead;
import spring.objects.SonyLeg;

public class Robot {
    private Hand hand;
    private Head head;
    private Leg leg;

    public Robot(Hand hand, Head head, Leg leg) {
        this.hand = hand;
        this.head = head;
        this.leg = leg;
    }

    public void action(){
        head.calc();
        hand.catchSomething();
        leg.go();
    }
}
