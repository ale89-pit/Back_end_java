package com.GestioneDispositivi.Project.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.HashSet;
import java.util.List;
import java.util.Set;




@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "users", uniqueConstraints = { @UniqueConstraint(columnNames = "username"), //uniqueConstraints dichiara le colonne che dovranno avere i campi "unique = true"
		@UniqueConstraint(columnNames = "email") })
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	@Column(name = "name", nullable = false )
	private String name;
	@Column(name = "last_name", nullable = false )
	private String lastName;
    @Column(nullable = false, unique = true)
    private String username;
    @Column(nullable = false, unique = true)
    private String email;
    @Column(nullable = false)
    private String password;

	
	@OneToMany(cascade = CascadeType.ALL)
	private List<Device> deviceAssegnati;
    
    
    // Il caricamento EAGER delle raccolte significa che vengono recuperate 
    // completamente nel momento in cui viene recuperato il loro genitore
    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.PERSIST)
    @JoinTable(name = "users_roles",
            joinColumns = @JoinColumn(name = "user_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "role_id", referencedColumnName = "id")
    )
    private Set<Role> roles = new HashSet<>();
}
