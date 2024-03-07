public class Formatter implements Formattable {

    public Formatter(Formulaire contact) {
    }

    public  String FormatterCsv(FormulaireContact formulaire){
        return formulaire.getEmail() + ";" + formulaire.getObject() + ";" + formulaire.getMessage();
    }
    public String FormatterJson(FormulaireContact formulaire){
        return "{ email:" + formulaire.getEmail() + ", object:" + formulaire.getObject() + ", message:" + formulaire.getMessage() + "}" ;
    }
    public String FormatterHtml (FormulaireContact formulaire){
        return "<div><h1>Formulaire de contact</h1> <p>email:</p><p>" + formulaire.getEmail() +"</p>" +"<p>objet:</p><p>" + formulaire.getObject() + "</p>" + "<p>message:</p><textArea>"+ formulaire.getMessage() + "</textArea>"  +  "<div/>";
    }
    public String FormatterConnexionCsv(FormulaireConnexion connexion){
        return connexion.getEmail() + ";" + connexion.getPseudo() + ";" + connexion.getPassword();
    }

    public String FormatterConnexionJson(FormulaireConnexion connexion){
        return "{ email:" + connexion.getEmail() + ", pseudo:" + connexion.getPseudo() + ", password:" + connexion.getPassword() + "}" ;
    }
    public String FormatterConnexionHtml (FormulaireConnexion connexion){
        return "<div><h1>Formulaire de connexion</h1> <p>email:</p><p>" + connexion.getEmail() +"</p>" +"<p>pseudo:</p><p>" + connexion.getPseudo() + "</p>" + "<p>password:</p><textArea>"+ connexion.getPassword() + "</textArea>"  +  "<div/>";
    }

}
