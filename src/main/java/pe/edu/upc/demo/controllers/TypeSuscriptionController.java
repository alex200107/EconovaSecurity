package pe.edu.upc.demo.controllers;

import java.util.Map;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import pe.edu.upc.demo.entities.TypeSuscription;
import pe.edu.upc.demo.serviceinterface.ITypeSuscriptionService;

@Controller
@RequestMapping("/typesuscription")
public class TypeSuscriptionController {
	@Autowired
	private ITypeSuscriptionService tyService;

	@GetMapping("/new")
	public String newTypeSuscription(Model model) {
		model.addAttribute("t", new TypeSuscription());
		return "typesuscription/frmRegister";
	}

	@PostMapping("/save")
	public String saveTypeSuscription(@Valid TypeSuscription type, BindingResult binRes, Model model) {
		if (binRes.hasErrors()) {
			return "typesuscription/frmRegister";
		} else {
			tyService.Insert(type);
			model.addAttribute("mensaje", "Se registro correctamente!!");
			return "redirect:/typesuscription/new";
		}
	}

	@GetMapping("/list")
	public String listTypeSuscription(Model model) {
		try {
			model.addAttribute("listtypesuscription", tyService.list());
		} catch (Exception e) {
			model.addAttribute("error", e.getMessage());
		}

		return "/typesuscription/frmList";
	}

	@RequestMapping("/delete")
	public String deleteTypeSuscription(Map<String, Object> model, @RequestParam(value="id") Integer id) {
		try {
			if (id != null && id > 0) {
				tyService.Delete(id);
				model.put("listtypesuscription", tyService.list());
			}
		} catch (Exception e) {
			model.put("error", e.getMessage());
		}
		return "typesuscription/frmList";
	}
	
	@RequestMapping("/modificar/{id}")
	public String modificar(@PathVariable int id, Model model) {

		Optional<TypeSuscription> objPer = tyService.listarId(id);
		model.addAttribute("ty", objPer.get());
		return "typesuscription/frmUpdate";
	}

	@PostMapping("/actualizar")
	public String actualizar(TypeSuscription typ, Model model) {
		tyService.modificar(typ);
		return "redirect:/typesuscription/list";
	}

}
