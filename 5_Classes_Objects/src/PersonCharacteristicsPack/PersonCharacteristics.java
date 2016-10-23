package PersonCharacteristicsPack;

import java.util.Scanner;

public class PersonCharacteristics {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        input.nextLine();
        Person[] newPersonArr = new Person[11];
        for (int i = 0; i < n; i++) {
            System.out.print("Describe characteristics: ");
            String person = input.nextLine();
            String[] human = person.split(",");
            String firstName = human[0];
            String lastName = human[1];
            String gender = human[2];
            int birth = Integer.parseInt(human[3]);
            int age = 2016 - birth;
            double weight = Double.parseDouble(human[4]);;
            int height = Integer.parseInt(human[5]);
            String profession = human[6];
            double assisment1 = Double.parseDouble(human[7]);
            double assisment2 = Double.parseDouble(human[8]);
            double assisment3 = Double.parseDouble(human[9]);
            double assisment4 = Double.parseDouble(human[10]);
            double averageAss = (assisment1 + assisment2 + assisment4 + assisment4) / 4;
            Person newPerson = new Person(firstName, lastName, gender, birth, weight, height, profession, assisment1, assisment2, assisment3, assisment4);
            //System.out.printf(firstName + " " + lastName + "is d% old.He was born in d% .His weight is d% and he is d% cm tall.He is a s% with average grade of d%", age, birth, weight, height, profession, averageAss);
            //System.out.print(newPerson);
            newPersonArr[i] = newPerson;
        }
        for (Person human: newPersonArr) {
            
        }
    }
}
