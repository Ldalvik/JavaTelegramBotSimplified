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
