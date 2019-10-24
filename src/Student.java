public class Student {
    private static int count;
    private String first;
    private String last;
    private String psid;
    private String standing;
    private String email;
    private String street;
    private String city;
    private String state;
    public String zipcode;

    public Student(String first, String last, String psid, String standing, String email, String street, String city, String state, String zipcode) {
    }


    public void getInfo(String a, String b, String c, String d, String e, String f, String g, String h, String j) {
        first = a;
        last = b;
        psid = c;
        standing = d;
        email = e;
        street = f;
        city = g;
        state = h;
        zipcode = j;
    }

    public void displayInfo() {

        System.out.print("\nFirst Name: " + first.substring(0, 1).toUpperCase() + first.substring(1)+"\t");
        System.out.print("Last Name: " + last.substring(0,1).toUpperCase()+last.substring(1)+"\t");
        System.out.print("Peoplesoft ID: " + psid+"\t");
        System.out.print("Class Standing: " + standing.substring(0,1).toUpperCase()+standing.substring(1)+"\t");
        System.out.print("Email ID:" + email+"\t");
        System.out.print("Address: " + street + ", " + city.substring(0,1).toUpperCase()+city.substring(1) + ", " + state.toUpperCase() + ", " + zipcode+"\t");
    }

    //count number of students
    public static int incrementCount() {
        count = count + 1;
        return (count);
    }


}
