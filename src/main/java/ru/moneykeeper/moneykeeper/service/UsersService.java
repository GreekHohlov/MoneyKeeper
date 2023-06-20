package ru.moneykeeper.moneykeeper.service;

import org.springframework.stereotype.Service;
import ru.moneykeeper.moneykeeper.repository.UsersRepository;

@Service
public class UsersService {
    private final UsersRepository usersRepository;

    public UsersService(UsersRepository usersRepository){
        this.usersRepository = usersRepository;
    }
}
