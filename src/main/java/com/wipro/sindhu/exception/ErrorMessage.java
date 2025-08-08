package com.wipro.sindhu.exception;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class ErrorMessage {

	private String message;
	private String status;
}