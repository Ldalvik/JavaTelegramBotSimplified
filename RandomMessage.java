   public static void RandomMessages(Update update) {
        String msg = msgText(update);
        long chat_id = chat_id(update);
        String output = url("https://pastebin.com/raw/thelink");
        String[] word = output.split("---");
        int s = new Random().nextInt(word.length);
        String array = word[s];
        if (msg.startsWith("/msg")) {
            SendMessage message = new SendMessage()
                    .setChatId(chat_id)
                    .setText(array);

            try {
                rf.sendMessage(message);
            } catch (TelegramApiException e) {
                error(update, String.valueOf(e));
            }
        }
    }

//get the text from the raw pastebin
public static String url(String url) {
        try {
            URL urlObj = new URL(url);
            URLConnection con = urlObj.openConnection();
            con.connect();
            BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
            String inputLine;
            final StringBuilder response = new StringBuilder();
            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();
            return response.toString();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
