import java.util.ArrayList;

public class Registro  {
    ArrayList<Animal> Animales= new ArrayList<Animal>();

    Animal an= new Animal();
    public Registro(){



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




    























}
