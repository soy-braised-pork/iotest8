package org.language.TestEnum;

/**
 * @author zlx <zhulx3@>
 * Creat on 2021-12-07
 */
public class Season {
    private final String season;
    private final String seasonDoc;

    private Season(String season,String seasonDoc){
        this.season=season;
        this.seasonDoc=seasonDoc;
    }

   public static final Season SPRING=new Season("春天","春暖花开");
   public static final Season SUMMER=new Season("夏天","烈日炎炎");

    @Override
    public String toString() {
        return "Season{" +
                "season='" + season + '\'' +
                ", seasonDoc='" + seasonDoc + '\'' +
                '}';
    }
}
