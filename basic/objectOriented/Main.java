package basic.objectOriented;

public class Main {

    public static void main(String[] args) {

        UserClass newUser =new UserClass("Pritesh","patilpritesh7277@gmail.com",UserType.Admin,18);

        System.out.println("Name :"+ newUser.getName());
        System.out.println("Email :" + newUser.getEmail());
        System.out.println("User Type :"+ newUser.getUserType());
        System.out.println("Age :"+ newUser.getAge());


        newUser.checkEligible();

        UserClass.announceUserId(); // calling static method using class name
    }
}
