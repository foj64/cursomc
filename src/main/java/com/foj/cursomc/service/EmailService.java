package com.foj.cursomc.service;

import org.springframework.mail.SimpleMailMessage;

import com.foj.cursomc.domain.Pedido;

public interface EmailService {
	
	void sendOrderConfirmationEmail(Pedido obj);

	void sendEmail(SimpleMailMessage msg);

}
