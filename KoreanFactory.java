public class KoreanFactory implements NoodlesFactory{
    @Override
    public Noodles createNoodles() {
        return new KoreanNoodles();
    }
}
