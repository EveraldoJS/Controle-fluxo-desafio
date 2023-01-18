import java.util.Scanner;

public class Contador{

public static void main(String[] args) {
  Scanner terminal = new Scanner (System.in);

  System.out.println("Digite parâmetro um:");
  int parametroUm = terminal.nextInt();

  System.out.println("Digite parâmetro dois:");
  int parametroDois = terminal.nextInt();

  try {
    contar (parametroUm,parametroDois);

  } catch (ParamentrosInvalidosException e) {
    System.out.println(" O segundo parâmetro deve ser maior que o primeiro");
  }

 }

 static void contar (int parametroUm , int parametroDois) throws ParamentrosInvalidosException {

  if (parametroDois < parametroUm) throw new ParamentrosInvalidosException ();
    for (int count = (parametroDois - parametroUm); count >=1; count--){
      System.out.println(count);
    }
 }
public static class ParamentrosInvalidosException extends Exception{}

}
