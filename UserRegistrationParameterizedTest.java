import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.jupiter.api.Assertions.assertEquals;


@RunWith(Parameterized.class)
public class UserRegistrationParameterizedTest {
    private String testEmail;
    private boolean expectedResult;
    //--------------------------Test Cases for email with Parameterized constructor--------------------------//
    public UserRegistrationParameterizedTest(String testEmail, boolean expectedResult) {
        // TODO Auto-generated constructor stub
        this.testEmail = testEmail;
        this.expectedResult = expectedResult;
    }
    @Before
    public void initialize()
    {
        UserRegistration user =new UserRegistration();
    }

    @Parameterized.Parameters
    public static Collection input()
    {
        return Arrays.asList(new Object[][] {
                {"abc@yahoo.com", true},{"abc-100@yahoo.com", true},{"abc.100@yahoo.com", true},{"abc111@abc.com", true}
                ,{"abc-100@abc.net", true},{"abc.100@abc.com.au", true},{"abc@1.com", true},{"abc@gmail.com.com", true},
                {"abc+100@gmail.com", true},{"abc", false},{"abc@.com.my", false},{"abc123@gmail.a", false},{"abc123@.com", false},{"abc123@.com.com", false},
                {".abc@abc.com", false},{"abc()*@gmail.com", false},{"abc@%*.com", false},{"abc..2002@gmail.com", false},
                {"abc.@gmail.com", false},{"abc@abc@gmail.com", false}
        });
    }

    @Test
    public void testUserRegistrationTest() {
        assertEquals(expectedResult,UserRegistration.validateEmail(testEmail));
    }

}