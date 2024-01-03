import java.util.ArrayList;
import java.util.List;
import java.util.SplittableRandom;

public class Keyword {
    //Attributter

    private String word;
    private String definition;
    private List<String> seeAlso;


    public Keyword(String word, String definition) {
        this.word = word;
        this.definition = definition;
        this.seeAlso = new ArrayList<>();
    }

    public String getWord() {
        return word;
    }

    public String getDefinition() {
        return definition;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public void setDefinition(String definition) {
        this.definition = definition;

    }

    //Tilføj en metode ”matches” der returnerer hvorvidt ordet matcher et søgeord

    public boolean matches(String searchWord) {
        return this.word.equalsIgnoreCase(searchWord);

    }


    // Tilføj en ”see also” attribut der henviser til andre keywords
    public void addSeeAlso(String relatedKeyword) {
        this.seeAlso.add(relatedKeyword);
    }

    public void setSeeAlso(List<String> seeAlso) {
        this.seeAlso = seeAlso;

    }

    public List<String> getSeeAlso() {
        return seeAlso;
    }
}
