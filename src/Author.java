public class Author {
    private String name;
    private String email;
    private char gender;

    public Author (String autName, String autEmail, char gender){
        this.name = autName;
        this.email = autEmail;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String autEmail) {
        this.email = autEmail;
    }
    public char getGender() {
        return gender;
    }
    public String toString(){
        return this.name+" ("+this.gender+") at "+this.email;
    }


}
