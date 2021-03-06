package desevolvimentoWeb.desevolvimentoWeb.Service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import desevolvimentoWeb.desevolvimentoWeb.Model.Product;
import desevolvimentoWeb.desevolvimentoWeb.Repository.ProdutoRepository;

@Service
public class ProdutoService 
{
	@Autowired
	private ProdutoRepository repository;
	
	public ProdutoService() {
		super();
	}

	public List<Product> getProduto() {
		return repository.findAll();
	}
	
	public List<Product> getProdutoNome() {
		return repository.ordenarPorNome();
	}
	public List<Product> getProdutoPrice() {
		return repository.ordenarPorPrice();
	}
	
	public List<Product> getProdutoScore() {
		return repository.ordenarPorScoce();
	}
	
	public Optional<Product> findPorId(Long id) {
		Optional<Product> produto = repository.findById(id);
		return produto;
	}



}
