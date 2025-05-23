package com.networknt.schema;

import java.util.Arrays;

/**
 * Draft 7 dialect.
 */
public class Version7 implements JsonSchemaVersion {
    private static final String IRI = SchemaId.V7;
    private static final String ID = "$id";

    private static class Holder {
        private static final JsonMetaSchema INSTANCE;
        static {
            INSTANCE = JsonMetaSchema.builder(IRI)
                    .specification(SpecVersion.VersionFlag.V7)
                    .idKeyword(ID)
                    .formats(Formats.DEFAULT)
                    .keywords(ValidatorTypeCode.getKeywords(SpecVersion.VersionFlag.V7))
                    // keywords that may validly exist, but have no validation aspect to them
                    .keywords(Arrays.asList(
                            new NonValidationKeyword("$schema"),
                            new NonValidationKeyword("$id"),
                            new AnnotationKeyword("title"),
                            new AnnotationKeyword("description"),
                            new AnnotationKeyword("default"),
                            new NonValidationKeyword("definitions"),
                            new NonValidationKeyword("$comment"),
                            new AnnotationKeyword("examples"),
                            new NonValidationKeyword("then"),
                            new NonValidationKeyword("else"),
                            new NonValidationKeyword("additionalItems")))
                    .build();
        }
    }

    @Override
    public JsonMetaSchema getInstance() {
        return Holder.INSTANCE; 
    }
}
