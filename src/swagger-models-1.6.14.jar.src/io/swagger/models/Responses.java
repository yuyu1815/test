package io.swagger.models;


import java.util.LinkedHashMap;
import java.util.Objects;

public class Responses extends LinkedHashMap<String, Response> {

    private java.util.Map<String, Object> vendorExtensions = null;

    public Responses addResponse(String name, Response item) {
        this.put(name, item);
        return this;
    }


    public java.util.Map<String, Object> getVendorExtensions() {
        return vendorExtensions;
    }

    public void addVendorExtension(String name, Object value) {
        if (name == null || name.isEmpty() || !name.startsWith("x-")) {
            return;
        }
        if (this.vendorExtensions == null) {
            this.vendorExtensions = new java.util.HashMap<>();
        }
        this.vendorExtensions.put(name, value);
    }

    public void setVendorExtensions(java.util.Map<String, Object> extensions) {
        this.vendorExtensions = extensions;
    }

    public Responses vendorExtensions(java.util.Map<String, Object> extensions) {
        this.vendorExtensions = extensions;
        return this;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        if (!super.equals(o)) {
            return false;
        }
        Responses responses = (Responses) o;
        return Objects.equals(this.vendorExtensions, responses.vendorExtensions) &&
                super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), vendorExtensions);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Responses {\n");
        sb.append("    ").append(toIndentedString(super.toString())).append("\n");
        sb.append("    vendorExtensions: ").append(toIndentedString(vendorExtensions)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
