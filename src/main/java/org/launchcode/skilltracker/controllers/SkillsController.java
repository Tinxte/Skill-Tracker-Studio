package org.launchcode.skilltracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class SkillsController {

    @GetMapping("skillstracker")
    @ResponseBody
    public String skillsTracker(@RequestParam String name) {
        return "<html>" +
                "<body>" +
                "<h1>{name}'s Skills Tracker</h1>" +
                "<ol>" +
                "<li>param1</li>" +
                "<li>param2</li>" +
                "<li>param3</li>" +
                "</ol>" +
                "</body>" +
                "</html>";
    }

    @GetMapping("skillsform")
    @ResponseBody
    public String skillsForm() {
        String html =
                "<html>" +
                        "<body>" +
                        "<form method = 'get' action = '/skillsTracker'>" +
                        "<div>" +
                            "<label>Your Name: " +
                            "<input type = 'text' name = 'name'/>" +
                            "</label>" +
                        "</div>" +

                        "<div>" +
                        "<label>Language Preference #1: " +
                        "<select name = 'language1'>" +
                        "<option value='1'>JavaScript</option>" +
                        "<option value='2'>Java</option>" +
                        "<option value='3'>Python</option>" +
                        "</select>" +
                        "</label>" +
                        "</div>" +

                        "<div>" +
                        "<label>Language Preference #2: " +
                        "<select name = 'language2'>" +
                        "<option value='1'>JavaScript</option>" +
                        "<option value='2'>Java</option>" +
                        "<option value='3'>Python</option>" +
                        "</select>" +
                        "</label>" +
                        "</div>" +

                        "<div>" +
                        "<label>Language Preference #3: " +
                        "<select name = 'language3'>" +
                        "<option value='1'>JavaScript</option>" +
                        "<option value='2'>Java</option>" +
                        "<option value='3'>Python</option>" +
                        "</select>" +
                        "</label>" +
                        "</div>" +

                        "<input type = 'submit' value = 'Submit!'>" +
                        "</form>" +
                        "</body>" +
                        "</html>";
        return html;
    }

}
