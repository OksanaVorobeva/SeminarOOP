package seminar2.classes;

import seminar2.interfaces.IActorBehavior;
import seminar2.interfaces.IMarketBehavior;
import seminar2.interfaces.IQueueBehavior;

import java.util.ArrayList;
import java.util.List;

public class Market implements IMarketBehavior, IQueueBehavior {

    private List<IActorBehavior> queue;

    public Market() {
        this.queue = new ArrayList<>();
    }

    @Override
    public void acceptToMarket(IActorBehavior actor) {
        System.out.println(actor.getActor().getName() + "клиент пришел в магазин");
        takeInQueue(actor);
    }

    @Override
    public void takeInQueue(IActorBehavior actor) {
        this.queue.add(actor);
        System.out.println(actor.getActor().getName()+"Клиент добавлен в очередь");
    }

    @Override
    public void upDate() {
        takeOrder();
        giveOrder();
        releaseFromQueue();
    }



    @Override
    public void releaseFromQueue() {
        List<Actor> realeaseActors = new ArrayList<>();
        for (IActorBehavior actor : queue) {
            if (actor.isTakeOrder()) {
                realeaseActors.add(actor.getActor());
                System.out.println(actor.getActor().getName() + "клиент ушел из очереди");
            }
        }
        releaseFromMarket(realeaseActors);
    }

    @Override
    public void takeOrder() {
        for (IActorBehavior actor : queue) {
            if ((!actor.isMakeOrder())) {
                actor.setMakeOrder(true);
                System.out.println(actor.getActor().getName() + "клиент сделал заказ");
            }
        }
    }

    @Override
    public void giveOrder() {
        for (IActorBehavior actor : queue) {
            if (actor.isMakeOrder()) {
                actor.setTakeOrder(true);
                System.out.println(actor.getActor().getName() + "клиент получил свой заказ");
            }
        }
    }

    @Override
    public void releaseFromMarket(List<Actor> actors) {
        {

            for (Actor actor : actors) {
                System.out.println(actor.getActor().getName() + "клиент ушел из магазина");
                actors.remove(actor);
            }
        }

    }
}
