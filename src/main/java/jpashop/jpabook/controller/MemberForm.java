package jpashop.jpabook.controller;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;

@Getter @Setter
public class MemberForm {

    @NotNull(message = "Name may not be empty.")
    String name;
    @NotNull
    String city;
    String street;
    String zipcode;
}
