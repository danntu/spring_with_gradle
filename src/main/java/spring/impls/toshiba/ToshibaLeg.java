package spring.impls.toshiba;

import spring.interfaces.Leg;

public class ToshibaLeg  implements Leg{
    @Override
    public void go() {
        System.out.println("Go by Toshiba");
    }
}
