package pl.lukaszprasek.databaseFirstApp.models.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.lukaszprasek.databaseFirstApp.models.BookEntity;

@Repository
public interface BookRepository extends CrudRepository<BookEntity, Integer> {
}
