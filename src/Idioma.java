public enum Idioma {
    ESPAÑOL,
    INGLES,
    PORTUGUES;

    @Override
    public String toString() {
        switch (this) {
            case ESPAÑOL:   return "Español";
            case INGLES:    return "Inglés";
            case PORTUGUES: return "Portugués";
            default:        return name();
        }
    }
}