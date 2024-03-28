public abstract class Persona {
    public String nombre_completo;
    public int edad;
    public int documento;
    public Persona(String nombre_completo, int edad, int documento) {
        this.nombre_completo = nombre_completo;
        this.edad = edad;
        this.documento = documento;
    }
}
