public class Animal {


    private String NombreCientifico;




    private String NombreComun,Descripcion,Habitat,Alimentacion,Geografia;

    public Animal(){

    }


    public Animal(String NombreCientifico,String NombreComun, String Descripcion,String Habitat,String Alimentacion,String Geografia) {

        this.NombreCientifico=NombreCientifico;
        this.NombreComun=NombreComun;
        this.Descripcion=Descripcion;
        this.Habitat=Habitat;
        this.Alimentacion=Alimentacion;
        this.Geografia=Geografia;


    }

    public String getNombreCientifico() {
        return NombreCientifico;
    }

    public void setNombreCientifico(String nombreCientifico) {
        NombreCientifico = nombreCientifico;
    }

    public void setAlimentacion(String alimentacion) {
        Alimentacion = alimentacion;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public String getNombreComun() {
        return NombreComun;
    }

    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }

    public void setGeografia(String geografia) {
        Geografia = geografia;
    }

    public void setNombreComun(String nombreComun) {
        NombreComun = nombreComun;
    }


    public String getHabitat() {
        return Habitat;
    }

    public void setHabitat(String habitat) {
        Habitat = habitat;
    }


    public void print(){
        System.out.println("Nombre Cientifico :"+getNombreCientifico()+"\n"
                +"\nNombre comun : "+getNombreComun()
                +"\nHabitad: "+getHabitat()
                +"\nAlimentacion: "+Alimentacion
                +"\nDescrpcion: "+Descripcion
                +"\nGeografia: "+Geografia
        );

        System.out.println("------------------------");





    }





}
