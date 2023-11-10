package seminar7.factory_source;

public abstract class IItemGenerator {

    public  void openRerward(){
        IGameItem gameItem =  createItem();
        gameItem.open();
    }
    public  abstract IGameItem createItem();
}
