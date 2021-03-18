package login;

import java.util.Stack;

public class Inicio {


    public static void main(String[] args) {
       var can =  leerCadena("(())()");
       System.out.print(can);
    }

    private static boolean leerCadena(String texto) {

        Stack<String> pila = new Stack<String>();
        for (char caracter: texto.toCharArray()) {
            if (caracter == '(') {
                pila.push(String.valueOf(caracter));
            }
            else {
                if (!pila.empty() && pila.lastElement().equals("(")){
                    pila.pop();
                }
                else {
                    pila.push(String.valueOf(caracter));
                }
            }
        }

        return (pila.size() ==0);
    }
}
