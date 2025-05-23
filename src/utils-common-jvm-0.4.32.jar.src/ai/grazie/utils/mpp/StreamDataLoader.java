package ai.grazie.utils.mpp;

import java.io.InputStream;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\bf\030\0002\0020\001J\020\020\002\032\0020\0032\006\020\004\032\0020\005H&ø\001\000\002\006\n\004\b!0\001¨\006\006À\006\001"}, d2 = {"Lai/grazie/utils/mpp/StreamDataLoader;", "Lai/grazie/utils/mpp/DataLoader;", "stream", "Ljava/io/InputStream;", "path", "Lai/grazie/utils/mpp/DataLoader$Path;", "utils-common"})
public interface StreamDataLoader extends DataLoader {
  @NotNull
  InputStream stream(@NotNull DataLoader.Path paramPath);
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\utils-common-jvm-0.4.32.jar!\ai\grazi\\utils\mpp\StreamDataLoader.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */