package org.jetbrains.compose.resources;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\"\n\002\030\002\n\002\020\000\n\000\n\002\020\016\n\002\b\002\n\002\020\022\n\002\b\003\n\002\020\t\n\002\b\003\b`\030\0002\0020\001J\020\020\002\032\0020\0032\006\020\004\032\0020\003H&J\026\020\005\032\0020\0062\006\020\004\032\0020\003H¦@¢\006\002\020\007J&\020\b\032\0020\0062\006\020\004\032\0020\0032\006\020\t\032\0020\n2\006\020\013\032\0020\nH¦@¢\006\002\020\f¨\006\r"}, d2 = {"Lorg/jetbrains/compose/resources/ResourceReader;", "", "getUri", "", "path", "read", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "readPart", "offset", "", "size", "(Ljava/lang/String;JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "library"})
public interface ResourceReader {
  @Nullable
  Object read(@NotNull String paramString, @NotNull Continuation<? super byte[]> paramContinuation);
  
  @Nullable
  Object readPart(@NotNull String paramString, long paramLong1, long paramLong2, @NotNull Continuation<? super byte[]> paramContinuation);
  
  @NotNull
  String getUri(@NotNull String paramString);
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\library-desktop-1.7.3.jar!\org\jetbrains\compose\resources\ResourceReader.class
 * Java compiler version: 11 (55.0)
 * JD-Core Version:       1.1.3
 */