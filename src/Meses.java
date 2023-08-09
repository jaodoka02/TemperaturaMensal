public enum Meses {
    Janeiro(1,"Janeiro"),
    Fevereiro(2,"Fevereiro"),
    Março(3,"Março"),
    Abril(4,"Abril"),
    Maio(5,"Maio"),
    Junho(6,"Junho");



    private int numero;
    private String nome;


   private Meses (int numero, String nome){
    this.nome = nome;
    this.numero = numero;
   }


public int getNumero() {
    return numero;
}


public String getNome() {
    return nome;
}
   









}
