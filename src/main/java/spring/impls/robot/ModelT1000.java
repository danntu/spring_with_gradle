package spring.impls.robot;

import spring.interfaces.Hand;
import spring.interfaces.Head;
import spring.interfaces.Leg;
import spring.interfaces.Robot;

public class ModelT1000  implements Robot{
    private Hand hand;
    private Head head;
    private Leg leg;

    public ModelT1000() {
    }

    public ModelT1000(Hand hand, Head head, Leg leg) {
        this.hand = hand;
        this.head = head;
        this.leg = leg;
    }

    public Hand getHand() {
        return hand;
    }

    public void setHand(Hand hand) {
        this.hand = hand;
    }

    public Head getHead() {
        return head;
    }

    public void setHead(Head head) {
        this.head = head;
    }

    public Leg getLeg() {
        return leg;
    }

    public void setLeg(Leg leg) {
        this.leg = leg;
    }

    public void fire(){
        head.calc();
        hand.catchSomething();
        leg.go();
    }

    @Override
    public void dance() {
        System.out.println("Model t1000 is dancing");
    }
}
