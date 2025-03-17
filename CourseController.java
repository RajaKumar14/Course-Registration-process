package com.example.Course.Registration.controller;

import com.example.Course.Registration.model.Course;
import com.example.Course.Registration.model.CourseRegistry;
import com.example.Course.Registration.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins  = "http://localhost:5500")
public class CourseController {
    @Autowired
    CourseService courseService;
    @GetMapping("courses")
    public List<Course> availaibleCourses(){
    return courseService.availableCourses();
    }
  @GetMapping("courses/enrolled")
    public List<CourseRegistry> enrolledStudents(){
       return courseService.enrolledStudents();
  }
  @PostMapping("/courses/register")
    public String enrollCourses(@RequestParam("name") String name,
                                @RequestParam("emailid") String emailid,
                                @RequestParam("courseName") String courseName){
        courseService.enrollCourses(name,emailid,courseName);
        return "congratulations! "+name+" enrollment sucessful for"+courseName;


  }
}
