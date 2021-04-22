public class Example{
  public static void main(String[] args){ 
    System.out.println("Tabua de multiplicar do 7");
    for(int i = 0;i<=12;i++){
      Thread t = new ThreadMultiplicar(i);
    }
  }

  class ThreadMultiplicar{
  }
}