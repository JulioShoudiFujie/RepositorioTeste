public class Empregado{
    private int tipo;
    private double salario;
    private double comissao;
    private double bonus;
    private String nome;
    private int idade;

    public void setTipo (int tipo){
        this.tipo = tipo;
    }

    public int getTipo (){
        return tipo;
    }

    public double calculaSalario(){
        if (tipo == 1)
            return salario;
        else if (tipo == 2)
            return salario + salario * comissao;
        else if (tipo == 3)
            return salario + bonus;
        else
            return 0;
    }

    public void setSalario (double salario){
        this.salario = salario;
        }
    public double getSalario (){
        return this.salario;
        }
    public void setComissao (double comissao){
        this.comissao = comissao;
        }
    public double getComissao (){
        return this.comissao;
        }
    public void setBonus (double bonus){
        this.bonus = bonus;
        }
    public double getBonus (){
        return this.bonus;
    }
    public String getNome(){
        return nome;
    }

    public int getIdade(){
        return idade;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setidade(int idade){
        this.idade = idade;
    }

}
