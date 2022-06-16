package pe.edu.upc.demo.controllers;

import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import pe.edu.upc.demo.entities.Registro;
import pe.edu.upc.demo.serviceinterface.IRegistroService;

@Controller
@RequestMapping("/registro")
public class RegistroController {
	@Autowired
	private IRegistroService reService;

	@GetMapping("/new")
	public String newRegistro(Model model) {
		model.addAttribute("r", new Registro());
		return "registro/frmRegister";
	}

	@PostMapping("/save")
	public String saveRegistro(@Valid Registro re, BindingResult binRes, Model model) {
		if (binRes.hasErrors()) {
			return "registro/frmRegister";
		} else {
			reService.Insert(re);
			model.addAttribute("mensaje", "Se registro correctamente!!");
			return "redirect:/registro/new";
		}
	}

	@GetMapping("/list")
	public String listRegistro(Model model) {
		try {
			model.addAttribute("listRegistro", reService.list());
		} catch (Exception e) {
			model.addAttribute("error", e.getMessage());
		}

		return "/registro/frmList";
	}

	@RequestMapping("/delete")
	public String deleteRegistro(Map<String, Object> model, @RequestParam(value="id") Integer id) {
		try {
			if (id != null && id > 0) {
				reService.Delete(id);
				model.put("listRegistro", reService.list());
			}
		} catch (Exception e) {
			model.put("error", e.getMessage());
		}
		return "registro/frmList";
	}

}
