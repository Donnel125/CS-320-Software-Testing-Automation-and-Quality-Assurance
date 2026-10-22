package contact;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ContactServiceTest {

    private ContactService service;
    private Contact contact;

    @BeforeEach
    void setUp() {
        service = new ContactService();
        contact = new Contact(
                "1001",
                "Donnel",
                "Mann",
                "2025551234",
                "Washington DC");
    }

    @Test
    void testAddContact() {
        service.addContact(contact);

        assertEquals(contact, service.getContact("1001"));
    }

    @Test
    void testAddDuplicateContactId() {
        service.addContact(contact);

        Contact duplicate = new Contact(
                "1001",
                "John",
                "Smith",
                "2025555678",
                "Virginia");

        assertThrows(IllegalArgumentException.class, () ->
            service.addContact(duplicate));
    }

    @Test
    void testDeleteContact() {
        service.addContact(contact);
        service.deleteContact("1001");

        assertThrows(IllegalArgumentException.class, () ->
            service.getContact("1001"));
    }

    @Test
    void testUpdateFirstName() {
        service.addContact(contact);
        service.updateFirstName("1001", "John");

        assertEquals("John",
                service.getContact("1001").getFirstName());
    }

    @Test
    void testUpdateLastName() {
        service.addContact(contact);
        service.updateLastName("1001", "Smith");

        assertEquals("Smith",
                service.getContact("1001").getLastName());
    }

    @Test
    void testUpdatePhone() {
        service.addContact(contact);
        service.updatePhone("1001", "2025559999");

        assertEquals("2025559999",
                service.getContact("1001").getPhone());
    }

    @Test
    void testUpdateAddress() {
        service.addContact(contact);
        service.updateAddress("1001", "Alexandria VA");

        assertEquals("Alexandria VA",
                service.getContact("1001").getAddress());
    }

    @Test
    void testUpdateInvalidPhone() {
        service.addContact(contact);

        assertThrows(IllegalArgumentException.class, () ->
            service.updatePhone("1001", "12345"));
    }

    @Test
    void testUpdateMissingContact() {
        assertThrows(IllegalArgumentException.class, () ->
            service.updateFirstName("9999", "John"));
    }
}
