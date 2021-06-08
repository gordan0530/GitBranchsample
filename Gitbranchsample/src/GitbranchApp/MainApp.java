package GitbranchApp;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      //這是測試第一版
		System.out.println("1st version");
		//數學運算式
		Math cMath = new Math();
		System.out.println();
		System.out.println(cMath.add(12,5));
	}
}

     class Math{
    	 int add(int a, int b) {
    		 return a+b ;
    	 }
     }
