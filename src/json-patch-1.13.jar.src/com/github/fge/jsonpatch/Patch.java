package com.github.fge.jsonpatch;

import com.fasterxml.jackson.databind.JsonNode;

public interface Patch {

    JsonNode apply(JsonNode node) throws JsonPatchException;
}
