package prueba.animales.services;

import org.springframework.stereotype.Service;
import prueba.animales.models.Animales;
import prueba.animales.repositories.AnimalRepository;

import java.util.List;
import java.util.Optional;

@Service
public class AnimalesService {
    private final AnimalRepository ar;

    public AnimalesService(AnimalRepository ar) {
        this.ar = ar;
    }

    public List<Animales> findAll() {
        return ar.findAll();
    }

    public Optional<Animales> findById(Integer id) {
        return ar.findById(id);
    }

    public void guardar(Animales animales) {
        ar.save(animales);
    }

    public void actualizar(Integer id, Animales animalActualizado) {
        animalActualizado.setId(id);
        ar.save(animalActualizado);
    }

    public void eliminarPorId(Integer id) {
        ar.deleteById(id);
    }
}