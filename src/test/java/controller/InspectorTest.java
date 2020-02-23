package controller;

import exception.OutOfCarNameLengthException;
import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class InspectorTest {

    Inspector inspector;

    @Before
    public void setup() {
        inspector = new Inspector();
    }

    @Test
    public void inspectCarNameNotThrowsExceptionTest() throws OutOfCarNameLengthException {
        inspector.inspectCarNameLength("crong");
    }

    @Test
    public void inspectCarNameThrowsExceptionTest() throws OutOfCarNameLengthException {
        assertThatThrownBy(() -> {
            inspector.inspectCarNameLength("keroro");
        }).isInstanceOf(OutOfCarNameLengthException.class);
    }
}
