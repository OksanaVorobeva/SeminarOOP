package seminar2;

import seminar2.classes.Market;
import seminar2.classes.OrdinaryClient;
import seminar2.classes.SpecialClient;
import seminar2.interfaces.IActorBehavior;

public class Main {
    public static void main(String[] args) {
        Market market = new Market();
        /*OrdinaryClient client1=new OrdinaryClient("Борис");
        OrdinaryClient client2=new OrdinaryClient("Даша");
        SpecialClient client3=new SpecialClient("Оля",1);

        market.acceptToMarket(client1);
        market.acceptToMarket(client2);
        market.acceptToMarket(client3)*/;

        IActorBehavior client1=new OrdinaryClient("Борис");
        IActorBehavior client2=new OrdinaryClient("Даша");
        IActorBehavior client3=new SpecialClient("Оля",1);

        market.acceptToMarket(client1);
        market.acceptToMarket(client2);
        market.acceptToMarket(client3);

        market.upDate();

    }
}
