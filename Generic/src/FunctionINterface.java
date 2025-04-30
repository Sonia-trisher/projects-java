  interface A{
//    void show();
      void show(int i ,int j);
  }
//  class B implements A{
//    public void show(){
//        System.out.println("in show");
//    }
//  }


public class FunctionINterface {
    public static void main(String[] args) {
//        function interface
//        A obj = new A(){
//            public void show(int i){
//                System.out.println("in show " + i);
//            }
//        };
//         Lambdas expression
//                parameters = expressions
        A obj =(int i, int j) ->{  System.out.println(j+" in show " + i) ;};
        obj.show( 5 ,7);

    }
}
