package img_magic.entidades;

import java.util.Date;

public class DadosContrato {
	private float campoMetragem;
	private String corTinta;
	private String revestimento;
	private String tipoPapelParede;
	private Date dataServico;
	private String fotoLocal;
	private FormaPagamento formaPagamento;
	private Servico servico;
	private Cliente cliente;

	public float getCampoMetragem() {
		return campoMetragem;
	}

	public void setCampoMetragem(float campoMetragem) {
		this.campoMetragem = campoMetragem;
	}

	public String getCorTinta() {
		return corTinta;
	}

	public void setCorTinta(String corTinta) {
		this.corTinta = corTinta;
	}

	public String getRevestimento() {
		return revestimento;
	}

	public void setRevestimento(String revestimento) {
		this.revestimento = revestimento;
	}

	public String getTipoPapelParede() {
		return tipoPapelParede;
	}

	public void setTipoPapelParede(String tipoPapelParede) {
		this.tipoPapelParede = tipoPapelParede;
	}

	public Date getDataServico() {
		return dataServico;
	}

	public void setDataServico(Date dataServico) {
		this.dataServico = dataServico;
	}

	public String getFotoLocal() {
		return fotoLocal;
	}

	public void setFotoLocal(String fotoLocal) {
		this.fotoLocal = fotoLocal;
	}

	public FormaPagamento getFormaPagamento() {
		return formaPagamento;
	}

	public void setFormaPagamento(FormaPagamento formaPagamento) {
		this.formaPagamento = formaPagamento;
	}

	public Servico getServico() {
		return servico;
	}

	public void setServico(Servico servico) {
		this.servico = servico;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	
}
