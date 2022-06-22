package at.technikum.datee;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class DateeContoller {



    @GetMapping("/date")
    public static void main(String[] args) {

            Date date = new Date();


            System.out.println(date);
        }
    }

