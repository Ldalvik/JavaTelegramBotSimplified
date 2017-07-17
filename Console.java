public static void console() {
        for (int i = 0; i < 999; i++) {
            try {
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                System.out.print("Message: ");
                String msg = br.readLine();
                System.out.print("Chat id: ");
                String chat = br.readLine();
                System.out.println("Sending \"" + msg + "\" to \"@" + chat + "\"...");
                sendConsole("@" + chat, msg);
                System.out.println("Message sent succesfully!\n----------------------------------");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    
    public static void sendConsole(String chat_id, String msg) {
        SendMessage message = new SendMessage()
                .setChatId(chat_id)
                .setText(msg);
        try {
            rf.sendMessage(message);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }
    
    
    
