package seminar2.classes;

public class OrdinaryClient extends Actor{
    public OrdinaryClient(String name) {
        super(name);
    }

    @Override
    public String getName() {
        return super.name;
    }

    public  boolean isMakeOrder(){
        return super.isMakeOrder;
    }

    public boolean isTakeOrder(){
        return super.isTakeOrder;
    }

    public void setMakeOrder(boolean makeOrder){
        super.isMakeOrder=makeOrder;
    }

    public void setTakeOrder(boolean pikUpOrder){
        super.isTakeOrder=pikUpOrder;
    }

    public Actor getActor(){
        return this;
    }
}
