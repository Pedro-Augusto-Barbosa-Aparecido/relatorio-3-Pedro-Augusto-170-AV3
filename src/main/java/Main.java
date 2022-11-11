import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        Jurado jurado = new Jurado("Jurado", "Comida chinesa", 76);

        Participante participante1 = new Participante("Participante 1", "Comida brasileira", 18);
        Participante participante2 = new Participante("Participante 2", "Comida italiana", 38);
        Participante participante3 = new Participante("Participante 3", "Comida polonesa", 21);
        Participante participante4 = new Participante("Participante 4", "Comida chinesa", 43);

        try {
            participante1.apresentarPrato("Feijoada");
            participante2.apresentarPrato("Macarone");
            participante3.apresentarPrato("Gołąbki");
            participante4.apresentarPrato("Wonton");

            System.out.println("");

            jurado.avaliarParticipante(participante1, (int) (Math.random() * 100));
            jurado.avaliarParticipante(participante2, (int) (Math.random() * 100));
            jurado.avaliarParticipante(participante3, (int) (Math.random() * 100));
            jurado.avaliarParticipante(participante4, (int) (Math.random() * 100));

            System.out.println("");

            participante1.gravarInformacoes();
            participante2.gravarInformacoes();
            participante3.gravarInformacoes();
            participante4.gravarInformacoes();

            System.out.println("");

            System.out.println("\n-------------------------------------------");
            System.out.println("Ganhador: \n");
            FileManager.readTxt(String.format("files/%s.txt", jurado.getVencedor().getNome()));
            System.out.println("-------------------------------------------\n");
        } catch (ParticipantAlreadyExists | IOException e) {
            throw new RuntimeException(e);
        }

    }
}
