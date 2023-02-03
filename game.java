import java.util.*;

public class game{
    static boolean winOrLose;
    public static void main(String[] args)
    {
        play();
        if(winOrLose == true)
        {
            System.out.println("YOU WIN");
        }
        else
        {
            System.out.println("YOU LOSE");
        }
    }


    public static boolean play()
    {
        int cInt;
        int x = 0;

        ArrayList<celebrity> celebList = new ArrayList<celebrity>();
        
        
        celebrity tSwift = new celebrity("Taylor Swift", "blue", 33, "Blonde", "Singer", 5.95, false);
        celebrity sLJackson = new celebrity("Samuel L Jackson", "brown", 74, "Bald", "Actor", 6.1, false);
        celebrity rCuomo = new celebrity("Rivers Cuomo", "brown", 33, "brown", "Singer", 5.5, false);
        celebrity tSwift3 = new celebrity("Taylor Swift", "blue", 33, "Blonde", "Singer", x, false);
        celebrity tSwift4 = new celebrity("Taylor Swift", "blue", 33, "Blonde", "Singer", x, false);
        celebrity tSwift5 = new celebrity("Taylor Swift", "blue", 33, "Blonde", "Singer", x, false);
        celebrity tSwift6 = new celebrity("Taylor Swift", "blue", 33, "Blonde", "Singer", x, false);
        celebrity tSwift7 = new celebrity("Taylor Swift", "blue", 33, "Blonde", "Singer", x, false);
        celebrity tSwift8 = new celebrity("Taylor Swift", "blue", 33, "Blonde", "Singer", x, false);
        celebrity tSwift9 = new celebrity("Taylor Swift", "blue", 33, "Blonde", "Singer", x, false);
        
        celebrity[] celebArray = {tSwift, sLJackson, rCuomo, tSwift3, tSwift4, tSwift5, tSwift6, tSwift7, tSwift8, tSwift9};
        
        for(int i = 0; i<10; i++)
        {
            celebList.add(celebArray[i]);
        }
        
        celebrity secretCeleb = celebList.get((int)((Math.random()*10)));
        celebrity baseCeleb = new celebrity();


        while(x<19)
        {
            Scanner input = new Scanner(System.in);

            System.out.println("Secret celebrity traits: \n" + "Eye Color: " + baseCeleb.getEyeColor() +"\n"
                                                             + "Age: " + baseCeleb.getAge() +"\n" 
                                                             + "Hair Color: " + baseCeleb.getHairColor() +"\n"
                                                             + "Profession: " + baseCeleb.getProfession() +"\n"
                                                             + "Height: " + baseCeleb.getHeight() +"\n"
                                                             + "Deceased: " + secretCeleb.getDeceased() +"\n");
            System.out.print("Which one would you like to guess (enter 1 - 6. 1 = name, 2 = eye color, 3 = age. you get the rest) : ");
            cInt = input.nextInt();

            switch(cInt)
            {
                case 1:
                System.out.print("Who is the Secret Celebrity: ");
                if(input.nextLine().equals(secretCeleb.getName()))
                {
                    winOrLose = true;
                    input.close();
                    return winOrLose;  
                }
                
                else
                {
                    System.out.println("Incorrect");
                }
                break;

                case 2:
                System.out.print("Guess an eye color: ");
                if(input.nextLine().toLowerCase().equals(secretCeleb.getEyeColor().toLowerCase()))
                {
                    baseCeleb.setEyeColor(secretCeleb.getEyeColor());
                }
                else
                {
                    System.out.println("Incorrect");
                }
                x++;
                break;

                case 3:
                System.out.print("Guess an age: ");
                if(input.nextInt()==secretCeleb.getAge())
                {
                    baseCeleb.setAge(secretCeleb.getAge());
                }
                else
                {
                    System.out.println("Incorrect");
                }
                x++;
                break;

                case 4:
                System.out.print("Guess an hair color: ");
                if(input.nextLine().toLowerCase().equals(secretCeleb.getHairColor().toLowerCase()))
                {
                    baseCeleb.setHairColor(secretCeleb.getHairColor());
                }
                else
                {
                    System.out.println("Incorrect");
                }
                x++;
                break;

                case 5:
                System.out.print("Guess a profession: ");
                if(input.nextLine().toLowerCase().equals(secretCeleb.getProfession().toLowerCase()))
                {
                    baseCeleb.setEyeColor(secretCeleb.getEyeColor());
                }
                else
                {
                    System.out.println("Incorrect");
                }
                x++;
                break;

                case 6:
                System.out.print("Guess an height (5'6 = 5.5): ");
                if(input.nextDouble()==secretCeleb.getHeight())
                {
                    baseCeleb.setHeight(secretCeleb.getHeight());
                }
                else
                {
                    System.out.println("Incorrect");
                }
                x++;
                break;

                /*case 7:
                System.out.print("Are they dead or alive (): ");
                if(input.nextBoolean()==secretCeleb.getDeceased())
                {
                    baseCeleb.setDeceased(secretCeleb.getDeceased());
                }
                else
                {
                    System.out.println("Incorrect");
                }
                x++;
                */


            }
            input.close();
        }
        return winOrLose;
    }

}
