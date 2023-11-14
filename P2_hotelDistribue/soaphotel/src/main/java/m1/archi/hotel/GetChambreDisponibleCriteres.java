
package m1.archi.hotel;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java pour getChambreDisponibleCriteres complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="getChambreDisponibleCriteres">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="arg0" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="arg1" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="arg2" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="arg3" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="arg4" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="arg5" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="arg6" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getChambreDisponibleCriteres", propOrder = {
    "arg0",
    "arg1",
    "arg2",
    "arg3",
    "arg4",
    "arg5",
    "arg6"
})
public class GetChambreDisponibleCriteres {

    protected String arg0;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar arg1;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar arg2;
    protected int arg3;
    protected int arg4;
    protected int arg5;
    protected int arg6;

    /**
     * Obtient la valeur de la propri�t� arg0.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArg0() {
        return arg0;
    }

    /**
     * D�finit la valeur de la propri�t� arg0.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArg0(String value) {
        this.arg0 = value;
    }

    /**
     * Obtient la valeur de la propri�t� arg1.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getArg1() {
        return arg1;
    }

    /**
     * D�finit la valeur de la propri�t� arg1.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setArg1(XMLGregorianCalendar value) {
        this.arg1 = value;
    }

    /**
     * Obtient la valeur de la propri�t� arg2.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getArg2() {
        return arg2;
    }

    /**
     * D�finit la valeur de la propri�t� arg2.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setArg2(XMLGregorianCalendar value) {
        this.arg2 = value;
    }

    /**
     * Obtient la valeur de la propri�t� arg3.
     * 
     */
    public int getArg3() {
        return arg3;
    }

    /**
     * D�finit la valeur de la propri�t� arg3.
     * 
     */
    public void setArg3(int value) {
        this.arg3 = value;
    }

    /**
     * Obtient la valeur de la propri�t� arg4.
     * 
     */
    public int getArg4() {
        return arg4;
    }

    /**
     * D�finit la valeur de la propri�t� arg4.
     * 
     */
    public void setArg4(int value) {
        this.arg4 = value;
    }

    /**
     * Obtient la valeur de la propri�t� arg5.
     * 
     */
    public int getArg5() {
        return arg5;
    }

    /**
     * D�finit la valeur de la propri�t� arg5.
     * 
     */
    public void setArg5(int value) {
        this.arg5 = value;
    }

    /**
     * Obtient la valeur de la propri�t� arg6.
     * 
     */
    public int getArg6() {
        return arg6;
    }

    /**
     * D�finit la valeur de la propri�t� arg6.
     * 
     */
    public void setArg6(int value) {
        this.arg6 = value;
    }

}
