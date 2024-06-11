package com.nttdata.ordini.server.models;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.nttdata.ordini.server.models.ModelOrdiniList;
import com.nttdata.ordini.server.models.ResponseBase;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ResponseOrdiniList
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-05-30T22:29:46.811185500+02:00[Europe/Paris]")


public class ResponseOrdiniList extends ResponseBase  {
  @JsonProperty("returnValue")
  private ModelOrdiniList returnValue = null;

  public ResponseOrdiniList returnValue(ModelOrdiniList returnValue) {
    this.returnValue = returnValue;
    return this;
  }

  /**
   * Get returnValue
   * @return returnValue
   **/
  @Schema(description = "")
  
    @Valid
    public ModelOrdiniList getReturnValue() {
    return returnValue;
  }

  public void setReturnValue(ModelOrdiniList returnValue) {
    this.returnValue = returnValue;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResponseOrdiniList responseOrdiniList = (ResponseOrdiniList) o;
    return Objects.equals(this.returnValue, responseOrdiniList.returnValue) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(returnValue, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponseOrdiniList {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    returnValue: ").append(toIndentedString(returnValue)).append("\n");
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
