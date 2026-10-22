package prueba.animales.services;

import org.springframework.stereotype.Service;
import prueba.animales.models.Animales;

import java.util.ArrayList;
import java.util.List;

@Service
    public class AnimalesService {
        private final List<Animales> animales = new ArrayList<>();
        public AnimalesService() {
            animales.add(new Animales(1, "Dodo", 30, true));
            animales.add(new Animales(2, "Tortuga", 100, false));
            animales.add(new Animales(3, "Lince", 15, false));
        }

        public List<Animales> findAll() { return animales; }

    public Animales findById(int id) {
        for (Animales a : animales) {
            if (a.getId() == id) {
                return a;
            }
        }
        return null;
    }
    }
