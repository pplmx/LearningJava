package individual.cy.learn.pojo;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.math.BigDecimal;

/**
 * @author mystic
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class Goods extends Base {
    private BigDecimal price;
}
