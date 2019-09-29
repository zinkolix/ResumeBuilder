package resumeBuilder;
/**
 * 
 */

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author Ashwin
 *
 */
@Controller
public class ResumeController {

	@GetMapping("/resume")
	public ModelAndView resume() {
		ModelAndView model = new ModelAndView();
		model.addObject("resume", new ResumePojo());
		return model;
	}

	@PostMapping("/resume")
	public ModelAndView resumeSubmit(ResumePojo resumePojo) {
		
		ModelAndView modelAndView = new ModelAndView("resumeBuild");
		modelAndView.addObject(resumePojo);

		return modelAndView;
	}
}
