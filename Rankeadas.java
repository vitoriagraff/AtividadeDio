public class Rankeadas {

  public static void main(String[] args) {
      int vitorias = 60;
      int derrotas = 20;

      Rank resultado = calcularRank(vitorias, derrotas);

      System.out.println("O Herói tem de saldo de " + resultado.saldoVitorias + " está no nível de " + resultado.nivel);
  }

  public static Rank calcularRank(int vitorias, int derrotas) {
      int saldoVitorias = vitorias - derrotas;
      String nivel;

      if (vitorias < 10) {
          nivel = "Ferro";
      } else if (vitorias >= 11 && vitorias <= 20) {
          nivel = "Bronze";
      } else if (vitorias >= 21 && vitorias <= 50) {
          nivel = "Prata";
      } else if (vitorias >= 51 && vitorias <= 80) {
          nivel = "Ouro";
      } else if (vitorias >= 81 && vitorias <= 90) {
          nivel = "Diamante";
      } else if (vitorias >= 91 && vitorias <= 100) {
          nivel = "Lendário";
      } else if (vitorias >= 101) {
          nivel = "Imortal";
      } else {
          nivel = "Nível inválido";
      }

      return new Rank(saldoVitorias, nivel);
  }
}

class Rank {
  int saldoVitorias;
  String nivel;

  public Rank(int saldoVitorias, String nivel) {
      this.saldoVitorias = saldoVitorias;
      this.nivel = nivel;
  }
}

