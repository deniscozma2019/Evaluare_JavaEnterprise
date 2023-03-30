public class Teacher {

    String surname ;
    String lastname;
    int age ;
    String gender;

    public Teacher(String surname,String lastname, int age, String gender) {
        this.surname = surname;
        this.lastname = lastname;
        this.age = age;
        this.gender = gender;
    }
    public String getSurname() {
        return surname;
    }
    public String getLastname(){
        return lastname;
    }

    public int  getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

}
