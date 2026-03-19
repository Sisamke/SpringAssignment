
    import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;

    @RestController
    public class CourseController {

        @GetMapping("/courses")
        public Map<String, List<String>> getCourses(){

            Map<String, List<String>> courses = new HashMap<>();

            courses.put("Foundation Courses",
                    Arrays.asList("Introduction to Programming",
                            "Computer Literacy"));

            courses.put("Undergraduate Courses",
                    Arrays.asList("Data Structures",
                            "Operating Systems",
                            "Database Systems",
                            "Computer Networks",
                            "Software Engineering"));

            courses.put("Honours Courses",
                    Arrays.asList("Advanced Algorithms",
                            "Distributed Systems",
                            "Artificial Intelligence",
                            "Machine Learning"));

            return courses;
        }
    }

