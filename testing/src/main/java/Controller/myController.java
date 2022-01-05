package Controller;


import com.testcase.testing.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class myController {

    @Autowired
    @Qualifier("student1")
    private Student Student;

    @RequestMapping(value = "/home",method= RequestMethod.GET)
    @ResponseBody
    public Student home(){
        System.out.println("this is home method");
        this.Student.setName("Baburao");
        return this.Student;
    }
}
