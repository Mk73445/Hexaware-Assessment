package com.java.assessment_4.controller;

import javax.validation.Valid;

import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.java.assessment_4.model.Input;
import com.java.assessment_4.model.OutPut;

@RestController
@RequestMapping("/api")
public class AssessmentFourController {

	@PostMapping("/validate")
	public OutPut inputValidator(@Valid @RequestBody Input inputData, Errors errors) {
		OutPut outPut = new OutPut();
		String[] error = new String[0];
		if (!errors.hasErrors()) {
			outPut.setStatus("VALID");
			outPut.setErrors(error);
		} else {
			outPut.setStatus("ERROR");
			error = new String[errors.getAllErrors().size()];
			for (int i = 0; i < errors.getAllErrors().size(); i++) {
				error[i] = errors.getFieldError().getDefaultMessage().toString();
			}
			outPut.setErrors(error);
		}

		return outPut;
	}

}
