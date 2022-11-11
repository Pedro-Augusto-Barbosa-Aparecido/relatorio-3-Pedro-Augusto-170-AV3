import java.io.IOException;

public class Participante extends Chef {
    private String pratoApresentado;

    public Participante(String nome, String especialidade, int idade) {
        super(nome, especialidade, idade);
    }

    public void apresentarPrato(String prato) {
        this.setPratoApresentado(prato);
        System.out.printf("Prato %s apresentado\n", prato);
    }

    public void gravarInformacoes() {
        try {
            String content = String.format("%s;%s;%d;%s",
                    this.getNome(), this.pratoApresentado, this.getIdade(), this.getEspecialidade());

            FileManager.writeTxt(String.format("files/%s.txt", this.getNome()), content);
            System.out.println("Informacoes do participante " + this.getNome() + " foram salvas com sucesso no diretorio './files/'");
        } catch (IOException e) {
            System.out.println("Problema ao gerar arquivo do participante" + this.getNome());
        }

    }

    public void setPratoApresentado(String pratoApresentado) {
        this.pratoApresentado = pratoApresentado;
    }

    public String getPratoApresentado() {
        return pratoApresentado;
    }
}
