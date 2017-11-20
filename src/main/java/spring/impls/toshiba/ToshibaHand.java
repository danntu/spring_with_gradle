package spring.impls.toshiba;

import spring.interfaces.Hand;

public class ToshibaHand  implements Hand{
    @Override
    public void catchSomething() {
        System.out.println("Catched by Toshiba");
    }
}
