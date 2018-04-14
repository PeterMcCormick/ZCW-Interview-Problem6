package io.zipcoder;

public enum Hours {
    ZERO ("Zero"),
    ONE ("One"),
    TWO ("Two"),
    THREE ("Three"),
    Four ("Four"),
    FIVE ("Five"),
    SIX ("Six"),
    SEVEN ("Seven"),
    EIGHT ("Eight"),
    NINE ("Nine"),
    TEN ("Ten"),
    ELEVEN ("Eleven"),
    TWELVE ("Twelve"),
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
    TWENTYFOUR ("Twenty Four"),
    TWENTYFIVE ("Twenty Five"),
    TWENTYSIX ("Twenty Six"),
    TWENTYSEVEN ("Twenty Seven"),
    TWENTYEIGHT ("Twenty Eight"),
    TWENTYNINE ("Twenty Nine"),
    THIRTY ("Thirty"),
    THIRTYONE ("Thirty One"),
    THIRTYTWO ("Thirty Two"),
    THIRTYTHREE ("Thirty Three"),
    THIRTYFOUR ("Thirty Four"),
    THIRTYFIVE ("Thirty Five"),
    THIRTYSIX ("Thirty Six"),
    THIRTYSEVEN ("Thirty Seven"),
    THIRTYEIGHT ("Thirty Eight"),
    THIRTYNINE ("Thirty Nine"),
    FORTY ("Forty"),
    FORTYONE ("Forty One"),
    FORTYTWO ("Forty Two"),
    FORTYTHREE ("Forty Three"),
    FORTYFOUR ("Forty Four"),
    FORTYFIVE ("Forty Five"),
    FORTYSIX ("Forty Six"),
    FORTYSEVEN ("Forty Seven"),
    FORTYEIGHT ("Forty Eight"),
    FORTYNINE ("Forty Nine"),
    FIFTY ("Fifty"),
    FIFTYONE ("Fifty One"),
    FIFTYTWO ("Fifty Two"),
    FIFTYTHREE ("Fifty Three"),
    FIFTYFOUR ("Fifty Four"),
    FIFTYFIVE ("Fifty Five"),
    FIFTYSIX ("Fifty Six"),
    FIFTYSEVEN ("Fifty Seven"),
    FIFTYEIGHT ("Fifty Eight"),
    FIFTYNINE ("Fifty Nine");


    private final String hourString;

    private Hours(String s) {
        hourString = s;
    }

    public boolean equalsHourString(String alias) {
        return hourString.equals(alias);
    }

    public String toString() {
        return this.hourString;
    }
}
