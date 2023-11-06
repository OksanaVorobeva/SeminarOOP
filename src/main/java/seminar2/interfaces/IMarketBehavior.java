package seminar2.interfaces;

import seminar2.classes.Actor;

import java.util.List;

public interface IMarketBehavior {
    void acceptToMarket(IActorBehavior actor);
    void releaseFromMarket(List<Actor> actors);

    void upDate();

}
