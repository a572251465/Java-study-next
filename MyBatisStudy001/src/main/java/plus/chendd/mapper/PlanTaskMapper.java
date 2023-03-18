package plus.chendd.mapper;

import plus.chendd.pojo.PlanTask;

import java.util.List;

public interface PlanTaskMapper {
  List<PlanTask> findAll(String projectId);
}
