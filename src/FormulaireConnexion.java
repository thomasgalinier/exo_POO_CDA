public class FormulaireConnexion extends Formulaire implements ConnexionProvider {
    private String pseudo;
    private String password;

    public FormulaireConnexion(String email, String pseudo, String password) {
        super(email);
        this.pseudo = pseudo;
        this.password = password;
    }

    public String getPseudo() {
        return pseudo;
    }

    public void setPseudo(String pseudo) {
        this.pseudo = pseudo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
