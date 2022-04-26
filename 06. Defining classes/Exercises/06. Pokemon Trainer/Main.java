import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Map<String, Trainer> trainers = new LinkedHashMap<>();

        String [] commands = scanner.nextLine().split(" ");
        while (!commands[0].equals("Tournament")){
            String name = commands[0];
            String pokemonName = commands[1];
            String pokemonElement = commands[2];
            int hp = Integer.parseInt(commands[3]);

            Pokemon pokemon = new Pokemon(pokemonName,pokemonElement, hp);
            trainers.putIfAbsent(name, new Trainer());
            trainers.get(name).addPokemon(pokemon);




            commands = scanner.nextLine().split(" ");
        }

        String command = scanner.nextLine();
        while (!command.equals("End")){
            for (Map.Entry<String, Trainer> kvp : trainers.entrySet()) {
                if (kvp.getValue().pokemonCollectionSize() > 0) {
                    boolean havePokemon = false;
                    for (Pokemon pokemon : kvp.getValue().getPokemons()) {
                        if (pokemon.getElement().equals(command)) {
                            havePokemon = true;
                            kvp.getValue().setNumOfBadges();
                            break;
                        }
                    }
                    if (!havePokemon) {
                        kvp.getValue().missingPokemonPenalty();
                    }
                }

            }command = scanner.nextLine();
        }trainers.entrySet().stream()
                .sorted((b1, b2) -> Integer.compare(b2.getValue().getBadges(), b1.getValue().getBadges()))
                .forEach(t -> {
                    System.out.println(String.format("%s %s %s", t.getKey(),
                            t.getValue().getBadges(),
                            t.getValue().pokemonCollectionSize()));
                });
    }
    }

