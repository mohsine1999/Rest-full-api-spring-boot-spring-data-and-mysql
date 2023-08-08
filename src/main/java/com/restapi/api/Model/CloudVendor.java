package com.restapi.api.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
//add Lambok dependency in the pom.xml
@Data
@AllArgsConstructor
@NoArgsConstructor
//____________________________________ now no need to add the getters, setters even constructors
@Table(name = "cloud_vendor")
public class CloudVendor {

    @Id
    private String vendorId;

    @Column(name = "vendor_name")
    private String vendorName;
    
    @Column( name = "vendor_adress")
    private String vendorAdress;

    @Column(name  = "vendor_phone_number")
    private String vendorPhoneNumber;


   


    



 
    public void setVendorPhoneNumber(String vendorPhoneNumber) {
        this.vendorPhoneNumber = vendorPhoneNumber;
    }

}
