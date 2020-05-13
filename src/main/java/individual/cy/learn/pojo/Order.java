package individual.cy.learn.pojo;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.Instant;

/**
 * @author mystic
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class Order extends Base {
    private Instant created;
    private Instant updated;
}
