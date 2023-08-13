package dto.definition.property.value.generator.impl.init;


import dto.definition.property.value.generator.api.ValueGenerator;

public class InitValueGenerator<T> implements ValueGenerator<T> {

    private final T initValue;

    public InitValueGenerator(T initValue) {
        this.initValue = initValue;
    }

    @Override
    public T generateValue() {
        return initValue;
    }
}
