package prueba.animales.models;

public class Animales {

    private Integer id;

    private String nombre;

    private int vidaMedia;

    private boolean extinto;

    public Animales(Integer id, String nombre, int vidaMedia, boolean extinto) {
        this.id = id;
        this.nombre = nombre;
        this.vidaMedia = vidaMedia;
        this.extinto = extinto;
    }

    public Integer getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public int getVidaMedia() {
        return vidaMedia;
    }

    public boolean isExtinto() {
        return extinto;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setVidaMedia(int vidaMedia) {
        this.vidaMedia = vidaMedia;
    }

    public void setExtinto(boolean extinto) {
        this.extinto = extinto;
    }
}
