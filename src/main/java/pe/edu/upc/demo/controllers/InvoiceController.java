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

import pe.edu.upc.demo.entities.Invoice;
import pe.edu.upc.demo.serviceinterface.IinvoiceService;
import pe.edu.upc.demo.serviceinterface.IserviceService;

@Controller
@RequestMapping("/invoice")
public class InvoiceController {
	@Autowired
	private IinvoiceService invService;
	@Autowired
	private IserviceService serService;

	@GetMapping("/new")
	public String newInvoice(Model model) {
		model.addAttribute("in", new Invoice());
		model.addAttribute("listService",serService.list());
		return "invoice/frmRegister";
	}

	@PostMapping("/save")
	public String saveInvoice(@Valid Invoice inv, BindingResult binRes, Model model){
		if (binRes.hasErrors()) {
			return "invoice/frmRegister";
		} else {
			invService.Insert(inv);
			model.addAttribute("mensaje", "Se registro correctamente!!");
			return "redirect:/invoice/new";
		}
	}

	@GetMapping("/list")
	public String listInvoice(Model model) {
		try {
			model.addAttribute("listInvoice", invService.list());
		} catch (Exception e) {
			model.addAttribute("error", e.getMessage());
		}

		return "/invoice/frmList";
	}

	@RequestMapping("/delete")
	public String deleteInvoice(Map<String, Object> model, @RequestParam(value="id") Integer id) {
		try {
			if (id != null && id > 0) {
				invService.Delete(id);
				model.put("listInvoice", invService.list());
			}
		} catch (Exception e) {
			model.put("error", e.getMessage());
		}
		return "invoice/frmList";
	}
	
	@RequestMapping("/modificar/{id}")
	public String modificar(@PathVariable int id, Model model) {

		Optional<Invoice> objPer = invService.listarId(id);
		model.addAttribute("inv", objPer.get());
		return "invoice/frmUpdate";
	}

	@PostMapping("/actualizar")
	public String actualizar(Invoice inv, Model model) {
		invService.modificar(inv);
		return "redirect:/invoice/list";
	}

}
