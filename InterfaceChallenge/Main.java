import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Player bil = new Player("zoo", 10, 5);
        saveObject(bil);
        System.out.println(bil);
        bil.setHitPoint(13);
        bil.setName("king");
        System.out.println("*****");
        System.out.println(bil);
        System.out.println("*****");
        saveObject(bil);
        System.out.println("*****");
        System.out.println(bil);
        System.out.println("*****");
        // loadObject(bil);
        System.out.println(bil);
        System.out.println(bil.getName());
        System.out.println("");

        ISavable wolf = new Monster("wolfMan", 5, 6);
        ((Monster) wolf).getName();
        
    }

    public static List<String> readValues(){
        List<String> values = new  ArrayList<String>();
        Scanner scanner = new Scanner(System.in);
        boolean quite = false;
        int index = 0;
        System.out.println("Choose\n" + 
                "1 to enter a string \n" +
                "0 to quite");

        while (!quite) {
            System.out.print("Choose an option : ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 0:
                    quite = true;
                    break;
                case 1:
                    System.out.print("Enter a stringe : ");
                    String stringInput = scanner.nextLine();
                    values.add(index, stringInput);
                    index++;
                    break;
            }
        }
        scanner.close();
        return values;
    }

    public static void saveObject(ISavable objectToSave){
        for (int i = 0; i < objectToSave.write().size(); i++) {
            System.out.println("Saving " + objectToSave.write().get(i) + " to storage media");
        }
    }

    public static void loadObject(ISavable objectToLoad){
        List<String> values = readValues();
        objectToLoad.read(values);
    }

}