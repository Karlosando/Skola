public class main {
    public static void main(String[] args) {
        Clovek cl = new Clovek();
        Clovek cl2 = new Clovek("Ondrej","Tovt",67);

        System.out.println(cl2.getName());
        cl2.info();

    }
}
