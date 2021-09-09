public class FactoryTest {
    public static void main(String[] args) {
        NoodlesFactory factory = new JapaneseFactory();
        Noodles noodles = factory.createNoodles();
        noodles.taste();

        System.out.println("Japanese Noodles is getting ready");

        NoodlesFactory factory1 = new ChineseFactory();
        Noodles noodles1 = factory1.createNoodles();
        noodles1.taste();
        
System.out.println("Chinese Noodles is getting ready");
        NoodlesFactory factory2 = new KoreanFactory();
        Noodles noodles2 = factory2.createNoodles();
        noodles2.taste();
        
System.out.println("korean Noodles is getting ready");
    }
}
