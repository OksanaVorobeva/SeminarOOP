package seminar2.interfaces;

import seminar2.classes.Actor;

public interface IQueueBehavior {
    void  takeInQueue(IActorBehavior actor);
    void  releaseFromQueue();

    void takeOrder();
    void giveOrder();
}
