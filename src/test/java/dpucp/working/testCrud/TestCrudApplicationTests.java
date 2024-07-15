package dpucp.working.testCrud;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;

import dpucp.working.testCrud.controller.UserController;
import dpucp.working.testCrud.models.User;
import dpucp.working.testCrud.service.UserService;

import java.util.List;
import java.util.Optional;
import java.util.logging.Logger;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.node.ObjectNode;

@SpringBootTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
@AutoConfigureMockMvc
public class TestCrudApplicationTests {

	/*@Autowired
    private UserService userService;
	@Autowired
    private UserController userController;
	
	private List<User> userList;
	
	private static final Logger logger = Logger.getLogger(TestCrudApplicationTests.class.getName());
	private static final ObjectMapper objectMapper = new ObjectMapper();
	
	
	@Autowired
    private MockMvc mockMvc;
	
	@Test
	public void testCrudOperations() throws Exception {
		objectMapper.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);

		User newUser = new User();
		newUser.setName("Test3");
		newUser.setEmail("test3@mail.com");
		newUser.setPassword("1234");
	   
		mockMvc.perform(MockMvcRequestBuilders.post("/api/users")
                .contentType(MediaType.APPLICATION_JSON)
                .content(objectMapper.writeValueAsString(newUser)))
                .andExpect(MockMvcResultMatchers.status().isCreated())
                .andDo(print());
	
        List<User> users = userService.findAll();
        assertTrue(users.size() > 0);
        
        Long userId = users.get(3).getId();

        mockMvc.perform(MockMvcRequestBuilders.get("/api/users/" + userId)
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andDo(print());
	}
	
	@Test
    public void getAllUsers_ReturnsListOfUsers() {
      
        List<User> result = userController.getAllUsers();
        
        logger.info(result.toString());
        
        assertTrue(result.size() > 0);
    }
	
	@Test
	public void getUserById_ReturnOneUser() {
        User userById = new User();
        userById.setName("Test User");
        userById.setPassword("1234");
        userById.setEmail("test11L@mail.com");
        
        User usersaved = userService.save(userById);
		
		ResponseEntity<User> userFindById = userController.getUserById(usersaved.getId());
		
		logger.info("Error: " + userFindById.toString());
		assertEquals(usersaved.getId(), userFindById.getBody().getId());

        ResponseEntity<Void> response = userController.deleteUser(userFindById.getBody().getId());
	}
	
	@Test
	public void patchUser_UpdatesUser() {

		User user = new User();
		user.setName("Test User");
		user.setPassword("1234");
		user.setEmail("test2L@mail.com");
		userService.save(user);
		final Long userId = user.getId();
		JsonNode updates = objectMapper.valueToTree(user);
		((ObjectNode) updates).put("name", "Updated Name");
		((ObjectNode) updates).put("password", "4321");
		((ObjectNode) updates).put("email", "updated2L@mail.com");
		ResponseEntity<User> response = userController.updateUserPartially(userId, updates);
		assertEquals(HttpStatus.NO_CONTENT, response.getStatusCode());
		Optional<User> updatedUser = userService.findById(userId);
		assertTrue(updatedUser.isPresent());
		assertEquals("Updated Name", updatedUser.get().getName());
		assertEquals("4321", updatedUser.get().getPassword());
		assertEquals("updated2L@mail.com", updatedUser.get().getEmail());

        userController.deleteUser(userId);

	}
	
	@Test
    public void updateUser_UpdatesUser() {
        User user = new User();
        user.setName("Initial User");
        user.setPassword("initialPassword");
        user.setEmail("initial@mail.com");
        userService.save(user);
        final Long userId = user.getId();

        User updatedUser = new User();
        updatedUser.setId(userId);
        updatedUser.setName("Updated User");
        updatedUser.setPassword("updatedPassword");
        updatedUser.setEmail("updated@mail.com");

        ResponseEntity<User> response = userController.updateUser(userId, updatedUser);
        assertEquals(HttpStatus.OK, response.getStatusCode());

        Optional<User> retrievedUser = userService.findById(userId);
        assertTrue(retrievedUser.isPresent());
        assertEquals("Updated User", retrievedUser.get().getName());
        assertEquals("updatedPassword", retrievedUser.get().getPassword());
        assertEquals("updated@mail.com", retrievedUser.get().getEmail());

        userController.deleteUser(userId);
    }

    @Test
    public void updateUser_UserNotFound() {
        final Long userId = 999L; 

        User updatedUser = new User();
        updatedUser.setId(userId);
        updatedUser.setName("Updated User");
        updatedUser.setPassword("updatedPassword");
        updatedUser.setEmail("updated@mail.com");

        ResponseEntity<User> response = userController.updateUser(userId, updatedUser);
        assertEquals(HttpStatus.NOT_FOUND, response.getStatusCode());
    }
    
	@Test
    public void deleteUser_UserExists_UserDeleted() {
        User user = new User();
        user.setName("Test User");
        user.setPassword("1234");
        user.setEmail("test2L@mail.com");

        User userToDelete = userService.save(user);
        final Long userId = userToDelete.getId();
        ResponseEntity<Void> response = userController.deleteUser(userId);

        
        assertEquals(HttpStatus.NO_CONTENT, response.getStatusCode());
        assertFalse(userService.findById(userId).isPresent());
    }*/
}
