package ru.vw.practice.lesson.dto;

import java.time.OffsetDateTime;
import java.util.List;

public class ErrorDetailedResponse {
  private String errorMessage;
  private String errorCode;
  private OffsetDateTime errorDate;
  private List<ValidationFlagsDto> validationFlags;

  public ErrorDetailedResponse() {
  }
  public ErrorDetailedResponse(String errorMessage, String errorCode, OffsetDateTime errorDate, List<ValidationFlagsDto> validationFlags) {
    this.errorMessage = errorMessage;
    this.errorCode = errorCode;
    this.errorDate = errorDate;
    this.validationFlags = validationFlags;
  }

  public String getErrorMessage() {
    return errorMessage;
  }

  public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
  }

  public String getErrorCode() {
    return errorCode;
  }

  public void setErrorCode(String errorCode) {
    this.errorCode = errorCode;
  }

  public OffsetDateTime getErrorDate() {
    return errorDate;
  }

  public void setErrorDate(OffsetDateTime errorDate) {
    this.errorDate = errorDate;
  }

  public List<ValidationFlagsDto> getValidationFlags() {
    return validationFlags;
  }

  public void setValidationFlags(List<ValidationFlagsDto> validationFlags) {
    this.validationFlags = validationFlags;
  }
}
