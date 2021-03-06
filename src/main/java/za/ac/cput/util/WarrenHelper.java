package za.ac.cput.util;

import org.apache.commons.validator.routines.EmailValidator;

import java.util.UUID;

/*Warren Jaftha(Leader) -219005303
WarrenHelper.java
27/03/2022
 */
public class WarrenHelper {
    public static boolean isNullorEmpty(String s)
    {
        return (s==null || s.equals("") || s.isEmpty()||s.equalsIgnoreCase("null"));
    }
    public static boolean isValidEmail(String customerEmail)
    {
        EmailValidator ev= EmailValidator.getInstance();
        return ev.isValid(customerEmail);
    }

    public static String workerId()
    {
        return UUID.randomUUID().toString();
    }
    public static String buyerId()
    {
        return UUID.randomUUID().toString();
    }
}

