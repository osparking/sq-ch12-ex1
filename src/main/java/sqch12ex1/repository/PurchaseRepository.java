package sqch12ex1.repository;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import lombok.AllArgsConstructor;
import sqch12ex1.model.Purchase;

@Repository
@AllArgsConstructor
public class PurchaseRepository {
	
	private final JdbcTemplate jdbcTemplate;

	public void storePurchase(Purchase purchase) {
		jdbcTemplate.update("insert into purchase(null, ?, ?)",
				purchase.get)
	}
}
