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
                add(new HumanLanguage("Spanish", Level.MID, Boolean.FALSE));
                add(new HumanLanguage("English", Level.LOW, Boolean.TRUE));
                add(new HumanLanguage("Chinese", Level.HI, Boolean.FALSE));
            }
        };
    }

    public HumanLanguage(String name, Level level, Boolean learned) {
        this.name = name;
        this.level = level;
        this.learned = learned;
    }


    public interface Function1<A,B>{
        public B call(A a);
    }


    public static class HumanLanguageLearnedCondicion implements Function1<HumanLanguage,Boolean>{
            public Boolean call(HumanLanguage element) {
                return element.learned == Boolean.TRUE;
            }
    }

    public static class HumanLanguageToName implements Function1<HumanLanguage, String>{
        public String call(HumanLanguage humanLanguage){
            return humanLanguage.name;
        }
    }

    public static <B> List<B> getField(Function1<HumanLanguage,Boolean> a, Function1<HumanLanguage,B> b) {
        List<B> result = new ArrayList<>();
        for (HumanLanguage h : someHumanLanguages ){
            if (a.call(h) == Boolean.TRUE){ // condicion IF
                result.add(b.call(h)); // transformacion
            }
        }
        return result;
    }

    public void combine(){
        Function1 a = new HumanLanguageLearnedCondicion();
        Function1 b = new HumanLanguageToName();
        getField(a,b);
    }

    public static List<String> getLernedLanguagesNames(){
        List<String> result =  new ArrayList<>();
        for (HumanLanguage singleEle : someHumanLanguages){ // loop for each
            if (singleEle.learned == Boolean.TRUE){ // un condiccion
                result.add(singleEle.name); // una Transformacion de A => B
            }
        }
    }

    public static void main (String[] args ){
        HumanLanguage h = new HumanLanguage();
    }
}