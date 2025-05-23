package ai.grazie.model.ab;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\020\000\n\000\n\002\020\b\n\000\n\002\020\016\n\002\b\003\bf\030\000 \0072\0020\001:\001\007J\020\020\002\032\0020\0032\006\020\004\032\0020\005H&J\020\020\006\032\0020\0032\006\020\004\032\0020\005H&ø\001\000\002\006\n\004\b!0\001¨\006\bÀ\006\001"}, d2 = {"Lai/grazie/model/ab/ABExperimentHashGenerator;", "", "bucketId", "", "analyticsId", "", "hashId", "Companion", "model-ab-testing"})
public interface ABExperimentHashGenerator {
  @NotNull
  public static final Companion Companion = Companion.$$INSTANCE;
  
  public static final int BUCKETS_COUNT = 256;
  
  int hashId(@NotNull String paramString);
  
  int bucketId(@NotNull String paramString);
  
  @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\022\n\002\030\002\n\002\020\000\n\002\b\002\n\002\020\b\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002R\016\020\003\032\0020\004XT¢\006\002\n\000¨\006\005"}, d2 = {"Lai/grazie/model/ab/ABExperimentHashGenerator$Companion;", "", "()V", "BUCKETS_COUNT", "", "model-ab-testing"})
  public static final class Companion {
    public static final int BUCKETS_COUNT = 256;
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-ab-testing-jvm-0.4.32.jar!\ai\grazie\model\ab\ABExperimentHashGenerator.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */