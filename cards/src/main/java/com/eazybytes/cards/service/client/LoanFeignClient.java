package com.eazybytes.cards.service.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "loans") //eureka 환경에서의 서비스 이름
public interface LoanFeignClient {
    @GetMapping(value = "/api/getHostName", consumes = "application/json")
    public ResponseEntity<String> getLoanHostName();
}
