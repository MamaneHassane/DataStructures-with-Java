package datastructures;

public class Table {
    int size;
    int[] values;

    // Constructor
    public Table(int size) {
        this.size = size;
        this.values = new int[size];
    }

    public void addValue(int value) {
        // Ajouter la valeur à la première position disponible
        for (int i = 0; i < values.length; i++) {
            if (values[i] == 0) {
                values[i] = value;
                break;
            }
        }
    }

    public void addListOfValues(int[] valuesToAdd) {
        // Ajouter une liste de valeurs à la table
        for (int value : valuesToAdd) {
            addValue(value);
        }
    }

    // Tasser les éléments à partir d'un index
    public void packDown(int index) {
        
    }

    // Pousser les éléments à partir d'un index
    public void packUp(int index, int numberOfPlaces) {
       
    }

    // Supprimer à partir d'un index (tasser)
    public void deleteAt(int index) {
        packDown(index);
    }

    // Supprimer toutes les occurrences d'une valeur spécifique de la table
    public void deleteByValue(int value) {
        for (int i = 0; i < values.length; i++) {
            if (values[i] == value) {
                packDown(i);
                i--; // Pour vérifier à nouveau la même position après le tassement
            }
        }
    }

    // Afficher tous les éléments de la table
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < this.size; i++) {
            result.append(values[i]);
            if (i < values.length - 1) {
                result.append(", ");
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        Table table = new Table(20);
        table.addListOfValues(new int[]{1, 2, 3, 4, -5});
        System.out.println(table);
    }
}
