package desevolvimentoWeb.desevolvimentoWeb.Service;

import java.math.BigDecimal;

public class Nota {

	private Long codigo;
	private String descricao;
	private int qtde;
	private BigDecimal unit;
	private BigDecimal vlTotal;

	public Nota(Long codigo, String descricao, int qtde, BigDecimal unit, BigDecimal vlTotal) 
        {
            super();
            this.codigo = codigo;
            this.descricao = descricao;
            this.qtde = qtde;
            this.unit = unit;
            this.vlTotal = vlTotal;
	}

	public int getQtde() {
		return qtde;
	}

	public void setQtde(int qtde) {
		this.qtde = qtde;
	}

	public Long getCodigo() {
		return codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public BigDecimal getUnit() {
		return unit;
	}

	public BigDecimal getVlTotal() {
		return vlTotal;
	}

}
