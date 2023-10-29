package sqch12ex1.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import sqch12ex1.model.Purchase;
import sqch12ex1.repository.PurchaseRepository;

@RestController
@RequestMapping("/purchase")
public class PurchaseController {
	
	private PurchaseRepository repository;
	
	@GetMapping
	public List<Purchase> findPurchases() {
		return repository.findAllPurchases();
	}

}
