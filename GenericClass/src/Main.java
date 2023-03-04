public class Main {
    public static void main(String[] args) {
        HoldData<Integer> listem = new HoldData<>();
        System.out.println("Dizideki eleman sayısı :"+ listem.size());
        System.out.println("Dizinin kapasitesi :"+ listem.getCapacity());
        listem.add(45);
        listem.add(30);
        listem.add(78);
        listem.add(26);
        listem.add(48);
        listem.add(48);
        System.out.println(listem.isEmpty());
        listem.clear();
        System.out.println(listem.isEmpty());
        System.out.println(listem.contains(56));
        HoldData<Integer> sublist =listem.sublist(1,4);
        sublist.print();


        listem.clear();




    }
}