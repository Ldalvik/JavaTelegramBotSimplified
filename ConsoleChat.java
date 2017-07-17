public static void chat() {
        for (int i = 0; i < 999; i++) {
            try {
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                String msg = br.readLine();

                if (msg.startsWith("file//")) {

                        String file = delete_to(msg, "file//");
                        sendImage(file, "@diceyfed");

                    } else {

                        sendConsole("@diceyfed", msg);
                        System.out.println("You: " + msg + "\n--------------------------");

                    }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

 public static void sendImage(String filePath, Long chatId) {
        SendPhoto photo = new SendPhoto()
                .setChatId(chatId)
                .setNewPhoto(new java.io.File(filePath));
        try {
            rf.sendPhoto(photo);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }
//static methods from setup.utils;
public static String removeTillWord(String input, String word) {
        return input.substring(input.indexOf(word));
    }

    public static String replace(String input, String word, String replace) {
        return input.replace(word, replace);
    }

    public static String delete_to(String msg, String trim){
        String trimStart = removeTillWord(msg, trim);
        String trimEnd = replace(trimStart, trim, "");
        return trimEnd;
    }
