package dcc603.construtora;

/**
 * @author João Lucas
*/

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Fornecedor {
    private int idFornecedor;
    private String nomeFornecedor;
    private String cpf_cnpj;
    private String email;
    private String telefone;
    private static List<Material> materiaisFornecidos = new ArrayList<Material>();
    private boolean ativo;
    
    // Métodos de acesso aos atributos da classe Fornecedor
    public int getIdFornecedor() {
        return idFornecedor;
    }

    public void setIdFornecedor(int id) {
        this.idFornecedor = id;
    }

    public String getNomeFornecedor() {
        return nomeFornecedor;
    }

    public void setNomeFornecedor(String nomeFornecedor) {
        this.nomeFornecedor = nomeFornecedor;
    }

    public String getCpf_cnpj() {
        return cpf_cnpj;
    }

    public void setCpf_cnpj(String cpf_cnpj) {
        this.cpf_cnpj = cpf_cnpj;
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

    private void AtivaForncedor() {
        this.ativo = true;
    }

    private void DesativaForncedor() {
        this.ativo = false;
    }
    
    public void CriarFornecedor(String nomeFornecedor, String cpf_cnpj, String email, String telefone) {
		Random random = new Random();
		int id = random.nextInt(10000000);
        AtivaForncedor();
		setIdFornecedor(id);
        setNomeFornecedor(nomeFornecedor);
        setCpf_cnpj(cpf_cnpj);
        setEmail(email);
        setTelefone(telefone);
    }
    
    public void EditarFornecedor(String nomeFornecedor, String cpf_cnpj, String email, String telefone) {
        if (this.ativo == true) {
            if (nomeFornecedor != this.nomeFornecedor) {
                setNomeFornecedor(nomeFornecedor);
            }
            if (cpf_cnpj != this.cpf_cnpj) {
                setCpf_cnpj(cpf_cnpj);
            }
            if (email != this.email) {
                setEmail(email);
            }
            if (telefone != this.telefone) {
                setTelefone(telefone);
            }
        }
	}
    
    public void excluirFornecedor(int idFornecedor) {
        DesativaForncedor();
        setCpf_cnpj(null);
        setEmail(null);
        setNomeFornecedor(null);
        setTelefone(null);
    }
    
    // Método para obter informações do fornecedor
    public String getFornecedor() {
        if (this.ativo == true){
            return "ID: " + idFornecedor + " | Nome: " + nomeFornecedor + " | CPF/CNPJ: " + cpf_cnpj + " | Email: " + email + " | Telefone: " + telefone;
        }
       else {
            return "Fornecedor inativo";
       }
    }

    public void AdicionaMaterial(Material material) {
        if (this.ativo == true){
            materiaisFornecidos.add(material);
        }
    }

    public void RemoveMaterial(Material material) {
        if (this.ativo == true) {
            materiaisFornecidos.remove(material);
        }
    }
}
