package io.swagger.models.properties;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;
import static org.testng.Assert.assertTrue;
import static org.testng.Assert.assertFalse;

public class ObjectPropertyTest {

    ObjectProperty objectProperty;

    @BeforeMethod
    public void setup() {
        objectProperty = new ObjectProperty(null);
    }

    @Test
    public void testProperty() {
        // given
        ObjectProperty objectProperty = new ObjectProperty(null);

        DoubleProperty property = new DoubleProperty();
        String name = "name";

        // when
        objectProperty.property(name, property);

        // then
        assertEquals(objectProperty.getProperties().get(name), property,
                "The get property must be the same as the set one");
    }

    @Test
    public void testReadOnly() {
        // when
        objectProperty._default("default");
        objectProperty.readOnly(true);

        // then
        assertTrue(objectProperty.getReadOnly(), "The get readOnly must be the same as the set one");
    }

    @Test
    public void testRequired() {
        // when
        objectProperty._default("default");
        objectProperty.required(true);

        // then
        assertTrue(objectProperty.getRequired(), "The get required must be the same as the set one");
    }

    @Test
    public void testNotEqualOnDifferentProperties() {
        //given
        ObjectProperty objectProperty = new ObjectProperty();
        objectProperty.property("some", new StringProperty());

        ObjectProperty otherObjectProperty = new ObjectProperty();
        otherObjectProperty.property("someOther", new StringProperty());

        //when
        boolean equals = objectProperty.equals(otherObjectProperty);

        //then
        assertFalse(equals);
        assertNotEquals(objectProperty.hashCode(), otherObjectProperty.hashCode());
    }

    @Test
    public void testEqualOnEqualProperties() {
        //given
        ObjectProperty objectProperty = new ObjectProperty();
        objectProperty.property("some", new StringProperty());

        ObjectProperty otherObjectProperty = new ObjectProperty();
        otherObjectProperty.property("some", new StringProperty());

        //when
        boolean equals = objectProperty.equals(otherObjectProperty);

        //then
        assertTrue(equals);
        assertEquals(objectProperty.hashCode(), otherObjectProperty.hashCode());
    }
}
