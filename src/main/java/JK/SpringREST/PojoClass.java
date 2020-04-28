package JK.SpringREST;

import org.apache.commons.lang3.builder.ToStringBuilder;

public class PojoClass {
    private Header header;

    public Header getHeader() {
        return header;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}
