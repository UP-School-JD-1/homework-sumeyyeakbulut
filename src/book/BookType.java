package book;

import enums.EnumInterface;

public enum BookType implements EnumInterface {

    FICTION("Fiction"),
    NON_FICTION("Non-fiction"),
    SCINTIFIC("Scintific");

    private final String value;

    BookType(String value){
        this.value = value;
    }

    @Override
    public String getValue() {
        return value;
    }
}
