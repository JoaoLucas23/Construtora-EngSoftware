package dcc603.construtora;

import java.util.Random;

public class Cliente {
    private int idCliente;
    private String nomeCliente;
    private String cpfCnpj;
    private String email;
    private String telefone;
    private boolean ativo;
    private Projeto projetoComprado;

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getCpfCnpj() {
        return cpfCnpj;
    }

    public void setCpfCnpj(String cpfCnpj) {
        this.cpfCnpj = cpfCnpj;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setProjetoComprado(Projeto projetoComprado) {
        this.projetoComprado = projetoComprado;
    }

    public void AtivaCliente() {
        this.ativo = true;
    }

    public void DesativaCliente() {
        this.ativo = false;
    }

    public void CadastrarCliente(String nomeCliente, String cpfCnpj, String email, String telefone) {
        Random random = new Random();
        int id = random.nextInt(10000000);
        setIdCliente(id);
        setNomeCliente(nomeCliente);
        setCpfCnpj(cpfCnpj);
        setEmail(email);
        setTelefone(telefone);
        AtivaCliente();
    }

    public void EditarCliente(String nomeCliente, String cpfCnpj, String email, String telefone) {
        if (ativo == true) {
            if (nomeCliente != this.nomeCliente) {
                setNomeCliente(nomeCliente);
            }
            if (cpfCnpj != this.cpfCnpj) {
                setCpfCnpj(cpfCnpj);
            }
            if (email != this.email) {
                setEmail(email);
            }
            if (telefone != this.telefone) {
                setTelefone(telefone);
            }
        }
    }

    public String GetCliente() {
        if (ativo == true) {
            return "ID: " + getIdCliente() + " | Nome: " + getNomeCliente() + " | CPF/CNPJ: " + getCpfCnpj() + " | Email: " + getEmail() + " | Telefone: " + getTelefone() + " | Projeto comprado: " + projetoComprado;
        } else {
            return "Cliente inativo";
        }
    }

    public void ExcluirCliente() {
        DesativaCliente();
        setNomeCliente(null);
        setCpfCnpj(null);
        setEmail(null);
        setTelefone(null);
    }

    public void CompraProjeto(Projeto projeto) {
        if (ativo == true && projeto.EstaAtivo() == true) {
            setProjetoComprado(projeto);
        }
    }
}
