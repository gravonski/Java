package NivelBasico.Condicoes;

public class LacosDeRepeticao {
    public static void main(String[] args) {
        /*Laços de Repetição: Vão ser executados infinitamente ou até o parâmetro ser executado.*/
        int numeroDeClones = 0;
        int numeroMaxClones = 40;

       /* while (numeroDeClones <= numeroMaxClones) {
            numeroDeClones++;
            System.out.println("Clone n°" + numeroDeClones + " do Naruto foi criado");
        }
*/
        for (int i = 0; i < numeroMaxClones; i++) {
            System.out.println("Clone n°" + i + " do Naruto foi criado");
        }
    }
}
