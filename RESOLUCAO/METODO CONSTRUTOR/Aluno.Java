public class Aluno{
    private String nome;
    private Double media;


    public Aluno(String nome){
        this.nome = nome;
    }

    public void setMedia(Double media){
        this.media = media;
    }

    public Double getMedia(){
        return this.media;
    }

    public String situacaoAluno(){
        if (this.media >= 7.0){
            return "Aprovado";
        }
        if (this.media < 7.0 && this.media >=4.0){
            return "Prova final";
        }
        return "Reprovado";
    }


}