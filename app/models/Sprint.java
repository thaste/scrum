package models;


import play.db.ebean.Model;
import javax.persistence.Entity;
import javax.persistence.Id;
import play.data.validation.Constraints.Required;


@Entity
public class Sprint extends Model {

    @Required
    @Id
    public Long id;

    @Required
    public String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }




}


