package com.nttdata.ordini.server.models;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.nttdata.ordini.server.models.ModelPiatto;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ModelOrdineBase
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-05-30T22:29:46.811185500+02:00[Europe/Paris]")


public class ModelOrdineBase   {
  @JsonProperty("listaPiatti")
  @Valid
  private List<ModelPiatto> listaPiatti = null;

  public ModelOrdineBase listaPiatti(List<ModelPiatto> listaPiatti) {
    this.listaPiatti = listaPiatti;
    return this;
  }

  public ModelOrdineBase addListaPiattiItem(ModelPiatto listaPiattiItem) {
    if (this.listaPiatti == null) {
      this.listaPiatti = new ArrayList<>();
    }
    this.listaPiatti.add(listaPiattiItem);
    return this;
  }

  /**
   * Get listaPiatti
   * @return listaPiatti
   **/
  @Schema(description = "")
      @Valid
    public List<ModelPiatto> getListaPiatti() {
    return listaPiatti;
  }

  public void setListaPiatti(List<ModelPiatto> listaPiatti) {
    this.listaPiatti = listaPiatti;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelOrdineBase modelOrdineBase = (ModelOrdineBase) o;
    return Objects.equals(this.listaPiatti, modelOrdineBase.listaPiatti);
  }

  @Override
  public int hashCode() {
    return Objects.hash(listaPiatti);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelOrdineBase {\n");
    
    sb.append("    listaPiatti: ").append(toIndentedString(listaPiatti)).append("\n");
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
