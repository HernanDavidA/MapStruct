package com.mapStructure.MapStructureWorkshop.domain.entities;

import java.util.Set;

import com.mapStructure.MapStructureWorkshop.utils.enums.Rol;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity(name = "users")
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String userId;
    @Column(nullable = false, length = 100)
    private String username;
    @Column(name = "user_password", nullable = false, length = 100)
    private String password;
    @Column(name = "user_email", nullable = false, length = 100)
    private String email;
    @Column(name = "user_full_name", nullable = false, length = 100)
    private String fullName;
    @Enumerated(EnumType.STRING)
    @Column(name = "user_role", nullable = false, length = 20)
    private Rol role;
    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = false, fetch = FetchType.LAZY)
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Set<Reservation> reservations;

    @OneToMany(mappedBy = "user", fetch = FetchType.LAZY)
    private Set<LoanEntity> loan;
}
