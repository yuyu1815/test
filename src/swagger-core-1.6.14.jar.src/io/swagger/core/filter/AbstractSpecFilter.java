package io.swagger.core.filter;

import io.swagger.model.ApiDescription;
import io.swagger.models.Model;
import io.swagger.models.Operation;
import io.swagger.models.parameters.Parameter;
import io.swagger.models.properties.Property;

import java.util.List;
import java.util.Map;

public abstract class AbstractSpecFilter implements SwaggerSpecFilter {
    public boolean isOperationAllowed(
            Operation operation,
            ApiDescription api,
            Map<String, List<String>> params,
            Map<String, String> cookies,
            Map<String, List<String>> headers) {
        return true;
    }

    public boolean isParamAllowed(
            Parameter parameter,
            Operation operation,
            ApiDescription api,
            Map<String, List<String>> params,
            Map<String, String> cookies,
            Map<String, List<String>> headers) {
        return true;
    }

    public boolean isDefinitionAllowed(
            Model model,
            Map<String, List<String>> params,
            Map<String, String> cookies,
            Map<String, List<String>> headers) {
        return true;
    }

    public boolean isPropertyAllowed(
            Model model,
            Property property,
            String propertyName,
            Map<String, List<String>> params,
            Map<String, String> cookies,
            Map<String, List<String>> headers) {
        return true;
    }

    public boolean isRemovingUnreferencedDefinitions() {
        return false;
    }
}