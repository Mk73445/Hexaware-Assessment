package com.java.assessment_3.controller;



import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.java.assessment_3.model.ErrorResponse;

@RestController
@RequestMapping("/api")
public class ErrorResponseController {
	
	
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
