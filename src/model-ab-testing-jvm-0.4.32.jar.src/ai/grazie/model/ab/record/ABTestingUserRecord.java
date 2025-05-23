package ai.grazie.model.ab.record;

import ai.grazie.utils.mpp.UUID;
import ai.grazie.utils.mpp.time.Duration;
import ai.grazie.utils.mpp.time.Timestamp;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000:\n\002\030\002\n\002\020\000\n\000\n\002\020\b\n\002\b\003\n\002\030\002\n\002\b\003\n\002\020\016\n\002\b\007\n\002\020\013\n\002\b\005\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\004\bf\030\0002\0020\001J\b\020 \032\0020\013H&R\022\020\002\032\0020\003X¦\004¢\006\006\032\004\b\004\020\005R\022\020\006\032\0020\007X¦\004¢\006\006\032\004\b\b\020\tR\022\020\n\032\0020\013X¦\004¢\006\006\032\004\b\f\020\rR\022\020\016\032\0020\003X¦\004¢\006\006\032\004\b\017\020\005R\022\020\020\032\0020\003X¦\004¢\006\006\032\004\b\021\020\005R\022\020\022\032\0020\023X¦\004¢\006\006\032\004\b\024\020\025R\022\020\026\032\0020\003X¦\004¢\006\006\032\004\b\027\020\005R\022\020\030\032\0020\031X¦\004¢\006\006\032\004\b\032\020\033R\022\020\034\032\0020\035X¦\004¢\006\006\032\004\b\036\020\037ø\001\000\002\006\n\004\b!0\001¨\006!À\006\001"}, d2 = {"Lai/grazie/model/ab/record/ABTestingUserRecord;", "", "bucket_id", "", "getBucket_id", "()I", "execution_duration", "Lai/grazie/utils/mpp/time/Duration;", "getExecution_duration", "()Lai/grazie/utils/mpp/time/Duration;", "experiment_id", "", "getExperiment_id", "()Ljava/lang/String;", "group_id", "getGroup_id", "hash_id", "getHash_id", "opt_out", "", "getOpt_out", "()Z", "status", "getStatus", "timestamp", "Lai/grazie/utils/mpp/time/Timestamp;", "getTimestamp", "()Lai/grazie/utils/mpp/time/Timestamp;", "userId", "Lai/grazie/utils/mpp/UUID;", "getUserId", "()Lai/grazie/utils/mpp/UUID;", "serialize", "model-ab-testing"})
public interface ABTestingUserRecord {
  @NotNull
  Timestamp getTimestamp();
  
  @NotNull
  UUID getUserId();
  
  @NotNull
  String getExperiment_id();
  
  int getBucket_id();
  
  int getGroup_id();
  
  int getHash_id();
  
  boolean getOpt_out();
  
  int getStatus();
  
  @NotNull
  Duration getExecution_duration();
  
  @NotNull
  String serialize();
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-ab-testing-jvm-0.4.32.jar!\ai\grazie\model\ab\record\ABTestingUserRecord.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */