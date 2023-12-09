package basic.objectOriented;

public class UserClass {

    private String name;
    private String email;
    private int age;

    private static int userId; // static variable or attribute
    private UserType userType;
    static void announceUserId(){   // static method
        System.out.println("User id is "+UserClass.userId);
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static int getUserId() {
        return userId;
    }

    public static void setUserId(int userId) {
        UserClass.userId = userId;
    }

    public UserType getUserType() {
        return userType;
    }

    public void setUserType(UserType userType) {
        this.userType = userType;
    }

    public UserClass(String name, String email, UserType userType, int age) {
        this.name = name;
        this.email = email;
        this.userType = userType;
        this.age=age;
    }

    public void checkEligible(){
        if(age>=18){
            System.out.println(this.name+" is eligible as the age is "+this.age);
        }
    }
}
