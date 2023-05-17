package dcc603.construtora;

import java.util.Random;

public class Material {
    private int idMaterial;
    private String nomeMaterial;
    private String categoriaMaterial;
    private int quantidadeMaterial;
    private Fornecedor fornecedor;
    private boolean ativo;

    public void setIdMaterial(int idMaterial) {
        this.idMaterial = idMaterial;
    }

    public void setNomeMaterial(String nomeMaterial) {
        this.nomeMaterial = nomeMaterial;
    }

    public void setCategoriaMaterial(String categoriaMaterial) {
        this.categoriaMaterial = categoriaMaterial;
    }

    public void setQuantidadeMaterial(int quantidadeMaterial) {
        this.quantidadeMaterial = quantidadeMaterial;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    private void AtivaMaterial() {
        this.ativo = true;
    }

    private void DesativaMaterial() {
        this.ativo = false;
    }

    public int getIdMaterial() {
        return idMaterial;
    }

    public String getNomeMaterial() {
        return nomeMaterial;
    }

    public String getCategoriaMaterial() {
        return categoriaMaterial;
    }

    public int getQuantidadeMaterial() {
        return quantidadeMaterial;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void cadastrarNovoMaterial(String nomeMaterial, String categoriaMaterial, int quantidadeMaterial, Fornecedor fornecedor) {
        Random random = new Random();
        int id = random.nextInt(10000000);
        AtivaMaterial();
        setIdMaterial(id);
        setNomeMaterial(nomeMaterial);
        setCategoriaMaterial(categoriaMaterial);
        setQuantidadeMaterial(quantidadeMaterial);
        setFornecedor(fornecedor);
        fornecedor.AdicionaMaterial(this);
    }

    public void EditaMaterial(String nomeMaterial, String categoriaMaterial, int quantidadeMaterial, Fornecedor fornecedor) {
        if (this.ativo == true) {
            if (nomeMaterial != this.nomeMaterial) {
                setNomeMaterial(nomeMaterial);
            }
            if (categoriaMaterial != this.categoriaMaterial) {
                setCategoriaMaterial(categoriaMaterial);
            }
            if (quantidadeMaterial != this.quantidadeMaterial) {
                setQuantidadeMaterial(quantidadeMaterial);
            }
            if (fornecedor != this.fornecedor) {
                setFornecedor(fornecedor);
                this.fornecedor.RemoveMaterial(this);
                fornecedor.AdicionaMaterial(this);
            }
        }
    }

    public String GetMaterial() {
        if (this.ativo == true) {
            return "ID: " + idMaterial + " | Nome: " + nomeMaterial + " | Categoria: " + categoriaMaterial + " | Fornecedor: " + fornecedor.getNomeFornecedor();
        }
        else {
            return "Material inativo";
        }
    }

    public void ExcluiMaterial() {
        DesativaMaterial();
        fornecedor.RemoveMaterial(this);
        setNomeMaterial(null);
        setCategoriaMaterial(null);
        setQuantidadeMaterial(-1);
        setFornecedor(null);
    }

}
