package ru.vw.practice.lesson.dto;

public class ValidationFlagsDto {

  /** Наименование поля в json */
  private String fieldName;

  /** Сообщение об ошибке */
  private String hintText;

  public ValidationFlagsDto() {
  }
  public ValidationFlagsDto(String fieldName, String hintText) {
    this.fieldName = fieldName;
    this.hintText = hintText;
  }

  public String getFieldName() {
    return fieldName;
  }

  public String getHintText() {
    return hintText;
  }
}
