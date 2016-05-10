@Grab("thymeleaf-spring4")

@Controller
class MyBootApp {

	@RequestMapping(value="/",method=RequestMethod.GET)
	@ResponseBody
	def top(ModelAndView mv) {
		mv.setViewName("index")
		mv.addObject("title", "Hello!");
		mv.addObject("msg", "please type any wordÅc");
		mv.addObject("val", "");
	}

	@RequestMapping(value="/",method=RequestMethod.POST)
	@ResponseBody
	def posted(@RequestParam("txt1")String txt1,
			ModelAndView mv) {
		mv.setViewName("index")
		mv.addObject("title", "Hello!");
		mv.addObject("msg", "you typed: " + txt1);
		mv.addObject("val", txt1);		
	}
}