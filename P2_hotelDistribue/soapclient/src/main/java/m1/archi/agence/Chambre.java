
package m1.archi.agence;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour chambre complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="chambre">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idHotel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="imageChambre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nombreLits" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="numero" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="prix" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "chambre", propOrder = {
    "idHotel",
    "imageChambre",
    "nombreLits",
    "numero",
    "prix"
})
public class Chambre {

    protected String idHotel;
    protected String imageChambre;
    protected int nombreLits;
    protected int numero;
    protected double prix;

    /**
     * Obtient la valeur de la propri�t� idHotel.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdHotel() {
        return idHotel;
    }

    /**
     * D�finit la valeur de la propri�t� idHotel.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdHotel(String value) {
        this.idHotel = value;
    }

    /**
     * Obtient la valeur de la propri�t� imageChambre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImageChambre() {
        return imageChambre;
    }

    /**
     * D�finit la valeur de la propri�t� imageChambre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImageChambre(String value) {
        this.imageChambre = value;
    }

    /**
     * Obtient la valeur de la propri�t� nombreLits.
     * 
     */
    public int getNombreLits() {
        return nombreLits;
    }

    /**
     * D�finit la valeur de la propri�t� nombreLits.
     * 
     */
    public void setNombreLits(int value) {
        this.nombreLits = value;
    }

    /**
     * Obtient la valeur de la propri�t� numero.
     * 
     */
    public int getNumero() {
        return numero;
    }

    /**
     * D�finit la valeur de la propri�t� numero.
     * 
     */
    public void setNumero(int value) {
        this.numero = value;
    }

    /**
     * Obtient la valeur de la propri�t� prix.
     * 
     */
    public double getPrix() {
        return prix;
    }

    /**
     * D�finit la valeur de la propri�t� prix.
     * 
     */
    public void setPrix(double value) {
        this.prix = value;
    }

}
