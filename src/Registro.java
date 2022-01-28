import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Registro  {
    ArrayList<Animal> Animales= new ArrayList<Animal>();

    Scanner leer;
    Animal an= new Animal();
    public Registro(){
        leer=new Scanner(System.in);

        Add("vaca alpina");
        Add("Mongosaurio supremo");
        Add("Muercielagus Maustrus");



    }




    public Animal check(String NombreCientifico,int sum){

        if(sum<Animales.size()){
            if(Animales.get(sum).getNombreCientifico().toLowerCase().equals(NombreCientifico.toLowerCase())){
                System.out.println("Animal existen en la base de datos!!!");
                return Animales.get(0);


            }
            return check(NombreCientifico,sum+1);

        }




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


    public void Alimentar(String Casador,String Presa){
        Animal a1=check(Casador,0);
        Animal a2=check(Presa,0);

        if(a1!=null && a2!=null){
            System.out.println(a1.getNombreCientifico()+" se comio un/a "+a2.getNombreCientifico());
            Animales.remove(Animales.indexOf(a2));




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
                    Edit.setNombreComun(Entrada);


                    break;}
                case 3:{
                    System.out.println("Alimentacion:");

                    Entrada=leer.next();
                    Edit.setAlimentacion(Entrada);
                    break;}
                case 4:{
                    System.out.println("Habitat:");
                    Entrada=leer.next();
                    Edit.setHabitat(Entrada);

                    break;
                }
                case 5:{
                    System.out.println("Geografia");
                    Entrada=leer.next();
                    Edit.setGeografia(Entrada);
                    break;}
                case 6:{
                    System.out.println("Descripcion");
                    Entrada=leer.next();
                    Edit.setDescripcion(Entrada);

                    break;
                }



            }

            Animales.set(index,Edit);










        }









    }





































}
