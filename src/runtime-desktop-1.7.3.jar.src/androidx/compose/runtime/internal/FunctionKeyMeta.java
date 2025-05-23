package androidx.compose.runtime.internal;

import androidx.compose.runtime.ComposeCompilerApi;
import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.Metadata;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.AnnotationTarget;
import kotlin.annotation.Repeatable;
import kotlin.annotation.Retention;
import kotlin.annotation.Target;
import kotlin.jvm.internal.RepeatableContainer;

@ComposeCompilerApi
@Target(allowedTargets = {AnnotationTarget.CLASS})
@Retention(AnnotationRetention.RUNTIME)
@Repeatable
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
@Repeatable(FunctionKeyMeta.Container.class)
@Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\022\n\002\030\002\n\002\020\033\n\000\n\002\020\b\n\002\b\004\b\002\030\0002\0020\001B\030\022\006\020\002\032\0020\003\022\006\020\004\032\0020\003\022\006\020\005\032\0020\003R\017\020\005\032\0020\003¢\006\006\032\004\b\005\020\006R\017\020\002\032\0020\003¢\006\006\032\004\b\002\020\006R\017\020\004\032\0020\003¢\006\006\032\004\b\004\020\006¨\006\007"}, d2 = {"Landroidx/compose/runtime/internal/FunctionKeyMeta;", "", "key", "", "startOffset", "endOffset", "()I", "runtime"})
public @interface FunctionKeyMeta {
  int key();
  
  int startOffset();
  
  int endOffset();
  
  @Target(allowedTargets = {AnnotationTarget.CLASS})
  @Retention(AnnotationRetention.RUNTIME)
  @RepeatableContainer
  @Retention(RetentionPolicy.RUNTIME)
  @Target({ElementType.TYPE})
  @Metadata(mv = {1, 9, 0}, k = 3, xi = 48)
  public static @interface Container {
    FunctionKeyMeta[] value();
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\runtime-desktop-1.7.3.jar!\androidx\compose\runtime\internal\FunctionKeyMeta.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */