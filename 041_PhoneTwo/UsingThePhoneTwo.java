public class UsingThePhoneTwo{
// open class where I will actually use and create a Phone
    
public static void main(String[]args){
        
        Phone myCell = new Phone("samsung", "red", "T-Mobile", 2010);
       // creating a new phone object
        
       Phone phone = new Phone("blue");
       // creating another phone with a different constructor

       Phone myPhone = new Phone();
       // creating another phone with a different constructor

       System.out.println(myPhone);
       System.out.println(myCell);
       System.out.println(phone);
       // doing this command would use the toString method and basically printing it's location, but I redefined it to print what's inside the object
    } 
}