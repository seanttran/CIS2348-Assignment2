import java.util.Scanner;
public class main {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        String first;
        String last;
        String psid;
        String standing;
        String email;
        String street;
        String city;
        String state;
        String zipcode;
        System.out.print("How many students' data will be entered? ");
        int N =input.nextInt();
        //create object array with size of user input
        Student data[] = new Student[N];

        for (int i=0;i<data.length;i++){
            Scanner inp = new Scanner(System.in);

            System.out.print("Enter first name:  ");
            first = inp.nextLine();
            while (!first.matches("[a-zA-Z]+")){
                System.out.println("Please enter only alphabetical characters.");
                System.out.print("Enter first name:  ");
                first = inp.nextLine();
            }

            System.out.print("Enter last name: ");
            last = inp.nextLine();
            while (!last.matches("[a-zA-Z]+")){
                System.out.println("Please enter only alphabetical characters.");
                System.out.print("Enter last name:  ");
                last = inp.nextLine();
            }

            System.out.print("Enter PeopleSoft ID: ");
            psid = inp.nextLine();
            while (!psid.matches("[0-9]{1,7}+")){
                System.out.println("Please enter only 7 or less numerical characters.");
                System.out.print("Enter PeopleSoft ID:  ");
                psid = inp.nextLine();
            }

            System.out.print("Enter class standing: ");
            standing = inp.nextLine();
            while (!((standing.equalsIgnoreCase("freshman"))||(standing.equalsIgnoreCase("sophomore"))
                    ||(standing.equalsIgnoreCase("junior"))||(standing.equalsIgnoreCase("senior")))){
                System.out.println("Please enter Freshman, Sophomore, Junior or Senior. ");
                System.out.print("Enter class standing: ");
                standing = inp.nextLine();
            }

            System.out.print("Enter Email ID: ");
            email = inp.nextLine();
            while (!email.matches("^[a-zA-Z1-9]+@[A-zA-z1-9]+.(com|edu|org)$")){
                System.out.println("Invalid email.");
                System.out.print("Please enter email ID again: ");
                email = inp.nextLine();
            }

            System.out.print("Enter street address: ");
            street = inp.nextLine();
            while (!street.matches("[0-9]{1,9}+\\s[a-zA-Z]+\\s[a-zA-Z]+.?")){
                System.out.println("Invalid address.");
                System.out.print("Please house number followed by a space and street name: ");
                street = inp.nextLine();
            }

            System.out.print("Enter city: ");
            city = inp.nextLine();
            while (!city.matches("[a-zA-Z]+?(\\s)?([a-zA-Z]+)")){
                System.out.println("Please enter only alphabetical characters.");
                System.out.print("Enter city:  ");
                city = inp.nextLine();
            }

            System.out.print("Enter state (abbreviation): ");
            state = inp.nextLine();
            while (!(state.equalsIgnoreCase("AK")||(state.equalsIgnoreCase("AL"))||(state.equalsIgnoreCase("AR"))
                    ||(state.equalsIgnoreCase("AZ"))||(state.equalsIgnoreCase("CA"))||(state.equalsIgnoreCase("CO"))
                    ||(state.equalsIgnoreCase("CT"))||(state.equalsIgnoreCase("DC"))||(state.equalsIgnoreCase("DE"))
                    ||(state.equalsIgnoreCase("FL"))||(state.equalsIgnoreCase("GA"))||(state.equalsIgnoreCase("HI"))
                    ||(state.equalsIgnoreCase("IA"))||(state.equalsIgnoreCase("ID"))||(state.equalsIgnoreCase("IL"))
                    ||(state.equalsIgnoreCase("IN"))||(state.equalsIgnoreCase("KS"))||(state.equalsIgnoreCase("KY"))
                    ||(state.equalsIgnoreCase("LA"))||(state.equalsIgnoreCase("MA"))||(state.equalsIgnoreCase("MD"))
                    ||(state.equalsIgnoreCase("ME"))||(state.equalsIgnoreCase("MI"))||(state.equalsIgnoreCase("MN"))
                    ||(state.equalsIgnoreCase("MO"))||(state.equalsIgnoreCase("MS"))||(state.equalsIgnoreCase("MT"))
                    ||(state.equalsIgnoreCase("NC"))||(state.equalsIgnoreCase("ND"))||(state.equalsIgnoreCase("NE"))
                    ||(state.equalsIgnoreCase("NH"))||(state.equalsIgnoreCase("NM"))||(state.equalsIgnoreCase("NV"))
                    ||(state.equalsIgnoreCase("NY"))||(state.equalsIgnoreCase("OH"))||(state.equalsIgnoreCase("OK"))
                    ||(state.equalsIgnoreCase("OR"))||(state.equalsIgnoreCase("PA"))||(state.equalsIgnoreCase("RI"))
                    ||(state.equalsIgnoreCase("SC"))||(state.equalsIgnoreCase("SD"))||(state.equalsIgnoreCase("TN"))
                    ||(state.equalsIgnoreCase("TX"))||(state.equalsIgnoreCase("UT"))||(state.equalsIgnoreCase("VA"))
                    ||(state.equalsIgnoreCase("VT"))||(state.equalsIgnoreCase("WA"))||(state.equalsIgnoreCase("WI"))
                    ||(state.equalsIgnoreCase("WV"))||(state.equalsIgnoreCase("WY")))){
                System.out.println("Please enter a valid US state.");
                System.out.print("Enter state: ");
                state = inp.nextLine();

            }

            System.out.print("Enter zip code: ");
            zipcode = inp.nextLine();
            while (!zipcode.matches("[0-9]{9}+")){
                System.out.println("Please enter only 9 numerical characters.");
                System.out.print("Enter zip code:  ");
                zipcode = inp.nextLine();
            }

            data[i] = new Student(first, last, psid, standing, email, street, city, state, zipcode);
            data[i].getInfo(first, last,psid, standing, email, street, city, state, zipcode);
        }
        System.out.println("Student Details, Department of ILT");
        for (int i=0;i<data.length;i++){
            data[i].displayInfo();}

        for (int j=0;j<N;j++){
            Student.incrementCount();
        }
        System.out.println("\nNumber of students: "+(Student.incrementCount()-1));

    }

}
