import java.util.ArrayList;
import java.util.Scanner;

public class Registro  {
    ArrayList<Animal> Animales= new ArrayList<Animal>();

    Scanner leer;
    Animal an= new Animal();
    public Registro(){
        leer=new Scanner(System.in);


    }




    public Animal check(String NombreCientifico,int sum){

        if(sum<Animales.size()){
            if(Animales.get(sum).getNombreCientifico().equals(NombreCientifico)){
                return Animales.get(0);

            }
            return check(NombreCientifico,sum+1);

        }

        return null;



    }


    public boolean Add(String NombreCientifico){

        if(check(NombreCientifico,0)==null){

            Animales.add(new Animal(NombreCientifico,"","","","",""));

            return true;

        }

        return false;




    }


    public String verify(String NombreCientifico){
        String nombre="";
        if(check(NombreCientifico,0)!=null){
            System.out.println("ingrese otro nombre este esta ocupado!!!!!");
            return(leer.next());


        }

        return nombre;



    }


    public void NumEdit(String NombreCientifico,int option,String Entrada){
        Animal Edit= check(NombreCientifico,0);
        if(Edit!=null){

            int index=Animales.indexOf(Edit);


            switch (option){
                case 1:{
                    System.out.println("NombreCientifico:");
                    if(check(Entrada,0)!=null){

                        System.out.println("Nombre invalido");
                        break;

                    }
                    Edit.setNombreCientifico(Entrada);


                    ;break;}
                case 2:{
                    System.out.println("Nombre:");
                    break;}
                case 3:{
                    System.out.println("Alimentacion:");
                    break;}
                case 4:{
                    System.out.println("Habitat:");break;}
                case 5:{
                    System.out.println("Geografia");break;}
                case 6:{
                    System.out.println("Descripcion");
                    break;
                }

            }






        }

    }





































}
