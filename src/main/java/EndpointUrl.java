public enum EndpointUrl {
    CHARACTERS("/characters"), HOUSES("/houses");
    String path;

    EndpointUrl(String path) {
        this.path = path;
    }

    public String getPath() {
        return path;
    }

    public String addPath(String additionalPath) {
        return path + additionalPath;
    }
}
