import java.util.ArrayList;
import java.util.Scanner;

public class Registro  {
    ArrayList<Animal> Animales= new ArrayList<Animal>();

    Scanner leer;
    Animal an= new Animal();
    public Registro(){
        leer=new Scanner(System.in);

        Add("Vaca alpina");
        Add("Mongosaurio supremo");
        Add("Muercielagus Maustrus");



    }




    public Animal check(String NombreCientifico,int sum){

        if(sum<Animales.size()){
            if(Animales.get(sum).getNombreCientifico().equals(NombreCientifico)){
                return Animales.get(0);

            }
            return check(NombreCientifico,sum+1);

        }

        System.out.println("Animal existen en la base de datos!!!");

        return null;





    }


    public boolean Add(String NombreCientifico){

        if(check(NombreCientifico,0)==null){

            Animales.add(new Animal(NombreCientifico,"","","","",""));
            System.out.println("se registro con exito!!!!!");
            return true;

        }

        return false;




    }

    public int option(){
        try{


            int num= leer.nextInt();

            return num;

        }catch (Exception e){
            System.out.println("Error Entrada no valida");
            leer.next();
            return option();

        }

    }

    public void printAll(){

        for (Animal a:Animales) {
            a.print();

        }






    }




    public void NumEdit(String NombreCientifico,int option){
        Animal Edit= check(NombreCientifico,0);
        if(Edit!=null){

            String Entrada;
            leer.useDelimiter("\\n");

            int index=Animales.indexOf(Edit);


            switch (option){
                case 1:{
                    System.out.println("NombreCientifico:");



                    Entrada=leer.next();



                    if(check(Entrada,0)!=null){

                        System.out.println("Nombre invalido");
                        break;

                    }
                    Edit.setNombreCientifico(Entrada);


                    ;break;}
                case 2:{
                    System.out.println("Nombre:");

                    Entrada=leer.next();
                    break;}
                case 3:{
                    System.out.println("Alimentacion:");

                    Entrada=leer.next();
                    break;}
                case 4:{
                    System.out.println("Habitat:");
                    Entrada=leer.next();

                    break;
                }
                case 5:{
                    System.out.println("Geografia");
                    Entrada=leer.next();
                    break;}
                case 6:{
                    System.out.println("Descripcion");
                    Entrada=leer.next();

                    break;
                }



            }










        }







    }





































}
