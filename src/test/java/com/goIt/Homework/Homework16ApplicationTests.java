package com.goIt.Homework;

import com.goIt.Homework.config.WebSecurityConfig;
import com.goIt.Homework.controllers.NoteController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.redirectedUrl;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
class Homework16ApplicationTests {
	@Autowired
	private MockMvc mockMvc;

	@Test
	void testRedirectToList() throws Exception {
		mockMvc.perform(get("/note/list"))
				.andExpect(status().is3xxRedirection())
				.andExpect(redirectedUrl("http://localhost/login"));
	}

//	@Test
//	void testGetListAllEndpoint() throws Exception {
//		mockMvc.perform(MockMvcRequestBuilders.get("/note/list"))
//				.andExpect(MockMvcResultMatchers.status().isOk())
//				.andExpect(MockMvcResultMatchers.view().name("list"));
//	}
//
//	@Test
//	void testAddNoteEndpoint() throws Exception {
//		mockMvc.perform(MockMvcRequestBuilders.post("/note/add")
//						.param("title", "Test Title")
//						.param("content", "Test Content"))
//				.andExpect(MockMvcResultMatchers.status().is3xxRedirection())
//				.andExpect(MockMvcResultMatchers.redirectedUrl("/note/list"));
//	}
}

