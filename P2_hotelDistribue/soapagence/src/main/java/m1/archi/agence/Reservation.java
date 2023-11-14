
package m1.archi.agence;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java pour reservation complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="reservation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="chambresReservees" type="{http://service.archi.m1/}chambre" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="clientPrincipal" type="{http://service.archi.m1/}client" minOccurs="0"/>
 *         &lt;element name="dateArrivee" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="dateDepart" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="identifiantHotel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="montantReservation" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="nombreEtoilesHotel" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="nombrePersonnes" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="numero" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="petitDejeuner" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "reservation", propOrder = {
    "chambresReservees",
    "clientPrincipal",
    "dateArrivee",
    "dateDepart",
    "identifiantHotel",
    "montantReservation",
    "nombreEtoilesHotel",
    "nombrePersonnes",
    "numero",
    "petitDejeuner"
})
public class Reservation {

    @XmlElement(nillable = true)
    protected List<Chambre> chambresReservees;
    protected Client clientPrincipal;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateArrivee;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateDepart;
    protected String identifiantHotel;
    protected double montantReservation;
    protected int nombreEtoilesHotel;
    protected int nombrePersonnes;
    protected String numero;
    protected boolean petitDejeuner;

    /**
     * Gets the value of the chambresReservees property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the chambresReservees property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChambresReservees().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Chambre }
     * 
     * 
     */
    public List<Chambre> getChambresReservees() {
        if (chambresReservees == null) {
            chambresReservees = new ArrayList<Chambre>();
        }
        return this.chambresReservees;
    }

    /**
     * Obtient la valeur de la propri�t� clientPrincipal.
     * 
     * @return
     *     possible object is
     *     {@link Client }
     *     
     */
    public Client getClientPrincipal() {
        return clientPrincipal;
    }

    /**
     * D�finit la valeur de la propri�t� clientPrincipal.
     * 
     * @param value
     *     allowed object is
     *     {@link Client }
     *     
     */
    public void setClientPrincipal(Client value) {
        this.clientPrincipal = value;
    }

    /**
     * Obtient la valeur de la propri�t� dateArrivee.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateArrivee() {
        return dateArrivee;
    }

    /**
     * D�finit la valeur de la propri�t� dateArrivee.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateArrivee(XMLGregorianCalendar value) {
        this.dateArrivee = value;
    }

    /**
     * Obtient la valeur de la propri�t� dateDepart.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateDepart() {
        return dateDepart;
    }

    /**
     * D�finit la valeur de la propri�t� dateDepart.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateDepart(XMLGregorianCalendar value) {
        this.dateDepart = value;
    }

    /**
     * Obtient la valeur de la propri�t� identifiantHotel.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentifiantHotel() {
        return identifiantHotel;
    }

    /**
     * D�finit la valeur de la propri�t� identifiantHotel.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentifiantHotel(String value) {
        this.identifiantHotel = value;
    }

    /**
     * Obtient la valeur de la propri�t� montantReservation.
     * 
     */
    public double getMontantReservation() {
        return montantReservation;
    }

    /**
     * D�finit la valeur de la propri�t� montantReservation.
     * 
     */
    public void setMontantReservation(double value) {
        this.montantReservation = value;
    }

    /**
     * Obtient la valeur de la propri�t� nombreEtoilesHotel.
     * 
     */
    public int getNombreEtoilesHotel() {
        return nombreEtoilesHotel;
    }

    /**
     * D�finit la valeur de la propri�t� nombreEtoilesHotel.
     * 
     */
    public void setNombreEtoilesHotel(int value) {
        this.nombreEtoilesHotel = value;
    }

    /**
     * Obtient la valeur de la propri�t� nombrePersonnes.
     * 
     */
    public int getNombrePersonnes() {
        return nombrePersonnes;
    }

    /**
     * D�finit la valeur de la propri�t� nombrePersonnes.
     * 
     */
    public void setNombrePersonnes(int value) {
        this.nombrePersonnes = value;
    }

    /**
     * Obtient la valeur de la propri�t� numero.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumero() {
        return numero;
    }

    /**
     * D�finit la valeur de la propri�t� numero.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumero(String value) {
        this.numero = value;
    }

    /**
     * Obtient la valeur de la propri�t� petitDejeuner.
     * 
     */
    public boolean isPetitDejeuner() {
        return petitDejeuner;
    }

    /**
     * D�finit la valeur de la propri�t� petitDejeuner.
     * 
     */
    public void setPetitDejeuner(boolean value) {
        this.petitDejeuner = value;
    }

}
