
public abstract class Produto {
	int id;
	String nomeDoProduto, descricao;

	public Produto(int id, String nomeDoProduto, String descricao) {
		super();
		this.id = id;
		this.nomeDoProduto = nomeDoProduto;
		this.descricao = descricao;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNomeDoProduto() {
		return nomeDoProduto;
	}

	public void setNomeDoProduto(String nomeDoProduto) {
		this.nomeDoProduto = nomeDoProduto;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public void salvarProduto() {
		
	}
}
