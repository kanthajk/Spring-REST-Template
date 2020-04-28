package JK.SpringREST;

import org.apache.commons.lang3.builder.ToStringBuilder;

public class Header {
    private String id;

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}
