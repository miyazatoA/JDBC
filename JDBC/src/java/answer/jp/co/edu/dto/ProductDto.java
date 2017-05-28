package answer.jp.co.edu.dto;

import java.math.BigDecimal;

public class ProductDto {

  private Long id;
  private Long categoryId;
  private String name;
  private BigDecimal weight;
  private String categoryName;

  public ProductDto() {
  }

  public ProductDto(Long id, Long categoryId, String name, BigDecimal weight) {
    this.id = id;
    this.categoryId = categoryId;
    this.name = name;
    this.weight = weight;
  }

  public ProductDto(Long id, Long categoryId, String name, BigDecimal weight, String categoryName) {
    this(id, categoryId, name, weight);
    this.categoryName = categoryName;
  }

  public Long getId() {
    return this.id;
  }

  public BigDecimal getWeight() {
    return this.weight;
  }

  public void setWeight(BigDecimal weight) {
    this.weight = weight;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Long getCategoryId() {
    return this.categoryId;
  }

  public void setCategoryId(Long categoryId) {
    this.categoryId = categoryId;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getCategoryName() {
    return this.categoryName;
  }

  public void setCategoryName(String categoryName) {
    this.categoryName = categoryName;
  }
}
