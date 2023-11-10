package seminar7.factory_source;

public class GolfGenerator extends IItemGenerator{


    @Override
    public IGameItem createItem() {
        return new Gold();
    }
}
