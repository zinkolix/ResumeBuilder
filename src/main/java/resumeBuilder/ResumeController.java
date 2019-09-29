package resumeBuilder;
/**
 * 
 */


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Ashwin
 *
 */
@Controller
public class ResumeController {

	@RequestMapping("/resume")
	public String resume(Model model) {
		model.addAttribute("resume", new ResumePojo());
		return "resume";
	}
	
	@PostMapping("/resume")
	public String resumeSubmit(@ModelAttribute ResumePojo resumePojo) {
		return "resumeBuild";
	}
}
