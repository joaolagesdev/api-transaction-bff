package com.payments.apitransactionsbff.rest;

import com.payments.apitransactionsbff.dto.RequestTransactionDto;
import com.payments.apitransactionsbff.dto.TransactionDto;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/transaction")
public class TransactionController {

    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public Mono<TransactionDto> sendTransaction(@RequestBody RequestTransactionDto requestTransactionDto) {
        return Mono.empty();
    }

    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public Mono<TransactionDto> getTransaction(@PathVariable("id") String uuid) {
        return Mono.empty();
    }

    @DeleteMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public Mono<TransactionDto> removeTransaction(@PathVariable("id") String uuid) {
        return Mono.empty();
    }

    @PatchMapping(value = "{id}/approve")
    public Mono<TransactionDto> approveTransaction(@PathVariable("id") String uuid) {
        return Mono.empty();
    }
}
