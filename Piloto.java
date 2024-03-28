public class Piloto extends Persona implements Volador {
    public int matricula;
    public int antiguedad;

    //Piloto hereda atributos de superclase PERSONA
    public Piloto(String nombre_completo, int edad, int documento, int matricula, int antiguedad) {
        super(nombre_completo, edad, documento);
        this.matricula = matricula;
        this.antiguedad = antiguedad;
    }

    //Metodo heredado de Interfaz volador
    @Override
    public void volar() {
        System.out.println("El piloto dice: Encender motores");
    }

    @Override
    public String toString() {
        return "Nombre = " + nombre_completo + " -" +
                " Matricula = " + matricula + " -" +
                " Antiguedad = " + antiguedad + " -" +
                " Edad = " + edad + " -" +
                " Documento = " + documento;
    }


}
