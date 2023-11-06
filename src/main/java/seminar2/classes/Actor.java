package seminar2.classes;

import seminar2.interfaces.IActorBehavior;

public  abstract class Actor implements IActorBehavior {
    protected String name;
    protected boolean isTakeOrder;
    protected boolean isMakeOrder;



    public Actor(String name) {
        this.name = name;
    }

    abstract  public  String getName();


}
