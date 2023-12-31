package sqch12ex1.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;
import sqch12ex1.model.Purchase;
import sqch12ex1.repository.PurchaseRepository;

@RestController
@RequestMapping("/purchase")
@AllArgsConstructor
public class PurchaseController {
	
	private PurchaseRepository repository;
	
	@GetMapping
	public List<Purchase> findPurchases() {
		return repository.findAllPurchases();
	}
	
	@PostMapping
	public void savePurchase(@RequestBody Purchase purchase) {
		repository.storePurchase(purchase);
	}

}
