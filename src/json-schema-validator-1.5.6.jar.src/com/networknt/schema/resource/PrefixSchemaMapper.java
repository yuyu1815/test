package com.networknt.schema.resource;

import com.networknt.schema.AbsoluteIri;

/**
 * Prefix implementation of {@link SchemaMapper}.
 */
public class PrefixSchemaMapper implements SchemaMapper {
    private final String source;
    private final String replacement;

    public PrefixSchemaMapper(String source, String replacement) {
        this.source = source;
        this.replacement = replacement;
    }

    @Override
    public AbsoluteIri map(AbsoluteIri absoluteIRI) {
        String absoluteIRIString = absoluteIRI != null ? absoluteIRI.toString() : null;
        if (absoluteIRIString != null && absoluteIRIString.startsWith(source)) {
            return AbsoluteIri.of(replacement + absoluteIRIString.substring(source.length()));
        }
        return null;
    }
}
