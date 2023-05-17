package dcc603.construtora;

import java.util.List;
import java.util.Random;

public class Engenheiro {
    private int idEngenheiro;
    private String nome;
    private String matricula;
    private String email;
    private int idade;
    private List<Projeto> projetosGerenciados;
    private boolean ativo;
    
    public int getIdEngenheiro() {
        return idEngenheiro;
    }

    public void setIdEngenheiro(int id) {
        this.idEngenheiro = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setProjetoAtribuido(Projeto projetoAtribuido) {
        this.projetosGerenciados.add(projetoAtribuido);
    }

    public void AtivaEngenheiro() {
        this.ativo = true;
    }

    public void DesativaEngenheiro() {
        this.ativo = false;
    }
    
    public void CriarEngenheiro(String nome, String matricula, String email, int idade) {
        Random random = new Random();
        int id = random.nextInt(10000000);
        AtivaEngenheiro();
        setIdEngenheiro(id);
        setNome(nome);
        setMatricula(matricula);
        setEmail(email);
        setIdade(idade);
    }

    public void EditarEngenheiro(String nome, String matricula, String email, int idade) {
        if (ativo == true) {
            if (nome != this.nome) {
                setNome(nome);
            }
            if (matricula != this.matricula) {
                setMatricula(matricula);
            }
            if (email != this.email) {
                setEmail(email);
            }
            if (idade != this.idade) {
                setIdade(idade);
            }
        }
    }
    
    public void AtribuirEngenheiroProjeto(Projeto projeto) {
        if (ativo == true && projeto.EstaAtivo() == true) {
            setProjetoAtribuido(projeto);
        }
    }
    
    public String GetEngenheiro() {
        if (this.ativo == true) {
            return "ID: " + idEngenheiro + " | Nome: " + nome + " | Matrícula: " + matricula + " | Email: " + email + " | Idade: " + idade;
        }
        else {
            return "Fornecedor inativo";
       }
    }

    public void ExcluirEngenheiro() {
        DesativaEngenheiro();
        setNome(null);
        setMatricula(null);
        setEmail(null);
        setIdade(0);
    }
}
