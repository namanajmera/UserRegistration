import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
public class UserRegistrationTest {
    //--------------------------Test Cases for Name Validation--------------------------//
    @Test
    public void givenFirstName_WhenProper_ShouldReturnTrue() {
        boolean result = UserRegistration.validateFirstName("Arti");
        assertTrue(result);
    }

    @Test
    public void givenFirstName_WhenWithSpChars_ShouldReturnFalse() {
        boolean result = UserRegistration.validateFirstName("In@sd");
        assertFalse(result);
    }

    @Test
    public void givenFirstName_WhenShort_ShouldReturnFalse() {
        boolean result = UserRegistration.validateFirstName("In");
        assertFalse(result);
    }
    @Test
    public void givenFirstName_WhenSmall_ShouldReturnFalse() {
        boolean result = UserRegistration.validateFirstName("ssnsdgdf");
        assertFalse(result);
    }

    //--------------------------Test Cases for Email Validation--------------------------//
    @Test
    public void validateEmailAddress_WhenValid_ShouldReturnTrue() {
        boolean result = UserRegistration.validateEmail("sjk@gmail.com");
        assertTrue(result);
    }

    @Test
    public void validateEmailAddress_WhenUserNameHasAHyphen_ShouldReturnTrue() {
        boolean result = UserRegistration.validateEmail("abc-100@yahoo.com");
        assertTrue(result);
    }

    @Test
    public void validateEmailAddress_WhenUserNameHasDigit_ShouldReturnTrue() {
        boolean result = UserRegistration.validateEmail("abc.100@yahoo.com");
        assertTrue(result);
    }

    @Test
    public void validateEmailAddress_WhenValidDomainName1_ShouldReturnTrue() {
        boolean result = UserRegistration.validateEmail("abc.100@abc.com.au");
        assertTrue(result);
    }

    @Test
    public void validateEmailAddress_WhenValidDomainName2_ShouldReturnTrue() {
        boolean result = UserRegistration.validateEmail("abc@1.com");
        assertTrue(result);
    }

    @Test
    public void validateEmailAddress_WhenWithoutDomain_ShouldReturnFalse() {
        boolean result = UserRegistration.validateEmail("abc");
        assertFalse(result);
    }

    @Test
    public void validateEmailAddress_WhenUserNameStartsWithDot_ShouldReturnFalse() {
        boolean result = UserRegistration.validateEmail(".abc@abc.com");
        assertFalse(result);
    }

    @Test
    public void validateEmailAddress_WhenHasDoubleAt_ShouldReturnFalse() {
        boolean result = UserRegistration.validateEmail("abc@abc@gmail.com");
        assertFalse(result);
    }

    @Test
    public void validateEmailAddress_WhenHasOtherThanCharDigitUnderScoreAndDash_ShouldReturnFalse() {
        boolean result = UserRegistration.validateEmail("abc()*@gmail.com");
        assertFalse(result);
    }

    @Test
    public void validateEmailAddress_WhenHasDoubleDots_ShouldReturnFalse() {
        boolean result = UserRegistration.validateEmail("abc..2002@gmail.com");
        assertFalse(result);
    }

    @Test
    public void validateEmailAddress_WhenDomainStartWithDot_ShouldReturnFalse() {
        boolean result = UserRegistration.validateEmail("abc@.com.my");
        assertFalse(result);
    }

    @Test
    public void validateEmailAddress_WhenDomainHasSpChars_ShouldReturnFalse() {
        boolean result = UserRegistration.validateEmail("abc@%*.com");
        assertFalse(result);
    }

    @Test
    public void validateEmailAddress_WhenTLDHasOtherThanCharAndDigit_ShouldReturnFalse() {
        boolean result = UserRegistration.validateEmail("abc@%*.com");
        assertFalse(result);
    }


    //--------------------------Test Cases for Mobile Number Validation--------------------------//
    @Test
    public void validateMobileNo_WhenValid_ShouldReturnTrue() {
        boolean result = UserRegistration.validateMobileNumber("9021343413");
        assertTrue(result);
    }

    @Test
    public void validateMobileNo_WhenValidWithCountryCode_ShouldReturnTrue() {
        boolean result = UserRegistration.validateMobileNumber("+91 9021343413");
        assertTrue(result);
    }

    @Test
    public void validateMobileNo_WhenShort_ShouldReturnFalse() {
        boolean result = UserRegistration.validateMobileNumber("902134");
        assertFalse(result);
    }

    @Test
    public void validateMobileNo_WhenTooLong_ShouldReturnFalse() {
        boolean result = UserRegistration.validateMobileNumber("902134343434");
        assertFalse(result);
    }

    @Test
    public void validateMobileNo_WhenHasNonDigits_ShouldReturnFalse() {
        boolean result = UserRegistration.validateMobileNumber("9203z$sf");
        assertFalse(result);
    }

    @Test
    public void validateMobileNo_WhenStartingDigitNotBetween6To9_ShouldReturnFalse() {
        boolean result = UserRegistration.validateMobileNumber("4959692949");
        assertFalse(result);
    }

    //--------------------------Test Cases for Password Validation--------------------------//
    @Test
    public void validatePassword_WhenValid_ShouldReturnTrue() {
        boolean result = UserRegistration.validatePassword("SwS@sff223");
        assertTrue(result);
    }

    @Test
    public void validatePassword_WhenDoNotContainAtLeast1Upper_ShouldReturnFalse() {
        boolean result = UserRegistration.validatePassword("wret@sff223");
        assertFalse(result);
    }

    @Test
    public void validatePassword_WhenDoNotContainAtLeast1Lower_ShouldReturnFalse() {
        boolean result = UserRegistration.validatePassword("SDG@444");
        assertFalse(result);
    }

    @Test
    public void validatePassword_WhenDoNotContainAtLeast1Digit_ShouldReturnFalse() {
        boolean result = UserRegistration.validatePassword("SDG@sdgsd");
        assertFalse(result);
    }

    @Test
    public void validatePassword_WhenTooShort_ShouldReturnFalse() {
        boolean result = UserRegistration.validatePassword("SG@d34");
        assertFalse(result);
    }
}
