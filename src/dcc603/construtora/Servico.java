package dcc603.construtora;

public class Servico {
    private int idServico;
    private String nomeEmpresa;
    private String tipoServico;
    private int codigoContrato;
    private boolean ativo;

    public int getIdServico() {
        return idServico;
    }

    public void setIdServico(int idServico) {
        this.idServico = idServico;
    }

    public String getNomeEmpresa() {
        return nomeEmpresa;
    }

    public void setNomeEmpresa(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
    }

    public String getTipoServico() {
        return tipoServico;
    }

    public void setTipoServico(String tipoServico) {
        this.tipoServico = tipoServico;
    }

    public int getContrato() {
        return codigoContrato;
    }

    public void setContrato(int codigoContrato) {
        this.codigoContrato = codigoContrato;
    }

    private void AtivaServico() {
        this.ativo = true;
    }

    private void DesativaServico() {
        this.ativo = false;
    }

    public void CadastrarServico(String nomeEmpresa, String tipoServico, int codigoContrato) {
        this.nomeEmpresa = nomeEmpresa;
        this.tipoServico = tipoServico;
        this.codigoContrato = codigoContrato;
        AtivaServico();
    }

    public void EditarServico(String nomeEmpresa, String tipoServico, int idContrato) {
        if (this.ativo == true) {
            if (nomeEmpresa != this.nomeEmpresa) {
                this.nomeEmpresa = nomeEmpresa;
            }
            if (tipoServico != this.tipoServico) {
                this.tipoServico = tipoServico;
            }
            if (idContrato != this.codigoContrato) {
                this.codigoContrato = idContrato;
            }
        }
    }

    public void ExcluirServico() {
        this.idServico = 0;
        this.nomeEmpresa = null;
        this.tipoServico = null;
        this.codigoContrato = -1;
        DesativaServico();
    }

    public String GetServico() {
        if (this.idServico != 0) {
            return "ID: " + idServico + " | Nome Empresa: " + nomeEmpresa + " | Tipo de Serviço: " + tipoServico + " | Codigo do Contrato: " + codigoContrato;
        } else {
            return "Serviço não existe";
        }
    }
}
