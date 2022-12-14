package com.expensemanagementsystem.repository.enitity;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User {
    private int id;
    private String name;
    private String role;
    private String email;
}
