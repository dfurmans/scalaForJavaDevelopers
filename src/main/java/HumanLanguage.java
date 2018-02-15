import java.util.ArrayList;
import java.util.List;

public class HumanLanguage {
    public enum Level {
        HI, MID, LOW;
    }
    public HumanLanguage() {}
    public static ArrayList<HumanLanguage> someHumanLanguages = new ArrayList<HumanLanguage>();
    public String name;
    public Level level;
    public Boolean learned;

    static {
        someHumanLanguages = new ArrayList<HumanLanguage>() {
            {
                add(new HumanLanguage("Spanish", Level.HI, Boolean.FALSE));
                add(new HumanLanguage("English", Level.MID, Boolean.TRUE));
                add(new HumanLanguage("Chinese", Level.HI, Boolean.FALSE));
            }
        };
    }

    public HumanLanguage(String name, Level level, Boolean learned) {
        this.name = name;
        this.level = level;
        this.learned = learned;
    }
    //public static List<String> getLernedLanguagesNames(){}
    public static void main (String[] args ){
        HumanLanguage h = new HumanLanguage();
    }
}