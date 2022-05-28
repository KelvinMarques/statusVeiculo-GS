package br.com.fiap.statusVeiculo.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.fiap.statusVeiculo.dto.Veiculo;
import br.com.fiap.statusVeiculo.service.VeiculoAuxiliaServico;


@Controller
public class statusVeiculoController {
	@GetMapping("/")
	public ModelAndView index(HttpServletRequest request) {
		ModelAndView model = new ModelAndView("statusVeiculo/index");
		model.addObject("Veiculo1", new Veiculo());
		return model;
	}

	@PostMapping("/resultado")
	public ModelAndView calcular(@ModelAttribute("veiculo") Veiculo veiculo) {
		ModelAndView model = new ModelAndView("statusVeiculo/resultado");
		String resultado = VeiculoAuxiliaServico.getStatusVeiculo(veiculo.getBateria(),veiculo.getGasolina(), veiculo.getLigaDesliga());
		model.addObject("veiculo", veiculo);
		model.addObject("resultado", resultado);
		return model;
		
	}
}
