public class MainRunner {

    public static void main(String[] args) {

        AppConfig appConfig = new AppConfig("instagram", "3.6v", " https://api.instagram.com/v1/users", "meta");
        appConfig.getAppName();
        appConfig.getVersion();
        appConfig.getApiBasedUrl();
        appConfig.getCompanyName();
    }
}
