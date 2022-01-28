import jdk.swing.interop.SwingInterOpUtils;

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

                case 2:{
                    System.out.println("1.Editar una caracteristica"+"\n2.Editar Todas");
                    System.out.print(">>");
                    caso= regis.option();
                    if (caso==1){


                        lea.useDelimiter("\\n");
                        System.out.print("Nombre Cientifico:");

                        System.out.print("----------Elija una opcion para editar-----------");

                        System.out.println("1-Nombre Cientifico"
                                +"\n2-Nombre"
                                +"\n3-Alimentacion"
                                +"\n4-Habitat"
                                +"\n5-Geografia"
                                +"\n6-Descripcion"

                        );

                        String NombreCientifico= lea.next();
                        System.out.print("Ingrese>>");
                        String Entrada=lea.next();


                        regis.NumEdit(NombreCientifico, regis.option(),Entrada );


                    }




                }
                case 1:{

                    lea.useDelimiter("\\n");

                    System.out.println("Nombre cientifico del animal:");
                    String NombreCientifico= lea.next();




                    regis.Add(NombreCientifico);


                }


            }










        }










    }
}
