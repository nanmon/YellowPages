public class Main {
    private static final String[] ARGS1 = { "-gui",
            "Register:" + DFRegisterAgent.class.getName() + "(my-forecast);"
    };

    private static final String[] ARGS2 = { "-container",
             "Search:" + DFSearchAgent.class.getName() + ";"
    };

    private static final String[] ARGS3 = { "-container",
            "Subscribe:" + DFSubscribeAgent.class.getName() + "(forecast-1);"

    };

    public static void main(String[] args) {
        jade.Boot.main(ARGS1); //new String[] {"-gui", "nombre:clase(args)"}
        jade.Boot.main(ARGS2);
        jade.Boot.main(ARGS3);
    }
}