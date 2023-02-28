package com.client.ws.rasmooplus.dto;

import java.time.LocalDate;

import org.hibernate.validator.constraints.br.CPF;

import com.client.ws.rasmooplus.model.SubscriptionType;
import com.client.ws.rasmooplus.model.UserType;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserDto {

    private long id;

    @NotBlank(message = "Valor não pode ser nulo ou vazio")
    @Size(min = 6, message = "Valor mínimo igual a 6 caracteres")
    private String name;

    @Email(message = "Valor deve ser um e-mail válido")
    private String email;

    @Size(min = 11, message = "Valor mínimo igual a 11 digitos")
    private String phone;

    @CPF(message = "Valor deve ser um CPF válido")
    private String cpf;

    private LocalDate dtSubscription = LocalDate.now();

    private LocalDate dtExpiration = LocalDate.now();

    @NotNull
    private Long userTypeId;

    private Long subscriptionTypeId;
    
}
