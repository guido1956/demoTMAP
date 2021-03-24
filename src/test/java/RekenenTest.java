import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.aggregator.ArgumentsAccessor;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.*;

class RekenenTest {
    @ParameterizedTest(name = "Test of {1} {0} {2} result {3} ")
    @CsvFileSource(resources = "rekenen.csv" ,numLinesToSkip = 1)

    public void rekenacties(ArgumentsAccessor arguments) {
        Rekenen rekenen = new Rekenen();
        String actionWord = arguments.getString(0);
        int expectedResult = arguments.getInteger(3);
        int actualResult= 0;
        switch (actionWord) {
            case "telop" -> {
                actualResult = rekenen.optellen(arguments.getInteger(1), arguments.getInteger(2));
                assertEquals(expectedResult, actualResult, "Optelling niet juist");
            }
            case "trekaf" -> {
                actualResult = rekenen.aftrekken(arguments.getInteger(1), arguments.getInteger(2));
                assertEquals(expectedResult, actualResult, "Aftrekking niet juist");

            }
            case "vermenigvuldig" -> {
                actualResult = rekenen.vermenigvuldigen(arguments.getInteger(1), arguments.getInteger(2));
                assertEquals(expectedResult, actualResult, "Vermenigvuldiging niet juist");

            }
        }
    }
}


