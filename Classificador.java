import java.util.Scanner;

public class Classificador {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
            System.out.println("Digite o nome do herói:");
            String nome = scan.nextLine();
            System.out.println("Digite a quantidade de experiência do herói:");
            int experiencia = scan.nextInt();
            String nivel = "";
            if (experiencia < 1000) {
                nivel = "Ferro";
            } else if (experiencia <= 2000) {
                nivel = "Bronze";
            } else if (experiencia <= 5000) {
                nivel = "Prata";
            } else if (experiencia <= 7000) {
                nivel = "Ouro";
            } else if (experiencia <= 8000) {
                nivel = "Platina";
            } else if (experiencia <= 9000) {
                nivel = "Ascendente";
            } else if (experiencia <= 10000) {
                nivel = "Imortal";
            } else{
                nivel = "Radiante";
            }
            System.out.println("O Herói de nome " + nome + " está no nível de " + nivel);
    }
}