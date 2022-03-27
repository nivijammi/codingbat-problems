package codecademy;

public class Dog{
    // instance field
    String name;
    String breed;
    int age;
    int price;

    //constructor method
    public Dog(String dogName, String dogBreed, int dogAge, int dogPrice ){
        // assign value of parameter to instance field
        name = dogName;
        breed = dogBreed;
        age = dogAge;
        price = dogPrice;
    }

    public static void main(String [] args){
        // create instance by using 'new' operator and invoke the constructor
        Dog breedOne = new Dog("fido", "Golden Retriever", 2 , 500);
        Dog breedTwo = new Dog("fifi","Dacsund", 1, 450);
        System.out.println(breedOne.breed);

    }


}
