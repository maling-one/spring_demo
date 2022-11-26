package one.maling.service.impl;

import one.maling.service.AccountService;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements AccountService {
    @Override
    public void transfer() {
        System.out.println("转账业务...");
    }
}
