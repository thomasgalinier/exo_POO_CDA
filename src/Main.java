//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        FormulaireContact contact = new FormulaireContact("galinierthomas@gmail.com", "Demande de renseingment", "JE demande des renseignement");
        Formatter formatter = new Formatter(contact);
        System.out.println("Contact");
        System.out.println(formatter.FormatterCsv(contact));
        System.out.println(formatter.FormatterJson(contact));
        System.out.println(formatter.FormatterHtml(contact));

        FormulaireConnexion connexion = new FormulaireConnexion("galinierthomas@gmail.com", "toma", "P@sWor_d");
        Formatter formatter1 = new Formatter(connexion);
        System.out.println("Connexion");
        System.out.println(formatter1.FormatterConnexionCsv(connexion));
        System.out.println(formatter1.FormatterConnexionJson(connexion));
        System.out.println(formatter1.FormatterConnexionHtml(connexion));

    }
}