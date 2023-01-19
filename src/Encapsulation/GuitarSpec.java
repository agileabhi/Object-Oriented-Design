package Encapsulation;

import java.util.Objects;

public class GuitarSpec {
    private Builder builder;
    private String model;

    private Wood topwood;
    private Wood backwood;
    private Type type;

    public GuitarSpec(Builder builder, String model, Wood topwood, Wood backwood, Type type) {
        this.builder = builder;
        this.model = model;
        this.topwood = topwood;
        this.backwood = backwood;
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GuitarSpec that = (GuitarSpec) o;
        return builder == that.builder && Objects.equals(model, that.model) && topwood == that.topwood && backwood == that.backwood && type == that.type;
    }

    @Override
    public int hashCode() {
        return Objects.hash(builder, model, topwood, backwood, type);
    }

    public Builder getBuilder() {
        return builder;
    }

    public String getModel() {
        return model;
    }

    public Wood getTopwood() {
        return topwood;
    }

    public Wood getBackwood() {
        return backwood;
    }

    public Type getType() {
        return type;
    }
}
