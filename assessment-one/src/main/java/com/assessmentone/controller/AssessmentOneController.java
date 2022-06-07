package com.assessmentone.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.assessmentone.model.ErrorResponse;

@RestController
@RequestMapping("/api")
public class AssessmentOneController {

	@GetMapping("/testExceptionHandling")
	public ErrorResponse checkException(@RequestParam String code) {
		ErrorResponse errorResponse = new ErrorResponse();
		if (code.equals("401")) {
			errorResponse.setErrorMessage("You are not authorized");
			return errorResponse;
		}else if(code.equals("404")) {
			errorResponse.setErrorMessage("resource not found");
			return errorResponse;
		}
		return errorResponse;
	}
}
