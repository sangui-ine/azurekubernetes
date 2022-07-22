package springbootk8sexample.springbootk8s;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBootK8sApplication {
	@Autowired
	private CustomerRespository repository;
	@PostMapping("/data")
	public Customer addCustomer(@RequestBody Customer customer) {
		return repository.save(customer);
		
	}
	@GetMapping("/datas")
	public List<Customer>getCustomer()
	{
		return repository.findAll();
		
	}
	public static void main(String[] args) {
		SpringApplication.run(SpringBootK8sApplication.class, args);
	}

}
