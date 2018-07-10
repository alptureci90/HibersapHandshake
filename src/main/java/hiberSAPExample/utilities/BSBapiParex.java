package hiberSAPExample.utilities;

import org.hibersap.annotations.BapiStructure;
import org.hibersap.annotations.Parameter;

/**
 * BAPIPAREX
 */

@BapiStructure
public class BSBapiParex {

    @Parameter("STRUCTURE")
    private String structure;

    @Parameter("VALUEPART1")
    private String valuePart1;

    @Parameter("VALUEPART2")
    private String valuePart2;

    @Parameter("VALUEPART3")
    private String valuePart3;

    @Parameter("VALUEPART4")
    private String valuePart4;

    public String getStructure() {
        return structure;
    }

    public void setStructure(String structure) {
        this.structure = structure;
    }

    public String getValuePart1() {
        return valuePart1;
    }

    public void setValuePart1(String valuePart1) {
        this.valuePart1 = valuePart1;
    }

    public String getValuePart2() {
        return valuePart2;
    }

    public void setValuePart2(String valuePart2) {
        this.valuePart2 = valuePart2;
    }

    public String getValuePart3() {
        return valuePart3;
    }

    public void setValuePart3(String valuePart3) {
        this.valuePart3 = valuePart3;
    }

    public String getValuePart4() {
        return valuePart4;
    }

    public void setValuePart4(String valuePart4) {
        this.valuePart4 = valuePart4;
    }
}
