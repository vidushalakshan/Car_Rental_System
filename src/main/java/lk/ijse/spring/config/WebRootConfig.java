package lk.ijse.spring.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author Helitha Sri
 * @created 6/22/2022 - 1:28 PM
 * @project Spring POS
 */

@Configuration
@Import(JPAConfig.class)
public class WebRootConfig {

}
