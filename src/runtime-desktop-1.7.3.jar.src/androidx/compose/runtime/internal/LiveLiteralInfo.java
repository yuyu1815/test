package androidx.compose.runtime.internal;

import androidx.compose.runtime.ComposeCompilerApi;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.Metadata;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.AnnotationTarget;
import kotlin.annotation.Retention;
import kotlin.annotation.Target;

@ComposeCompilerApi
@Target(allowedTargets = {AnnotationTarget.FUNCTION})
@Retention(AnnotationRetention.RUNTIME)
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD})
@Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\020\033\n\000\n\002\020\016\n\000\n\002\020\b\n\002\b\003\b\002\030\0002\0020\001B\020\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005R\017\020\002\032\0020\003¢\006\006\032\004\b\002\020\006R\017\020\004\032\0020\005¢\006\006\032\004\b\004\020\007¨\006\b"}, d2 = {"Landroidx/compose/runtime/internal/LiveLiteralInfo;", "", "key", "", "offset", "", "()Ljava/lang/String;", "()I", "runtime"})
public @interface LiveLiteralInfo {
  String key();
  
  int offset();
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\runtime-desktop-1.7.3.jar!\androidx\compose\runtime\internal\LiveLiteralInfo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */