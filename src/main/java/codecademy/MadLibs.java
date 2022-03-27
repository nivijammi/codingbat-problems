package codecademy;

public class MadLibs {
    /*
    create variables to complete Mad Lib word game and print the story with variable in the right places.
    Author: Nivi
    Date:08/28/2019
    */
    public static void main(String[] args){
        String name1 = "bub";
        String name2 = "bubba";
        String adjective1 = "lazy";
        String adjective2 = "crunchy";
        String adjective3 = "blue";
        String verb1 = "swat";
        String noun1 = "boy";
        String noun2 = "ball";
        String noun3 = "lamp";
        String noun4 = "chair";
        String noun5 = "couch";
        String noun6 = "table";
        String place1 = "Timbuktu";
        int number = 4050;


        //The template for the story
        String story = "This morning "+name1+" woke up feeling "+adjective1+". 'It is going to be a "+adjective2+" day!' Outside, a bunch of "+noun1+"s were protesting to keep "+noun2+" in stores. They began to "+verb1+" to the rhythm of the "+noun3+", which made all the "+noun4+"s very "+adjective3+". Concerned, "+name1+" texted "+name2+", who flew "+name1+" to "+place1+" and dropped "+name1+" in a puddle of frozen "+noun5+". "+name1+" woke up in the year "+number+", in a world where "+noun6+"s ruled the world.";

        System.out.println(story);
    }
}

