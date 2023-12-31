package sqch12ex1.repository;
import java.util.List;
import java.util.logging.Logger;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import lombok.AllArgsConstructor;
import space.jbpark.utility.MyUtil;
import sqch12ex1.model.Purchase;

@Repository
@AllArgsConstructor
public class PurchaseRepository {

	private final JdbcTemplate jdbcTemplate;
	private final Logger logger = MyUtil.getLogger(PurchaseRepository.class.getName());

	public void storePurchase(Purchase purchase) {
		jdbcTemplate.update("insert into purchase values (null, ?, ?)",
				purchase.getProduct(), purchase.getPrice());
	}

	public List<Purchase> findAllPurchases() {
		String sql = "SELECT * FROM purchase";

		RowMapper<Purchase> purchaseMapper = (r, i) -> {
			var purchase = new Purchase();
			purchase.setId(r.getInt("id"));
			purchase.setProduct(r.getString("product"));
			purchase.setPrice(r.getBigDecimal("price"));
			logger.info("행 번호: " + i);
			return purchase;
		};

		return jdbcTemplate.query(sql, purchaseMapper);
	}
}
