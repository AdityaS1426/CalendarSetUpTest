@Entity
@Table(name = "Events")
public class Events {
    @Id
    Long id;
    @Column(name = "TITLE")
    String title;

    @Column(name = "DESCRIPTION")
    String description;
    
    // getters & setters
}
