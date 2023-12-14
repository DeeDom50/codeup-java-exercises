import java.util.Random;

public class ServerNameGenerator {
    public static void main(String[] args) {
        String[] adjectives = {"dedicated", "efficient", "powerful", "dynamic", "creative", "vibrant", "robust", "stellar", "resilient", "innovative"};
        String[] nouns = {"photon", "algorithm", "network", "server", "datacenter", "application", "database", "framework", "interface", "platform"};

        String serverName = generateServerName(adjectives, nouns);
        System.out.println("Here is your server name:\n" + serverName);
    }

    // Method to generate a random server name
    public static String generateServerName(String[] adjectives, String[] nouns) {
        Random random = new Random();
        String adjective = adjectives[random.nextInt(adjectives.length)];
        String noun = nouns[random.nextInt(nouns.length)];
        return adjective + "-" + noun;
    }
}

