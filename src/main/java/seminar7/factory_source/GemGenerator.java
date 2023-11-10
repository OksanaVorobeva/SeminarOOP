package seminar7.factory_source;

public class GemGenerator extends IItemGenerator{
    @Override
    public IGameItem createItem() {
        return new Gem();
    }
}
