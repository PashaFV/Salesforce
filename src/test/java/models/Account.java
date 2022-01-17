package models;

import lombok.*;

@AllArgsConstructor
@Getter
@Setter
@Data
@Builder

public class Account {
    String accountName;
    String webSite;
    String type;
    String phone;
    String employees;
    String industry;
    String description;
    String billingStreet;
    String shippingStreet;

}
