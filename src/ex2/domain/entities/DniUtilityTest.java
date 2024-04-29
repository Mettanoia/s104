package ex2.domain.entities;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Optional;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DniUtilityTest {

    public static Stream<Arguments> getDniSource() {
        return Stream.of(
                Arguments.of("12345678", DniLetter.Z),
                Arguments.of("12345678", DniLetter.Z),
                Arguments.of("23456789", DniLetter.D),
                Arguments.of("34567890", DniLetter.V),
                Arguments.of("45678901", DniLetter.G),
                Arguments.of("56789012", DniLetter.B),
                Arguments.of("67890123", DniLetter.B),
                Arguments.of("78901234", DniLetter.X),
                Arguments.of("89012345", DniLetter.E),
                Arguments.of("01234567", DniLetter.L)
        );
    }

    public static Stream<Arguments> getDniSourceBadFormat() {
        return Stream.of(
                Arguments.of("123456789", Optional.empty()),
                Arguments.of("1234567", Optional.of(DniLetter.L)),
                Arguments.of("Yo he matado por menos", Optional.empty()),
                Arguments.of("aaaaaaaa", Optional.empty())
        );
    }

    @ParameterizedTest
    @MethodSource("getDniSource")
    void dniLetterFromNumber_dniNumberProvided_returnsSomeOptional(String dniNumber, DniLetter dniLetter) {
        assertEquals(DniUtility.dniLetterFromNumber(dniNumber).get(), dniLetter);
    }

    @ParameterizedTest
    @MethodSource("getDniSourceBadFormat")
    void dniLetterFromNumber_badFormattedProvided_returnsNoneOptional(String dniNumber, Optional dniLetteOrEmpty){
        assertEquals(DniUtility.dniLetterFromNumber(dniNumber), dniLetteOrEmpty);
    }


}