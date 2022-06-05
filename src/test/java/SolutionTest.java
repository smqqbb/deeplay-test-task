import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    @Test
    void getResult() {
        assertEquals(10, Solution.getResult("STWSWTPPTPTTPWPP","Human"));
    }
}