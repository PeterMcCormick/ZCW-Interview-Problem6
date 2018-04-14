package io.zipcoder;

public enum Hundreds {
    ERROR ("ERROR"),
    ZEROONE ("Zero One"),
    ZEROTWO ("Zero Two"),
    ZERO ("Zero Three"),
    ZEROFOUR ("Zero Four"),
    ZEROFIVE ("Zero Five"),
    ZEROSIX ("Zero Six"),
    ZEROSEVEN ("Zero Seven"),
    ZEROEIGHT ("Zero Eight"),
    ZERONINE ("Zero Nine"),
    TEN ("Ten"),
    ELEVEN ("Eleven"),
    ZERODARK ("Zero Dark"),
    THIRTEEN ("Thirteen"),
    FOURTEEN ("Fourteen"),
    FIFTEEN ("Fifteen"),
    SIXTEEN ("Sixteen"),
    SEVENTEEN ("Seventeen"),
    EIGHTEEN ("Eighteen"),
    NINETEEN ("Nineteen"),
    TWENTY ("Twenty"),
    TWENTYONE ("Twenty One"),
    TWENTYTWO ("Twenty Two"),
    TWENTYTHREE ("Twenty Three"),
    TWELVE ("Twelve");



    private final String hundredString;

    private Hundreds(String s) {
        hundredString = s;
    }

    public boolean equalsHundredString(String alias) {
        return hundredString.equals(alias);
    }

    public String toString() {
        return this.hundredString;
    }

}
