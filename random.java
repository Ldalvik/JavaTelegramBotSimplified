 public static void random(Update update) {
        String msg = msgText(update);

        if (msg.startsWith("/rand")) {
            String ran = String.valueOf((int) (Math.random() * (99999999 - 11111111) + 11111111));
            int[] eight = {11111111, 22222222, 33333333, 44444444, 55555555, 66666666, 77777777, 88888888, 99999999};
            int[] seven = {1111111, 2222222, 3333333, 4444444, 5555555, 6666666, 7777777, 8888888, 9999999};
            int[] six = {111111, 222222, 333333, 444444, 555555, 666666, 777777, 888888, 999999};
            int[] five = {11111, 22222, 33333, 44444, 55555, 66666, 77777, 88888, 99999};
            int[] four = {1111, 2222, 3333, 4444, 5555, 6666, 7777, 8888, 9999};
            int[] three = {111, 222, 333, 444, 555, 666, 777, 888, 999};
            int[] two = {11, 22, 33, 44, 44, 66, 77, 88, 99};
            int[] one = {1, 2, 3, 4, 5, 6, 7, 8, 9};

            for (int i = 0; i < 9; i++) {
                String v8 = String.valueOf(eight[i]);
                if (ran.endsWith(v8)) {
                    send(update, ran+"\nHOLY FUCKIN OCTUPLESSSSS");
                } else {
                    String v7 = String.valueOf(seven[i]);
                    if (ran.endsWith(v7)) {
                        send(update, ran+"\nOH MY YA GOT LUCKY FUCKIN SEVENSSS");
                    } else {
                        String v6 = String.valueOf(six[i]);
                        if (ran.endsWith(v6)) {
                            send(update, ran+"\nAYY yer gotta sextuples");
                        } else {
                            String v5 = String.valueOf(five[i]);
                            if (ran.endsWith(v5)) {
                                send(update, ran+"\nquintiples haha gg man");
                            } else {
                                String v4 = String.valueOf(four[i]);
                                if (ran.endsWith(v4)) {
                                    send(update, ran+"\nnice you got quaaadsss");
                                } else {
                                    String v3 = String.valueOf(three[i]);
                                    if (ran.endsWith(v3)) {
                                        send(update, ran+"\nooooh you got triples");
                                    } else {
                                        String v2 = String.valueOf(two[i]);
                                        if (ran.endsWith(v2)) {
                                            send(update, ran+"\nyou got doubles!");
                                        } else {
                                            String v1 = String.valueOf(one[i]);
                                            if (ran.endsWith(v1)) {
                                                send(update, ran+"\nyou got singles you are baad");
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
