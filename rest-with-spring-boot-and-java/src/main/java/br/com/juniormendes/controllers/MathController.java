package br.com.juniormendes.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.juniormendes.exceptions.UnsupportedMathOperationException;
import br.com.juniormendes.math.SimpleMath;
import br.com.juniormendes.utils.Converters;

@RestController
public class MathController {
	
	private SimpleMath simpleMath = new SimpleMath();

	@RequestMapping(value = "/sum/{numberOne}/{numberTwo}", method = RequestMethod.GET)
	public Double sum(@PathVariable(value = "numberOne") String numberOne,
			@PathVariable(value = "numberTwo") String numberTwo) throws Exception

	{
		if(!Converters.isNumeric(numberOne) || !Converters.isNumeric(numberTwo)) {
			throw new UnsupportedMathOperationException("Por favor informe um valor numérico");
		}
		return simpleMath.sum(Converters.convertToDouble (numberOne), Converters.convertToDouble(numberTwo));

	}
	
	@RequestMapping(value = "/subtrair/{numUm}/{numDois}", method= RequestMethod.GET)
	public Double subtrair(@PathVariable (value="numUm") String numUm,
			@PathVariable (value= "numDois") String numDois)throws Exception {
		
		if(!Converters.isNumeric(numUm) || !Converters.isNumeric(numDois)) {
			throw new UnsupportedMathOperationException("Por favor informe um valor numérico");
		}
		return simpleMath.subtrair(Converters.convertToDouble (numUm), Converters.convertToDouble(numDois));
		
	}
	
	@RequestMapping(value = "/multiplicar/{numUm}/{numDois}", method= RequestMethod.GET)
	public Double multiplicar(@PathVariable (value="numUm") String numUm,
			@PathVariable (value= "numDois") String numDois)throws Exception {
		
		if(!Converters.isNumeric(numUm) || !Converters.isNumeric(numDois)) {
			throw new UnsupportedMathOperationException("Por favor informe um valor numérico");
		}
		return simpleMath.multiplicar(Converters.convertToDouble (numUm), Converters.convertToDouble(numDois));
		
	}
	
	@RequestMapping(value = "/dividir/{numUm}/{numDois}", method= RequestMethod.GET)
	public Double dividir(@PathVariable (value="numUm") String numUm,
			@PathVariable (value= "numDois") String numDois)throws Exception {
		
		if(!Converters.isNumeric(numUm) || !Converters.isNumeric(numDois)) {
			throw new UnsupportedMathOperationException("Por favor informe um valor numérico");
		}
		return simpleMath.dividir(Converters.convertToDouble (numUm), Converters.convertToDouble(numDois));
		
	}
	
	@RequestMapping(value = "/resto/{numUm}/{numDois}", method= RequestMethod.GET)
	public Double resto(@PathVariable (value="numUm") String numUm,
			@PathVariable (value= "numDois") String numDois)throws Exception {
		
		if(!Converters.isNumeric(numUm) || !Converters.isNumeric(numDois)) {
			throw new UnsupportedMathOperationException("Por favor informe um valor numérico");
		}
		return simpleMath.resto(Converters.convertToDouble (numUm), Converters.convertToDouble(numDois));
		
	}
	



}
