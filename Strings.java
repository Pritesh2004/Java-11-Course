public class Strings {

    public static void main(String[] args) {

        String studentFirstName = "Pritesh";
        String studentLastName = "Patil";


        //Using charAt function of String to get 0 letter of student first Name
        char studentFirstInitial = studentFirstName.charAt(0);

        //Using charAt function of String to get 0 letter of student last Name
        char studentLastInitial = studentLastName.charAt(0);

        //Concatenating two strings
        String studentName = studentFirstName + "" + studentLastName;


        System.out.println("Name : " + studentName);
        System.out.println("First Initial : " + studentFirstInitial);
        System.out.println("Last Initial : " + studentLastInitial);
    }
}
