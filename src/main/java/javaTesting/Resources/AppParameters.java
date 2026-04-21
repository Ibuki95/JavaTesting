package javaTesting.Resources;

public class AppParameters {
    // afegir-hi objectes connexio de Base de Dades

    public static final String DOMAIN = "127.0.0.1";
    public static final String PORT = "80";
    // public static final Object BD_CON = new ClasseConnexioBBDD();
    // public static Object MESSAGES_TRANSLATIONS;

    // Implementar SINGELTON PATTERN
    private static AppParameters instance;

    private AppParameters(){

    }

    private void initApp(){
        // codi necessari per a la inicialització de l'App.
    }

    public void resetApp(){
        // codi per reconfigurar l'App.
    }

    public AppParameters getInstance(){
        if (instance == null){
            instance = new AppParameters();
        }

        return instance;
    }

    public static String deployedURL(){
        return "https://" + DOMAIN + ":" + PORT;
    }
}
