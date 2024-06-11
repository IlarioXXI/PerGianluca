package com.nttdata.ordini.server.models;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ModelPiatto
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-05-30T22:29:46.811185500+02:00[Europe/Paris]")


public class ModelPiatto   {
  @JsonProperty("nome")
  private String nome = null;

  @JsonProperty("costo")
  private Double costo = null;

  public ModelPiatto nome(String nome) {
    this.nome = nome;
    return this;
  }

  /**
   * Get nome
   * @return nome
   **/
  @Schema(description = "")
  
    public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public ModelPiatto costo(Double costo) {
    this.costo = costo;
    return this;
  }

  /**
   * Get costo
   * @return costo
   **/
  @Schema(description = "")
  
    public Double getCosto() {
    return costo;
  }

  public void setCosto(Double costo) {
    this.costo = costo;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelPiatto modelPiatto = (ModelPiatto) o;
    return Objects.equals(this.nome, modelPiatto.nome) &&
        Objects.equals(this.costo, modelPiatto.costo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nome, costo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelPiatto {\n");
    
    sb.append("    nome: ").append(toIndentedString(nome)).append("\n");
    sb.append("    costo: ").append(toIndentedString(costo)).append("\n");
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
