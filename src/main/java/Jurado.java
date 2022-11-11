import java.util.HashMap;

public class Jurado extends Chef {
    private HashMap<Participante, Integer> avaliacoes;
    private Participante vencedor;

    public Jurado(String nome, String especialidade, int idade) {
        super(nome, especialidade, idade);
        this.avaliacoes = new HashMap<>();
    }

    public void avaliarParticipante (Participante participante, int nota) throws ParticipantAlreadyExists {
        if (this.avaliacoes.containsKey(participante)) {
            throw new ParticipantAlreadyExists(String.format("O participante %s já foi avaliado", participante.getNome()));
        }

        for (Participante participanteKey: this.avaliacoes.keySet()) {
            if (nota > this.avaliacoes.getOrDefault(participanteKey, -1)) {
                this.vencedor = participante;
                break;
            }
        }

        this.avaliacoes.put(participante, nota);
        System.out.printf("Participante %s, avaliado com sucesso\n", participante.getNome());
    }

    public Participante getVencedor() {
        return vencedor;
    }
}
