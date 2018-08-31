package pl.coderslab.tweeter.entities;

import org.hibernate.validator.constraints.Email;
import org.springframework.security.access.method.P;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Objects;

@Entity
@Table(name = "tweets")
public class Tweet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(columnDefinition = "TEXT")
    private String body;

    @Column
    private LocalDateTime created;

    @ManyToOne
    private User user;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public LocalDateTime getCreated() {
        return created;
    }

    public void setCreated(LocalDateTime created) {
        this.created = created;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tweet tweet = (Tweet) o;
        return Objects.equals(id, tweet.id) &&
                Objects.equals(body, tweet.body) &&
                Objects.equals(created, tweet.created) &&
                Objects.equals(user, tweet.user);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, body, created, user);
    }

    @Override
    public String toString() {
        return "Tweet{" +
                "id=" + id +
                ", body='" + body + '\'' +
                ", created=" + created +
                '}';
    }
}
