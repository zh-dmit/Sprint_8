import org.example.Account;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class AccountTest {

    private String name;
    private Boolean rezult;

    public AccountTest(String name, boolean rezult) {
        this.name = name;
        this.rezult = rezult;
    }

    @Parameterized.Parameters
    public static Object[][] data() {
        return new Object[][] {
                {" Тимоти Шаламе", false},
                {"Тимоти  Шаламе", false},
                {"Тимоти Шаламе ", false},
                {"ТимотиШаламе", false},
                {" ТимотиШаламе", false},
                {"ТимотиШаламе ", false},
                {"Тимоти Шаламе", true},
                {"Тимоти ШаламеТимотиШаламе", false},
                {"Ти", false}
        };
    }

    @Test
    public void checkNameToEmbossTest() {
        Account account = new Account(name);
        assertEquals(rezult, account.checkNameToEmboss());
    }

}
