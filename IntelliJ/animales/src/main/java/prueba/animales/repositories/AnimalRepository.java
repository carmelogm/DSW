package prueba.animales.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import prueba.animales.models.Animales;

@Repository
public interface AnimalRepository
        extends JpaRepository<Animales, Integer> {
}