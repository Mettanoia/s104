package ex2.domain.entities;

import java.util.Optional;

final class DniUtility {

    private DniUtility(){}

    static Optional<DniLetter> dniLetterFromNumber(String dniNumber){
        int dniNumberDigits = dniNumber.length();
        if (dniNumberDigits > 8) // Precondition regarding poorly formatted inputs
            return Optional.empty();

        int remainder;
        try {
            remainder = Integer.parseInt(dniNumber) % 23;
        } catch (NumberFormatException e){
            return Optional.empty();
        }

        return Optional.of(DniLetter.values()[remainder]);

    }

}
