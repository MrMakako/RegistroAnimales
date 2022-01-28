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
    public void listar(){
        int  counter=0;
        for(Animal e: Animales){

            System.out.println(counter+"-"+e.getNombreCientifico());
            counter++;

        }

    }



    public Animal check(String NombreCientifico,int sum){

        if(sum<Animales.size()){
            if(Animales.get(sum).getNombreCientifico().toLowerCase().equals(NombreCientifico.toLowerCase())){
                System.out.println("Animal existen en la base de datos!!!");
                return Animales.get(sum);


            }
            return check(NombreCientifico,sum+1);

        }




        return null;





    }


    public void EditAll(String nombre){

        for (int i=1; i<7 ;i++){


            NumEdit(nombre,i);







        }
        System.out.println("Guardado!!!!");


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
            System.out.println("Error Entrada no valida intente otra vez");
            leer.next();
            System.out.print(">>");
            return option();

        }

    }

    public void printAll(){

        for (Animal a:Animales) {
            a.print();

        }






    }


    public void Alimentar(int a1,int a2){


            System.out.println(Animales.get(a1).getNombreCientifico()+" se comio un/a "+Animales.get(a2).getNombreCientifico());
            Animales.remove(a2);












    }



    public void NumEdit(String NombreCientifico,int option){
        Animal Edit= check(NombreCientifico,0);
        if(Edit!=null){

            String Entrada;

            leer.useDelimiter("\\n");


            int index=Animales.indexOf(Edit);

            System.out.println();


            if(option==1){

                System.out.print("Descripcion:");
                Entrada=leer.next();
                Edit.setDescripcion(Entrada);

            }else if(option==2){
                System.out.print("Nombre:");

                Entrada=leer.next();
                Edit.setNombreComun(Entrada);


            }
            else if(option==3){
                System.out.print("Alimentacion:");

                Entrada=leer.next();
                Edit.setAlimentacion(Entrada);

            }
            else if(option==4){
                System.out.print("Habitat:");
                Entrada=leer.next();
                Edit.setHabitat(Entrada);



            }
            else if(option==5){
                System.out.print("Geografia:");
                Entrada=leer.next();
                Edit.setGeografia(Entrada);

            }
            else if (option==6){


                System.out.println("NombreCientifico:");



                Entrada=leer.next();

                if(check(Entrada,0)!=null){

                    System.out.print("Nombre invalido");


                }else{
                    Edit.setNombreCientifico(Entrada);
                }




            }

            Animales.set(index,Edit);




        }























    }





































}
