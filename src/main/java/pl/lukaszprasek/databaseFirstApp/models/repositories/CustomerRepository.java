package pl.lukaszprasek.databaseFirstApp.models.repositories;

import org.springframework.data.repository.CrudRepository;
import pl.lukaszprasek.databaseFirstApp.models.CustomerEntity;

public interface CustomerRepository extends CrudRepository<CustomerEntity, Integer> {
}
