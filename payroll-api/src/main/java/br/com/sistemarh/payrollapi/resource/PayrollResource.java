package br.com.sistemarh.payrollapi.resource;

import br.com.sistemarh.payrollapi.domain.Payroll;
import br.com.sistemarh.payrollapi.domain.User;
import br.com.sistemarh.payrollapi.feignClients.UserFeign;
import br.com.sistemarh.payrollapi.services.PayrollService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping(value = "/api/payments")
public class PayrollResource {

    private final PayrollService service;

    @GetMapping(value = "/{workerId}")
    public ResponseEntity<Payroll> getPayment(@PathVariable Long workerId, @RequestBody Payroll payment){
        return ResponseEntity.ok().body(service.getPayment(workerId,payment));

    }
}
