package mate.academy.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity // 1. Mówimy Hibernate: "Zrób z tej klasy tabelę w bazie danych"
@Table(name = "cinema_halls") // 2. Opcjonalne: Ustalamy własną nazwę tabeli
public class CinemaHall {

    @Id // 3. To pole będzie kluczem głównym (unikalnym identyfikatorem)
    @GeneratedValue(strategy = GenerationType.IDENTITY) // 4. Baza danych sama będzie nadawać numery ID (1, 2, 3...)
    private Long id;

    private int capacity; // Pojemność sali (ile osób pomieści)

    private String description; // Opis sali (np. "Sala IMAX", "Złota sala")

    // 5. Hibernate WYMAGA pustego konstruktora, żeby mógł stworzyć obiekt
    public CinemaHall() {
    }

    // 6. Gettery i Settery (używane przez Hibernate do odczytu i zapisu danych)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    // 7. ToString - przydaje się do testowania w Main, żeby widzieć co jest w środku
    @Override
    public String toString() {
        return "CinemaHall{" +
                "id=" + id +
                ", capacity=" + capacity +
                ", description='" + description + '\'' +
                '}';
    }
}
