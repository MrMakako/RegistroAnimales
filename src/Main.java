import java.util.Enumeration;
import java.util.Scanner;

public class Main {






    public static void main(String args[]){

        Registro regis = new Registro();

        Scanner lea= new Scanner(System.in);


        System.out.println("-----Registro de animales-----");
        boolean program=true;
        while(program){


            System.out.println("1-Registrar"

                    +"\n2-Editar"
                    +"\n3-Alimentacion"
                    +"\n4-Ver Lista"

            );
            System.out.print(">>");

            int caso= regis.option();

            switch(caso){

                case 1:{
                    System.out.println("1.Editar una caracteristica"+"\n2.Editar Todas");
                    System.out.print(">>");
                    caso= regis.option();
                    if (caso==1){

                        System.out.println("1-Nombre Cientifico"
                                +"\n2-Nombre"
                                +"\n3-Alimentacion"
                                +"\n4-Habitat"
                                +"\n5-Geografia"
                                +"\n6-Descripcion"

                        );
                        lea.useDelimiter("\\n");
                        String NombreCientifico= lea.next();
                        System.out.print("Ingrese>>");
                        String Entrada=lea.next();


                        regis.NumEdit(NombreCientifico, regis.option(),Entrada );


                    }




                }


            }










        }










    }
}
