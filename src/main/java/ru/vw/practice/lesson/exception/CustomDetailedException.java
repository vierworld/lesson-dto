package ru.vw.practice.lesson.exception;


import ru.vw.practice.lesson.dto.ValidationFlagsDto;

import java.util.List;

public class CustomDetailedException extends CustomException {
  private List<ValidationFlagsDto> validationFlags;

  public CustomDetailedException(String message, ErrorCodes code, List<ValidationFlagsDto> validationFlags) {
    super(message, code);
    this.validationFlags = validationFlags;
  }

  public List<ValidationFlagsDto> getValidationFlags() {
    return validationFlags;
  }

  public void setValidationFlags(List<ValidationFlagsDto> validationFlags) {
    this.validationFlags = validationFlags;
  }
}
