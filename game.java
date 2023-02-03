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

    public static void clearScreen() {  
        System.out.print("\033[H\033[2J");  
        System.out.flush();  
    }

    static int catchInt(Scanner scan){
        int max = 6;
        int min = 1;
        int numVal = 0;
        while(numVal < min || (numVal > max)){
            System.out.print("Enter a number: ");
            numVal = scan.nextInt();
            scan.nextLine();
            //numVal = Integer.parseInt(scan.nextLine());
        }
        return numVal;
    }

    public static boolean play()
    {
        
        int x = 0;
        String guess;

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


        while(x<2)
        {
            Scanner input = new Scanner(System.in);

            System.out.println("Secret celebrity traits: \n" + "Eye Color: " + baseCeleb.getEyeColor() +"\n"
                                                             + "Age: " + baseCeleb.getAge() +"\n" 
                                                             + "Hair Color: " + baseCeleb.getHairColor() +"\n"
                                                             + "Profession: " + baseCeleb.getProfession() +"\n"
                                                             + "Height: " + baseCeleb.getHeight() +"\n"
                                                             + "Deceased: " + secretCeleb.getDeceased() +"\n");
            System.out.print("Which one would you like to guess (enter 1 - 6. 1 = name, 2 = eye color, 3 = age. you get the rest) : ");
            int test = catchInt(input);

            switch(test)
            {
                case 1:
                    System.out.print("Who is the Secret Celebrity: ");
                    guess = input.nextLine();
                    if(guess.equals(secretCeleb.getName()))
                    {
                        winOrLose = true;
                        input.close();
                        clearScreen();
                        return winOrLose;
                    }
                
                    else
                    {
                        clearScreen();
                        System.out.println("Incorrect");
                    }
                break;

                case 2:
                    System.out.print("Guess an eye color: ");
                    if(input.nextLine().toLowerCase().equals(secretCeleb.getEyeColor().toLowerCase()))
                    {
                        baseCeleb.setEyeColor(secretCeleb.getEyeColor());
                        clearScreen();
                    }
                    else
                    {
                        clearScreen();
                        System.out.println("Incorrect");
                    }
                    x++;
                break;

                case 3:
                    System.out.print("Guess an age: ");
                    if(input.nextInt()==secretCeleb.getAge())
                    {
                        baseCeleb.setAge(secretCeleb.getAge());
                        clearScreen();

                    }
                    else
                    {
                        clearScreen();
                        System.out.println("Incorrect");
                    }
                    x++;
                break;

                case 4:
                    System.out.print("Guess an hair color: ");
                    guess = input.nextLine();
                    if(input.nextLine().toLowerCase().equals(secretCeleb.getHairColor().toLowerCase()))
                    {
                        baseCeleb.setHairColor(secretCeleb.getHairColor());
                        clearScreen();
                    }
                    else
                    {
                        clearScreen();
                        System.out.println("Incorrect");
                    }
                    x++;
                break;

                case 5:
                    System.out.print("Guess a profession: ");
                    if(input.nextLine().toLowerCase().equals(secretCeleb.getProfession().toLowerCase()))
                    {
                        baseCeleb.setEyeColor(secretCeleb.getEyeColor());
                        clearScreen();
                    }
                    else
                    {
                        clearScreen();
                        System.out.println("Incorrect");
                    }
                    x++;
                break;

                case 6:
                    System.out.print("Guess an height (5'6 = 5.5): ");
                    if(input.nextDouble()==secretCeleb.getHeight())
                    {
                        baseCeleb.setHeight(secretCeleb.getHeight());
                        clearScreen();
                    }
                    else
                    {
                        clearScreen();
                        System.out.println("Incorrect");
                    }
                    x++;
                break;
            }
            input.close();
        }
        return winOrLose;
    }

}
