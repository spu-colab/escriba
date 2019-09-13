package br.gov.spusc.escriba;

public enum OpcaoObjetivoRequerimentoEnum {
	
	INDEFINIDO(-1, "Indefinido"),
	
	USUCAPIAO_EXTRAJUDICIAL(1, "Usucapião Extrajudicial"),
	
	USUCAPIAO_JUDICIAL(2, "Usucapião Judicial"),
	
	TRANSFERENCIA_TITULARIDADE(3, "Transferência de Titularidade"),
	
	INSTRUCAO_INQUERITO(4, "Instrução de Inquérito/Processo"),
	
	JUDICIAL_AUDITORIA(5, "Judicial/Auditoria"),
	
	REGISTRO_CARTORIAL(7, "Registro Cartorial"),
	
	OUTRO(6, "Outro");
	
	private Integer id;
	private String objetivo;
	
	OpcaoObjetivoRequerimentoEnum(Integer id, String objetivo) {
		this.id = id;
		this.objetivo = objetivo;
	}

	public Integer getId() {
		return id;
	}

	public String getObjetivo() {
		return objetivo;
	}
	
	public Object getValue() {
		return this.id;
	}
	
	public String toString() {
		return this.objetivo;
	}

}
