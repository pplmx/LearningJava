package individual.cy.learn.pojo;

import com.google.common.base.Objects;

/**
 * @author mystic
 */
public class User {
    private int id;
    private String name;
    private String email;

    @Override
    public int hashCode() {
        return Objects.hashCode(id, name, email);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof User)) {
            return false;
        }
        User user = (User) o;
        return id == user.id &&
            Objects.equal(name, user.name) &&
            Objects.equal(email, user.email);
    }
}
