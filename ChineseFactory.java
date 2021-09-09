public class ChineseFactory implements NoodlesFactory{

    @Override
    public Noodles createNoodles() {
        return new ChineseNoodles();
    }
}
