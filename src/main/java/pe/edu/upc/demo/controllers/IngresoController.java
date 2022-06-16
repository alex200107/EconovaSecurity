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


import pe.edu.upc.demo.entities.Ingreso;
import pe.edu.upc.demo.serviceinterface.IingresoService;

@Controller
@RequestMapping("/ingreso")
public class IngresoController {
	@Autowired
	private IingresoService inService;

	@GetMapping("/new")
	public String newIngreso(Model model) {
		model.addAttribute("i", new Ingreso());
		return "ingreso/frmRegister";
	}

	@PostMapping("/save")
	public String saveIngreso(@Valid Ingreso in, BindingResult binRes, Model model) {
		if (binRes.hasErrors()) {
			return "ingreso/frmRegister";
		} else {
			inService.Insert(in);
			model.addAttribute("mensaje", "Se registro correctamente!!");
			return "redirect:/ingreso/new";
		}
	}

	@GetMapping("/list")
	public String listIngreso(Model model) {
		try {
			model.addAttribute("listIngreso", inService.list());
		} catch (Exception e) {
			model.addAttribute("error", e.getMessage());
		}

		return "/ingreso/frmList";
	}

	@RequestMapping("/delete")
	public String deleteIngreso(Map<String, Object> model, @RequestParam(value="id") Integer id) {
		try {
			if (id != null && id > 0) {
				inService.Delete(id);
				model.put("listIngreso", inService.list());
			}
		} catch (Exception e) {
			model.put("error", e.getMessage());
		}
		return "ingreso/frmList";
	}

}
