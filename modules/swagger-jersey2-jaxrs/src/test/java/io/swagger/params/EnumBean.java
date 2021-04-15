package io.swagger.params;

import io.swagger.models.TestEnum;

import jakarta.ws.rs.HeaderParam;

public class EnumBean {

    @HeaderParam("HeaderParam")
    private TestEnum value;

    public TestEnum getValue() {
        return value;
    }

    public void setValue(TestEnum value) {
        this.value = value;
    }
}
