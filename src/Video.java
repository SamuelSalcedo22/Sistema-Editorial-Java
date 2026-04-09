public class Video extends Publicacion {
    private float  duracionHoras;
    private Idioma idioma;

    public Video() {
        super();
        this.duracionHoras = 0f;
        this.idioma        = Idioma.ESPAÑOL;
    }

    public Video(float duracionHoras, Idioma idioma) {
        super();
        this.duracionHoras = duracionHoras;
        this.idioma        = idioma;
    }

    public Video(float duracionHoras, Idioma idioma, String titulo, double precio) {
        super(titulo, precio);
        this.duracionHoras = duracionHoras;
        this.idioma        = idioma;
    }

    public float  getDuracionHoras()                    { return duracionHoras; }
    public void   setDuracionHoras(float duracionHoras) { this.duracionHoras = duracionHoras; }
    public Idioma getIdioma()                           { return idioma; }
    public void   setIdioma(Idioma idioma)              { this.idioma = idioma; }

    @Override
    public void mostrar() {
        System.out.println("=== VIDEO ===");
        super.mostrar();
        System.out.printf("  Duracion: %.1f horas%n", duracionHoras);
        System.out.println("  Idioma  : " + idioma);
    }

    @Override
    public String toString() {
        return "Video[titulo=" + getTitulo() + ", precio=" + getPrecio()
                + ", duracion=" + duracionHoras + " h, idioma=" + idioma + "]";
    }
}