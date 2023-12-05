package my.home.package03.enums;

public enum Role {
    GUEST("guest"),
    CLIENT("client"),
    MODERATOR("moderator"),
    ADMIN("admin");
    private String typeName;
    Role(String typeName){
        this.typeName = typeName;
    }
}
