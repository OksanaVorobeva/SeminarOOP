package seminar2.classes;

public class SpecialClient extends Actor{

    private int idVip;
    public SpecialClient(String name,int idVip) {
        super(name);
        this.idVip=idVip;
    }

    public int getIdVip() {
        return idVip;
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
