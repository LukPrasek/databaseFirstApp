package pl.lukaszprasek.databaseFirstApp.models.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.lukaszprasek.databaseFirstApp.models.BarcodeEntity;

@Repository
public interface BarcodeRepository extends CrudRepository<BarcodeEntity,Integer> {

}
