public interface Formattable {
    String FormatterCsv(FormulaireContact formulaire);
    String FormatterJson(FormulaireContact formulaire);
    String FormatterHtml(FormulaireContact formulaire);
    String FormatterConnexionCsv(FormulaireConnexion connexion);
    String FormatterConnexionJson(FormulaireConnexion connexion);
    String FormatterConnexionHtml(FormulaireConnexion connexion);
}
