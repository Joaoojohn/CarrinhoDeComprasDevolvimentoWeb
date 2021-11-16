package desevolvimentoWeb.desevolvimentoWeb.Repository;
import java.util.List;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import desevolvimentoWeb.desevolvimentoWeb.Model.Product;

@Repository
public interface ProdutoRepository extends JpaRepository<Product, Long> 
{
	@Query("select p from Product p order by p.name")
    List<Product> ordenarPorNome();

    @Query("select p from Product p order by p.price desc")
    List<Product> ordenarPorPrice();

    @Query("select p from Product p order by p.score desc")
    List<Product> ordenarPorScoce();
}
