package br.com.sicredi.simulacao;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.gcbrandao.bookingvalidatorrest.model.BookingInfo;
import com.gcbrandao.bookingvalidatorrest.model.BookingReturn;
import com.gcbrandao.bookingvalidatorrest.service.BookingService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import java.time.DayOfWeek;
import java.time.LocalDate;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@SpringBootTest
@AutoConfigureMockMvc

class BookingValidatorRestApplicationTests {
    @Autowired
    private MockMvc mockMvc;
    @Autowired
    private ObjectMapper objectMapper;
    @Autowired
    private BookingService service;

    public class Application {

        public static void main(String[] args) {
            SpringApplication.run(Application.class, args);
        }
    }
}