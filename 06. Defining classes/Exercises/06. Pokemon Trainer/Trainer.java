import java.util.LinkedList;
import java.util.List;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

public class Trainer {
    private int badges;
    private List<Pokemon> pokemons;

    public Trainer() {
        this.badges = 0;
        this.pokemons = new LinkedList<>();
    }



    public int getBadges() {
        return badges;
    }

    public void setNumOfBadges() {
        this.badges++;
    }

    public List<Pokemon> getPokemons() {
        return pokemons;
    }

    public void setPokemons(List<Pokemon> pokemons) {
        this.pokemons = pokemons;
    }
    public void addPokemon(Pokemon pokemon) {
        this.pokemons.add(pokemon);
    }
    public int pokemonCollectionSize() {
        return this.pokemons.size();
    }
    private UnaryOperator<Pokemon> damagePokemon = pokemon ->
            new Pokemon(pokemon.getName(), pokemon.getElement(), pokemon.getHealth() - 10);

    public void missingPokemonPenalty() {
        this.pokemons = this.pokemons
                .stream()
                .map(damagePokemon)
                .filter(pokemon -> pokemon.getHealth() > 0)
                .collect(Collectors.toList());
    }
}
