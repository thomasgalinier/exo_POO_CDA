public class Formulaire implements FormulaireProvider {
    private String email;


    public Formulaire(String email){
        this.email = email;
    };



    public void setEmail(String email) {
        this.email = email;
    }
    public String getEmail(){
        return email;
    }

}
