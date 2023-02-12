public class Main {
    public static void main(String[] args)
    {
        Integer a =10;
        String b ="selam";
        Double c = 3.14;

        Generic <Integer,String ,Double> t = new Generic<>(a,b,c);

        t.print();
    }
}