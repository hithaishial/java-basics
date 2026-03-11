public class AppConfig {

    private final String appName;
    private final String version;
    private final String apiBasedUrl;
    private final String companyName;

    public AppConfig(String appName, String version, String apiBasedUrl, String companyName) {
        this.appName = appName;
        this.version = version;
        this.apiBasedUrl = apiBasedUrl;
        this.companyName = companyName;
    }

    public String getAppName() {
        return appName;
    }

    public String getVersion() {
        return version;
    }

    public String getApiBasedUrl() {
        return apiBasedUrl;
    }

    public String getCompanyName() {
        return companyName;


        
    }
}
