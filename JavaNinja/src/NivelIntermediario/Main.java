package NivelIntermediario;

public class Main {
    public static void main(String[] args) {

        Ninja cadastro = new Ninja("Naruto", "Naruto@gmail.com", 999999);
        System.out.println(cadastro);


        NinjaRecords cadastroRecord = new NinjaRecords("Sasuke Uchiha", "sasuke@gmail.com", 4888888);
        System.out.println(cadastroRecord);
    }
}
