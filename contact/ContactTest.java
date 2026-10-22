package contact;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class ContactTest {

    @Test
    void testValidContact() {
        Contact contact = new Contact(
                "1234567890",
                "Donnel",
                "Mann",
                "2025551234",
                "Washington DC");

        assertEquals("1234567890", contact.getContactId());
        assertEquals("Donnel", contact.getFirstName());
        assertEquals("Mann", contact.getLastName());
        assertEquals("2025551234", contact.getPhone());
        assertEquals("Washington DC", contact.getAddress());
    }

    @Test
    void testContactIdTooLong() {
        assertThrows(IllegalArgumentException.class, () ->
            new Contact("12345678901", "Donnel", "Mann",
                    "2025551234", "Washington DC"));
    }

    @Test
    void testContactIdNull() {
        assertThrows(IllegalArgumentException.class, () ->
            new Contact(null, "Donnel", "Mann",
                    "2025551234", "Washington DC"));
    }

    @Test
    void testFirstNameTooLong() {
        assertThrows(IllegalArgumentException.class, () ->
            new Contact("1", "Christopher", "Mann",
                    "2025551234", "Washington DC"));
    }

    @Test
    void testFirstNameNull() {
        assertThrows(IllegalArgumentException.class, () ->
            new Contact("1", null, "Mann",
                    "2025551234", "Washington DC"));
    }

    @Test
    void testLastNameTooLong() {
        assertThrows(IllegalArgumentException.class, () ->
            new Contact("1", "Donnel", "WashingtonDC",
                    "2025551234", "Washington DC"));
    }

    @Test
    void testLastNameNull() {
        assertThrows(IllegalArgumentException.class, () ->
            new Contact("1", "Donnel", null,
                    "2025551234", "Washington DC"));
    }

    @Test
    void testPhoneTooShort() {
        assertThrows(IllegalArgumentException.class, () ->
            new Contact("1", "Donnel", "Mann",
                    "202555123", "Washington DC"));
    }

    @Test
    void testPhoneTooLong() {
        assertThrows(IllegalArgumentException.class, () ->
            new Contact("1", "Donnel", "Mann",
                    "20255512345", "Washington DC"));
    }

    @Test
    void testPhoneContainsLetters() {
        assertThrows(IllegalArgumentException.class, () ->
            new Contact("1", "Donnel", "Mann",
                    "202555ABCD", "Washington DC"));
    }

    @Test
    void testPhoneNull() {
        assertThrows(IllegalArgumentException.class, () ->
            new Contact("1", "Donnel", "Mann",
                    null, "Washington DC"));
    }

    @Test
    void testAddressTooLong() {
        assertThrows(IllegalArgumentException.class, () ->
            new Contact("1", "Donnel", "Mann",
                    "2025551234",
                    "This address is definitely over thirty characters"));
    }

    @Test
    void testAddressNull() {
        assertThrows(IllegalArgumentException.class, () ->
            new Contact("1", "Donnel", "Mann",
                    "2025551234", null));
    }
}
