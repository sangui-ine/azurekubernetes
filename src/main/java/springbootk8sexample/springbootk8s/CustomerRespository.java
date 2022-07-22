package springbootk8sexample.springbootk8s;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRespository extends JpaRepository<Customer,Integer>{

}
