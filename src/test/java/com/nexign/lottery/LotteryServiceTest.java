package com.nexign.lottery;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

@SpringBootTest
@AutoConfigureMockMvc
public class LotteryServiceTest {
    @Autowired
    private MockMvc mockMvc;

    @Test
    private void v1LotteryParticipantPost_check_saving_to_db_smoke() {
        // TODO
    }

    @Test
    public void v1LotteryParticipantGet_nobody_smoke() {
        // TODO
    }

    @Test
    public void v1LotteryParticipantGet_one_participant_smoke() {
        // TODO
    }

    @Test
    public void v1LotteryParticipantGet_participants_smoke() {
        // TODO
    }

    @Test
    public void v1LotteryStart_lower_than_2_participants_smoke() {
        // TODO
    }

    @Test
    public void v1LotteryStart_2_participants_smoke() {
        // TODO
    }

    @Test
    public void v1LotteryStart_greater_than_two_participants_smoke() {
        // TODO
    }

    @Test
    public void v1LotteryStart_xd_smoke() {
        // TODO
    }

    @Test
    public void v1LotteryWinners_xd_smoke() {
        // TODO
    }
}
