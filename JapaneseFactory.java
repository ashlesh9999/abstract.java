public class JapaneseFactory implements NoodlesFactory{
    @Override
    public Noodles createNoodles() {
        return new JapaneseNoodles();
    }
}
