package spring.impls.toshiba;

import spring.interfaces.Head;

public class ToshibaHead implements Head{
    @Override
    public void calc() {
        System.out.println("Thinking by Toshiba");
    }
}
