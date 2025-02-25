package org.example.attestation.dto;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserDTOTest {

    @Test
    public void testGettersAndSetters() {
        UserDTO dto = new UserDTO();
        dto.setId(1L);
        dto.setUsername("john_doe");
        dto.setEmail("john.doe@example.com");
        dto.setPassword("password123");

        assertEquals(1L, dto.getId());
        assertEquals("john_doe", dto.getUsername());
        assertEquals("john.doe@example.com", dto.getEmail());
        assertEquals("password123", dto.getPassword());
    }

    @Test
    public void testAllArgsConstructor() {
        UserDTO dto = new UserDTO(1L, "john_doe", "john.doe@example.com", "password123");

        assertEquals(1L, dto.getId());
        assertEquals("john_doe", dto.getUsername());
        assertEquals("john.doe@example.com", dto.getEmail());
        assertEquals("password123", dto.getPassword());
    }


}