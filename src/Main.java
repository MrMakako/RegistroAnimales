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
                        String NombreCientifico= lea.next();

                        System.out.println("----------Elija una opcion para editar-----------");

                        System.out.println("1-Nombre Cientifico"
                                +"\n2-Nombre comun"
                                +"\n3-Alimentacion"
                                +"\n4-Habitat"
                                +"\n5-Geografia"
                                +"\n6-Descripcion"

                        );


                        System.out.print("Ingrese>>");
                        int Entrada=regis.option();


                        regis.NumEdit(NombreCientifico, Entrada);


                    }else if(caso==2){
                        System.out.print("Nombre Cientifico:");
                        lea.useDelimiter("\\n");
                        System.out.print(">>");

                        regis.EditAll(lea.next());

                    }

                    break;




                }
                case 1:{

                    lea.useDelimiter("\\n");

                    System.out.println("Nombre cientifico del animal:");
                    System.out.print(">>");
                    String NombreCientifico= lea.next();




                    regis.Add(NombreCientifico);

                    break;


                }

                case 3:{

                    System.out.println("-----------Alimentacion-------------");

                    System.out.println("Animal  a Alimentar(Escriba su nombre cientifico) y luego el de la comida (nomrbe cientifico)");
                    lea.useDelimiter("\\n");
                    regis.Alimentar(lea.next(),lea.next());


                    break;
                }

                case 4:{

                    System.out.println("---------Ver aniamles---------");
                    System.out.println("1-Elegir  aniaml"+"\n2-Verlos todos");

                    System.out.print(">>");
                    caso= regis.option();

                    if(caso==1){
                        System.out.println("Nombre Cientifico:");
                        lea.useDelimiter("\\n");
                        Animal mostrar= regis.check(lea.next(),0);
                        if(mostrar!=null)
                            mostrar.print();





                    }else if(caso==2){
                        regis.printAll();


                    }

                    break;




                }


            }










        }










    }
}
