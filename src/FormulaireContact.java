public class FormulaireContact extends Formulaire implements ContactProvider {
    private String object;
    private String message;

    public FormulaireContact(String email, String object, String message){
        super(email);
        this.object = object;
        this.message = message;

    }

    public String getObject() {
        return object;
    }

    public void setObject(String object) {
        this.object = object;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
