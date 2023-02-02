//import java.util.ArrayList;

public class celebrity{
    
     //All the variables needed for the celebrity class are declared here. They are later used in the celebrity object.
    
    String name;
    String eyeColor;
    int age;
    String hairColor;
    String profession;
    double height;
    Boolean deceased;

    public celebrity(String name, String eyeColor, int age, String hairColor, String profession, double height, Boolean deceased){
        this.name = name;
        this.eyeColor = eyeColor;
        this.age = age;
        this.hairColor = hairColor;
        this.profession = profession;
        this.height = height;
        this.deceased = deceased;
    }

    public celebrity(){

    }

    /** Mutators methods
         * setName -
         * @param newName
         * sets a new name for the celebrity object using the incoming parameter, newName.
         * 
         * setEyeColor - 
         * @param newEyeColor
         * sets a new eye color for the celebrity object using the incoming parameter, newEyeColor
         * 
         * setCareer - 
         * @param newAge
         * sets a new career for the celebrity object usig the incoming parameter, newCareer.
         * 
         * setHairColor - 
         * @param newHairColor
         * sets a new hair color for the celebrity object using the incoming parameter, newHairColor.
         * 
         * setProfession - 
         * @param newProfession
         * sets a new profession for the celebrity object using the incoming parameter, newProfession.
         * 
         * setHeight - 
         * @param newHeight
         * sets a new height for the celebrity object using the incoming parameter, newHeight.
         * 
         * setDeceased - 
         * @param newDeceased
         * sets a new living status for the celebrity object using the incoming parameter, newDeceased.
     */

    public void setName(String newName){
        this.name = newName;
    }

    public void setEyeColor(String newEyeColor){
        this.eyeColor = newEyeColor;
    }

    public void setAge(int newAge){
        this.age = newAge;
    }

    public void setHairColor(String newHairColor){
        this.hairColor = newHairColor;
    }

    public void setProfession(String newProfession){
        this.profession = newProfession;
    }

    public void setHeight(double newHeight){
        this.height = newHeight;
    }
    
    public void setDeceased(Boolean newDeceased){
        this.deceased = newDeceased;
    }
    
    /** Accessor methods
         * getName -
         * sets a new name for the celebrity object
         * 
         * getEyeColor - 
         * sets a new eye color for the celebrity object
         * 
         * setCareer - 
         * sets a new career for the celebrity object
         * 
         * setHairColor - 
         * sets a new hair color for the celebrity object
         * 
         * setProfession - 
         * sets a new profession for the celebrity object
         * 
         * setHeight - 
         * sets a new height for the celebrity object
         * 
         * setDeceased - 
         * sets a new living status for the celebrity object
     */

    public String getName(){
        return this.name;
    }

    public String getEyeColor(){
        return this.eyeColor;
    }

    public int getAge(){
        return this.age;
    }

    public String getHairColor(){
        return this.hairColor;
    }

    public String getProfession(){
        return this.profession;
    }

    public double getHeight(){
        return this.height;
    }

    public boolean getDeceased(){
        return this.deceased;
    }
     
/**Function methods
 * 
 */

}
