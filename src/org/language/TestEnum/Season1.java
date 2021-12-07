package org.language.TestEnum;

public enum Season1 {



    SPRING("春天","春暖花开"),
    SUMMER("夏天","烈日炎炎");


    private final String season;
    private final String seasonDoc;

    private Season1(String season,String seasonDoc){
        this.season=season;
        this.seasonDoc=seasonDoc;
    }


    @Override
    public String toString() {
        return "Season{" +
                "season='" + season + '\'' +
                ", seasonDoc='" + seasonDoc + '\'' +
                '}';
    }
}
