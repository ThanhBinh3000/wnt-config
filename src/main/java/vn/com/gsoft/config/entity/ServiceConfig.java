package vn.com.gsoft.config.entity;

import jakarta.persistence.*;
import lombok.Data;


@Entity
@Table(name = "SERVICECONFIG", uniqueConstraints = {@UniqueConstraint(columnNames = {"application", "profile", "label", "key"})})
@Data
public class ServiceConfig {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String application;
    private String profile;
    private String label;
    @Column(name = "KEYCONFIG")
    private String key;
    private String value;
    private Boolean enable;
}
