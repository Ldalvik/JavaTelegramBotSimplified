public static void summonAdmins(Update update) {
        String msg = msgText(update);
        Long chatid = chat_id(update);

        GetChatAdministrators adminList = new GetChatAdministrators().setChatId(chatid);
        if (msg.startsWith("/summon ")) {
            String summoned = removeTillWord(msg, " ");
            StringJoiner joiner = new StringJoiner(", @");
            try {
                for (int i = 0; i<rf.getChatAdministrators(adminList).size(); i++){
                    String adminIterator = rf.getChatAdministrators(adminList).listIterator(i).next().getUser().getUserName();
                    joiner.add(adminIterator);
                }
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
            String allAdmins = joiner.toString();
           send(update, "@"+allAdmins + ": " + summoned);
            }
        }
    }
