package br.com.testeunitarios;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.when;


@ExtendWith(MockitoExtension.class)
class MockingTest {

    @Mock
    User user;


    @Test
    @DisplayName("Permissão atribuída com sucesso")
    void assignPermissions() {
        Mocking mocking = new Mocking();
        mocking.setUser(user);
        when(user.getRole()).thenReturn("admin");
        when(user.getUsername()).thenReturn("kunal");

        Assertions.assertEquals(1, mocking.assignPermission());




    }

}
