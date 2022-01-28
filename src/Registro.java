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

        return null;



    }


    public boolean Add(String NombreCientifico){

        if(check(NombreCientifico,0)==null){

            Animales.add(new Animal(NombreCientifico,"","","","",""));

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
            return option();

        }

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
