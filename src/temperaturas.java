import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class temperaturas {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);  

      List<Double> temperaturas = new ArrayList<>();
      for (int i = 0; i < 6; i++) {
          System.out.print("Digite a temperatura média do mês " + Meses.values()[i].getNome() + ": ");
          double temperatura = sc.nextDouble();
          temperaturas.add(temperatura);
      }

      sc.close();
      double soma = 0;
        for (Double temperatura : temperaturas) {
            soma += temperatura;
        }

        double mediaSemestral = soma / temperaturas.size();

        System.out.println("Temperaturas acima da média semestral:");
        for (int i = 0; i < temperaturas.size(); i++) {
            if (temperaturas.get(i) > mediaSemestral) {
                System.out.println("Mês: " + Meses.values()[i].getNome() +
                        " (" + Meses.values()[i].getNumero() + ") - " +
                        "Temperatura: " + temperaturas.get(i));
            }
        }





 }
}
