import java.util.*;

public class game {
    public static void main(String[] args){

    }


    public static boolean play(){
        boolean winOrLose;
        int x = 0;

        ArrayList<celebrity> celebList = new ArrayList<celebrity>();

        for(int i = 0; i<10; i++){
            celebrity celeb = new celebrity();
            celebList.add(celeb);
        }
        
        celebrity secretCeleb = celebList.get((int)((Math.random()*10) + 1));

        while(x<19){
            Scanner input = new Scanner(System.in);

            System.out.println("Secret celebrity traits: \n" + "Eye Color: " + secretCeleb.getEyeColor() +"\n"
                                                             + "Age: " + secretCeleb.getAge() +"\n" 
                                                             + "Hair Color: " + secretCeleb.getHairColor() +"\n"
                                                             + "Profession: " + secretCeleb.getProfession() +"\n"
                                                             + "Height: " + secretCeleb.getHeight() +"\n"
                                                             + "Deceased: " + secretCeleb.getDeceased() +"\n");
            System.out.print("Which one would you like to guess (enter 1 - 7. 1 = name, 2 = eye color, 3 = hair color. you get the rest) : ");
            int cString = input.nextInt();

            switch(cString){
                case 1:
                System.out.print("");

            }

        }

        return winOrLose;
    }

}
