package me.travisgray.firstspringapp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import javax.swing.text.DateFormatter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;


@Controller
public class MainController {
    @RequestMapping("/")


    //    When someone visits localhost8080 on this route return index page you can name reroutes here
public String homepage(Model model){
        //Get the current time
        LocalDateTime rightNow= LocalDateTime.now();

        //Set up formatters so that you can use them later
        DateTimeFormatter dTF = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter shortMonthFormat = DateTimeFormatter.ofPattern("dd MMM yyyy");
        DateTimeFormatter E = DateTimeFormatter.ofPattern("EEEE");

        //Time formatter (time only)
        DateTimeFormatter hr24 = DateTimeFormatter.ofPattern("kk:m");

        model.addAttribute("myvar1","Today is: "+rightNow.format(dTF));
        model.addAttribute("myvar1","Current Day: "+rightNow.format(E));
        return "intro";

}
}
