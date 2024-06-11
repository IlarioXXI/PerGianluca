package com.nttdata.ordini.server.models;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.nttdata.ordini.server.models.ModelOrdine;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ModelOrdiniList
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-05-30T22:29:46.811185500+02:00[Europe/Paris]")


public class ModelOrdiniList   {
  @JsonProperty("listaOrdini")
  @Valid
  private List<ModelOrdine> listaOrdini = null;

  public ModelOrdiniList listaOrdini(List<ModelOrdine> listaOrdini) {
    this.listaOrdini = listaOrdini;
    return this;
  }

  public ModelOrdiniList addListaOrdiniItem(ModelOrdine listaOrdiniItem) {
    if (this.listaOrdini == null) {
      this.listaOrdini = new ArrayList<>();
    }
    this.listaOrdini.add(listaOrdiniItem);
    return this;
  }

  /**
   * Get listaOrdini
   * @return listaOrdini
   **/
  @Schema(description = "")
      @Valid
    public List<ModelOrdine> getListaOrdini() {
    return listaOrdini;
  }

  public void setListaOrdini(List<ModelOrdine> listaOrdini) {
    this.listaOrdini = listaOrdini;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelOrdiniList modelOrdiniList = (ModelOrdiniList) o;
    return Objects.equals(this.listaOrdini, modelOrdiniList.listaOrdini);
  }

  @Override
  public int hashCode() {
    return Objects.hash(listaOrdini);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelOrdiniList {\n");
    
    sb.append("    listaOrdini: ").append(toIndentedString(listaOrdini)).append("\n");
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
