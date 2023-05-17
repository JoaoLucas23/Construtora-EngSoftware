/**
 * 
 */
package dcc603.construtora;

/**
 * @author João Lucas
 */

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Projeto {
    private int idProjeto;
    private String nomeProjeto;
    private String cidadeObra;
    private LocalDate dataInicio;
    private LocalDate dataFinal;
    private double valor;
	private boolean ativo;
	Engenheiro engenheiroResponsavel;
	private static List<Material> materiaisEstocados = new ArrayList<Material>();
    
    public int getIdProjeto() {
        return idProjeto;
    }

	public void setIdProjeto(int id) {
		this.idProjeto = id;
	}

    public String getNomeProjeto() {
        return nomeProjeto;
    }

    public void setNomeProjeto(String nomeProjeto) {
        this.nomeProjeto = nomeProjeto;
    }

    public String getCidadeObra() {
        return cidadeObra;
    }

    public void setCidadeObra(String cidadeObra) {
        this.cidadeObra = cidadeObra;
    }

    public LocalDate getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(LocalDate dataInicio) {
        this.dataInicio = dataInicio;
    }

    public LocalDate getDataFinal() {
        return dataFinal;
    }

    public void setDataFinal(LocalDate dataFinal) {
        this.dataFinal = dataFinal;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
	private void AtivaProjeto() {
		this.ativo = true;
	}

	private void DesativaProjeto() {
		this.ativo = false;
	}

	public boolean EstaAtivo() {
		return this.ativo;
	}

    public void CriarProjeto(String nome ,String cidade, LocalDate dataInicio, LocalDate dataFinal, double valor) {
		Random random = new Random();
		int id = random.nextInt(10000000);
		AtivaProjeto();
		setIdProjeto(id);
        setNomeProjeto(nome);
        setCidadeObra(cidade);
        setDataInicio(dataInicio);
        setDataFinal(dataFinal);
        setValor(valor);
    }
    
    public void EditarProjeto(String nome ,String cidade, LocalDate dataInicio, LocalDate dataFinal, double valor) {
		if (nome != this.nomeProjeto) {
			if (nome != this.nomeProjeto) {
				setNomeProjeto(nome);
			}
			if (cidade != this.cidadeObra) {
				setCidadeObra(cidade);
			}
			if (dataInicio != this.dataInicio) {
				setDataInicio(dataInicio);
			}
			if (dataFinal != this.dataFinal) {
				setDataFinal(dataFinal);
			}
			if (valor != this.valor) {
				setValor(valor);
			}
		}
	}

	public static void AdicionaMaterial(Material material) {
		materiaisEstocados.add(material);
	}
	
	public String GetProjeto() {
		if (this.ativo == true){
            return "ID: " + idProjeto + " | Nome: " + nomeProjeto + " | Valor: " + valor + " | Data Inicio: " + dataInicio + " | Data Final: " + dataFinal + " | Cidade: " + cidadeObra + " | Engenheiro Responsavel: " + engenheiroResponsavel.getNome();
        }
       else {
            return "Fornecedor inativo";
       }
	}

	public void fecharProjeto() {
		DesativaProjeto();
		cidadeObra = null;
		dataInicio = null;
		dataFinal = null;
		valor = -1;
		nomeProjeto	= null;
		engenheiroResponsavel = null;
	}
}

