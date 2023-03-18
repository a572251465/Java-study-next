package plus.chendd.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class PlanTask implements Serializable {
  private String projectId;
  private String planContent;
  private String id;
}
