import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        /*palabra secreta = wordsecret */
        String wordsecret = "myproyect";
        /*puntos maximos = maxpoint*/
        int maxpoint= 5;
        /* intentos = point */
        int point = 0;
        /*adivinar = iscorrect */
        boolean iscorrect = false;
        //array char:
        /*letras adivinadas = lettercorrect */
        char[] lettercorrect = new char[wordsecret.length()];

        for (int i = 0; i < lettercorrect.length; i++){
            lettercorrect[i] ='_';
        }

        while (!iscorrect && point < maxpoint){

            System.out.println(" word guess: " +String.valueOf(lettercorrect)+ " " + wordsecret.length()+ " letter");
            System.out.println(" type letter, please!");
            char letter = Character.toLowerCase(scanner.next().charAt(0));
            boolean letteriscorrect = false;

            for(int i= 0; i < wordsecret.length(); i++){

                if (wordsecret.charAt(i)== letter) {
                    lettercorrect [i]= letter;
                    letteriscorrect = true;                
                }
            }

            if (!letteriscorrect){
                point++;
                System.out.println("incorrect! you have " + (maxpoint - point) + " point");
            }

            if(String.valueOf(lettercorrect).equals(wordsecret)){
                iscorrect= true;
                System.out.println("you won!, you guess!");
            }

        }
        if (!iscorrect) {
            System.out.println("game over, you get whithout point!");    
        }
        scanner.close();

    }
}
