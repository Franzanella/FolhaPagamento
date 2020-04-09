package folhapagamento;

public class FolhaPagamento {
    private String nome;
    private String profissao;
    private int salario;
    private String imposto;
    
    FolhaPagamento e;
    FolhaPagamento(String nome, String profissao, int salario, String imposto){
        this.nome = nome;
        this.profissao = profissao;
        this.salario = salario;
        this.imposto = imposto;
    }
    
    FolhaPagamento(FolhaPagamento e){
        this.e = e;
        mostraPagamento(e);
    }
    
    public void mostraPagamento(FolhaPagamento f){
        System.out.println("Nome: " + f.nome + "\nProfissao: " + f.profissao + "\nSalario : " 
                + f.salario + "\nImposto: " + f.imposto);
    }
  
    public String mostraPagamento(){
        
        return("Nome: " + nome + "\nProfissão : " + profissao + "\nSalario: " 
                + salario + "\nImposto: " + imposto);
    }
}
