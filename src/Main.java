public class Main {
    public static void main(String[] args) {
        Keyword keyword = new Keyword("Java", " A high - level, object oriented programming language");
        System.out.println("Word: " + keyword.getWord());
        System.out.println("Defintion: " + keyword.getDefinition());

// Ændre defintion og udskrive igen
        keyword.setDefinition("A versatile programming language used for a varity of applications.");
        System.out.println("Opdated Definition: " + keyword.getDefinition());

        String searchWord = "java";
        System.out.println("Matches search word ' " + searchWord + "' :" + keyword.matches(searchWord));
    keyword.addSeeAlso("Pyton");
    keyword.addSeeAlso("C++");
        System.out.println("See Also: " + keyword.getSeeAlso());
    }


}