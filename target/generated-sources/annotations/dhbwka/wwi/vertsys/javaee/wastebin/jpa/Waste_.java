package dhbwka.wwi.vertsys.javaee.wastebin.jpa;

import dhbwka.wwi.vertsys.javaee.wastebin.jpa.WasteType;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-02-22T11:24:15")
@StaticMetamodel(Waste.class)
public class Waste_ { 

    public static volatile SingularAttribute<Waste, String> name;
    public static volatile SingularAttribute<Waste, Long> id;
    public static volatile SingularAttribute<Waste, WasteType> type;
    public static volatile SingularAttribute<Waste, String> content;

}