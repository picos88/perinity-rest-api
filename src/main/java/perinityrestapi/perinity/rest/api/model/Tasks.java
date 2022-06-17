package perinityrestapi.perinity.rest.api.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Data
@Entity

public class Tasks {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private Long idDepartment;

    private Long idPeople;

    private String title;

    private String description;

    private Date deadline;

    private Integer duration;

    private Boolean finished;
}
