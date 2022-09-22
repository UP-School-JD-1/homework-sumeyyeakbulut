package enums;

public enum Sex implements EnumInterface {

    WOMEN("Women", "she"),
    MEN("Men", "he");

    private final String value;
    private final String heOrShe;


    Sex(String value, String heOrShe){
        this.value = value;
         this.heOrShe = heOrShe;
    }

    @Override
    public String getValue() {
        return value;
    }

    public String getHeOrShe() {
        return heOrShe;
    }
}
