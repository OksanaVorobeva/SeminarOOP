package seminar2.interfaces;

import seminar2.classes.Actor;

public interface IActorBehavior {
    void setMakeOrder(boolean makeOrder);
    void  setTakeOrder(boolean pickUpOrder);
    boolean isMakeOrder();
    boolean isTakeOrder();
    Actor getActor();

}
