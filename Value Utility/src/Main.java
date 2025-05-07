public class Main {
    public static void main(String[] args) {
        Pair<String,Integer> pair1 = new Pair<>("Age",20);
        Pair<Integer,String> pair2 = new Pair<>(404,"Not Found");
//        System.out.println("pair1: " + pair1);
//        System.out.println("pair2: " + pair2);

        System.out.println(pair1.toString());
        System.out.println(pair2.equals(pair1));
        try{
            Pair<String,Integer> pair3 = new Pair<>(null,21);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }

    }
}
