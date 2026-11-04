package prueba.animales.models;


import jakarta.persistence.*;


    @Entity
    @Table(name = "animales")
    public class Animales {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Integer id;

        private String nombre;
        private int vidaMedia;
        private boolean extinto;

        public Animales() {
        }

        public Animales(Integer id, String nombre, int vidaMedia, boolean extinto) {
            this.id = id;
            this.nombre = nombre;
            this.vidaMedia = vidaMedia;
            this.extinto = extinto;
        }

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public int getVidaMedia() {
            return vidaMedia;
        }

        public void setVidaMedia(int vidaMedia) {
            this.vidaMedia = vidaMedia;
        }

        public boolean isExtinto() {
            return extinto;
        }

        public void setExtinto(boolean extinto) {
            this.extinto = extinto;
        }
    }