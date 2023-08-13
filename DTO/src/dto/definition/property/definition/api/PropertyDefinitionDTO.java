package dto.definition.property.definition.api;

import dto.definition.rule.enums.Type;

import java.util.List;

public interface PropertyDefinitionDTO {
    String getUniqueName();
    Type getType();
    Boolean doesHaveRange();
    List<Object> getRange();
    Boolean isRandomInitialized();
}