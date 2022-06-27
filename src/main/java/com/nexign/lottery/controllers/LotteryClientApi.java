package com.nexign.lottery.controllers;

import com.nexign.lottery.models.ParticipantDto;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.ThreadLocalRandom;

@RestController
public class LotteryClientApi {

    @PostMapping(
            path = "/lottery/participant",
            consumes = MediaType.APPLICATION_JSON_VALUE
    )
    public void v1LotteryParticipantPost(@RequestBody ParticipantDto participantDto) {
        // Сервис принимает на вход Post-запрос /lottery/participant,
        // тело запроса в виде json должно иметь поля (имя, возраст, город) участника;
        // Сервис сохраняет участника в БД
        // TODO
    }

    @GetMapping(
            path = "/lottery/participant",
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public @ResponseBody String v1LotteryParticipantGet() {
        // С помощью Get запроса /lottery/participant пользователь должен
        // получить список всех участников, которые есть в БД в виде json
        // TODO
        return "";
    }

    @GetMapping(path = "/lottery/start")
    public void v1LotteryStart() {
        // Ходим в бд проверять количество участников...
        int participants = 0;

        if (participants < 2) {
            throw new RuntimeException(); // TO-DO
        }

        int prizeAmount = ThreadLocalRandom.current().nextInt(2, 1000 + 1);
        int randomParticipant = ThreadLocalRandom.current().nextInt(participants);

        // Селектим участника...
        ParticipantDto winner = new ParticipantDto("Kirill", 20, "Saint Petersburg");

        System.out.println(winner.toString());

        // очищаем базу данных...
    }

    @GetMapping(path = "/lottery/winners")
    public void v1LotteryWinners() {
        // Задание повышенной сложности - сделать!
    }
}
