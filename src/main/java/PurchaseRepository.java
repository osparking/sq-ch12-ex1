import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import lombok.AllArgsConstructor;

@Repository
@AllArgsConstructor
public class PurchaseRepository {
	
	private final JdbcTemplate jdbcTemplate;

}
