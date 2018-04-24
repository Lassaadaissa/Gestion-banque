package org.isd.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("CE")

public class CompteEP extends Compte{
private double taux;
}