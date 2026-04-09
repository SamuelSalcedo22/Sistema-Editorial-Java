public class Disco extends Publicacion {
    private float duracionMinutos;

    public Disco() {
        super();
        this.duracionMinutos = 0f;
    }

    public Disco(float duracionMinutos) {
        super();
        this.duracionMinutos = duracionMinutos;
    }

    public Disco(float duracionMinutos, String titulo, double precio) {
        super(titulo, precio);
        this.duracionMinutos = duracionMinutos;
    }

    public float getDuracionMinutos()                      { return duracionMinutos; }
    public void  setDuracionMinutos(float duracionMinutos) { this.duracionMinutos = duracionMinutos; }

    @Override
    public void mostrar() {
        System.out.println("=== DISCO ===");
        super.mostrar();
        System.out.printf("  Duracion: %.1f minutos%n", duracionMinutos);
    }

    @Override
    public String toString() {
        return "Disco[titulo=" + getTitulo() + ", precio=" + getPrecio()
                + ", duracion=" + duracionMinutos + " min]";
    }
}