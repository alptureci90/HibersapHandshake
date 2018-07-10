package hiberSAPExample.utilities;

import org.hibersap.annotations.*;
import org.hibersap.conversion.CharConverter;

import java.lang.reflect.Field;

@BapiStructure
public class BapiRet2 {
    @Parameter("TYPE")
    @Convert(converter = CharConverter.class)
    private char type;

    @Parameter("ID")
    private String id;

    @Parameter("NUMBER")
    private String number;

    @Parameter("MESSAGE")
    private String message;

    public char getType() { return this.type; }

    public String getId() { return this.id; }

    public String getNumber() { return this.number; }

    public String getMessage() { return this.message; }

    @Override
    public String toString(){
        StringBuffer sb  = new StringBuffer();

        sb.append("\nReturn Fields:");
        sb.append("\nType: " + getType());
        sb.append("\nId: " + getId());
        sb.append("\nNumber: " + getNumber());
        sb.append("\nMessage: " + getMessage());

        return sb.toString();
    }
}
