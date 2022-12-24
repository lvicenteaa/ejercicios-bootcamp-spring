package tk.lvicenteaa.ejercicios.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import tk.lvicenteaa.ejercicios.entities.Laptop;
import tk.lvicenteaa.ejercicios.repository.LaptopRepository;

@RestController
public class LaptopController {
	
	private LaptopRepository laptopRepository;
	
	
	
	public LaptopController(LaptopRepository laptopRepository) {
		this.laptopRepository = laptopRepository;
	}

	@GetMapping("api/laptops")
	public List<Laptop> laptops() {
		return this.laptopRepository.findAll();
	}
	
	@PostMapping("api/laptop")
	public Laptop create(@RequestBody Laptop laptop) {
		return this.laptopRepository.save(laptop);
	}

}
