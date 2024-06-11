package com.nttdata.ordini.server.models;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ModelOrdine
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-05-30T22:29:46.811185500+02:00[Europe/Paris]")


public class ModelOrdine   {
  @JsonProperty("id")
  private Integer id = null;

  @JsonProperty("descrizione")
  private String descrizione = null;

  @JsonProperty("totale")
  private Double totale = null;

  @JsonProperty("stato")
  private String stato = null;

  public ModelOrdine id(Integer id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   **/
  @Schema(description = "")
  
    public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public ModelOrdine descrizione(String descrizione) {
    this.descrizione = descrizione;
    return this;
  }

  /**
   * Get descrizione
   * @return descrizione
   **/
  @Schema(description = "")
  
    public String getDescrizione() {
    return descrizione;
  }

  public void setDescrizione(String descrizione) {
    this.descrizione = descrizione;
  }

  public ModelOrdine totale(Double totale) {
    this.totale = totale;
    return this;
  }

  /**
   * Get totale
   * @return totale
   **/
  @Schema(description = "")
  
    public Double getTotale() {
    return totale;
  }

  public void setTotale(Double totale) {
    this.totale = totale;
  }

  public ModelOrdine stato(String stato) {
    this.stato = stato;
    return this;
  }

  /**
   * Get stato
   * @return stato
   **/
  @Schema(description = "")
  
    public String getStato() {
    return stato;
  }

  public void setStato(String stato) {
    this.stato = stato;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelOrdine modelOrdine = (ModelOrdine) o;
    return Objects.equals(this.id, modelOrdine.id) &&
        Objects.equals(this.descrizione, modelOrdine.descrizione) &&
        Objects.equals(this.totale, modelOrdine.totale) &&
        Objects.equals(this.stato, modelOrdine.stato);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, descrizione, totale, stato);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelOrdine {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    descrizione: ").append(toIndentedString(descrizione)).append("\n");
    sb.append("    totale: ").append(toIndentedString(totale)).append("\n");
    sb.append("    stato: ").append(toIndentedString(stato)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
