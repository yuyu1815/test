package androidx.compose.runtime;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\036\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\002\030\002\n\002\b\003\n\002\020\013\n\002\b\003\ba\030\0002\0020\001R\026\020\002\032\0060\003j\002`\004X¦\004¢\006\006\032\004\b\005\020\006R\022\020\007\032\0020\bX¦\004¢\006\006\032\004\b\t\020\nø\001\000\002\006\n\004\b!0\001¨\006\013À\006\001"}, d2 = {"Landroidx/compose/runtime/RecomposerErrorInfo;", "", "cause", "Ljava/lang/Exception;", "Lkotlin/Exception;", "getCause", "()Ljava/lang/Exception;", "recoverable", "", "getRecoverable", "()Z", "runtime"})
@InternalComposeApi
public interface RecomposerErrorInfo {
  @NotNull
  Exception getCause();
  
  boolean getRecoverable();
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\runtime-desktop-1.7.3.jar!\androidx\compose\runtime\RecomposerErrorInfo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */