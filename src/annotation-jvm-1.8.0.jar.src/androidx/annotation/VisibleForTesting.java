package androidx.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import kotlin.Metadata;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.MustBeDocumented;
import kotlin.annotation.Retention;
import org.jetbrains.annotations.NotNull;

@MustBeDocumented
@Retention(AnnotationRetention.BINARY)
@Documented
@Retention(RetentionPolicy.CLASS)
@Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\022\n\002\030\002\n\002\020\033\n\000\n\002\020\b\n\002\b\003\b\002\030\000 \0052\0020\001:\001\005B\n\022\b\b\002\020\002\032\0020\003R\017\020\002\032\0020\003¢\006\006\032\004\b\002\020\004¨\006\006"}, d2 = {"Landroidx/annotation/VisibleForTesting;", "", "otherwise", "", "()I", "Companion", "annotation"})
public @interface VisibleForTesting {
  @NotNull
  public static final Companion Companion = Companion.$$INSTANCE;
  
  public static final int PRIVATE = 2;
  
  public static final int PACKAGE_PRIVATE = 3;
  
  public static final int PROTECTED = 4;
  
  public static final int NONE = 5;
  
  int otherwise() default 2;
  
  @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\020\000\n\002\b\002\n\002\020\b\n\002\b\004\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002R\016\020\003\032\0020\004XT¢\006\002\n\000R\016\020\005\032\0020\004XT¢\006\002\n\000R\016\020\006\032\0020\004XT¢\006\002\n\000R\016\020\007\032\0020\004XT¢\006\002\n\000¨\006\b"}, d2 = {"Landroidx/annotation/VisibleForTesting$Companion;", "", "()V", "NONE", "", "PACKAGE_PRIVATE", "PRIVATE", "PROTECTED", "annotation"})
  public static final class Companion {
    public static final int PRIVATE = 2;
    
    public static final int PACKAGE_PRIVATE = 3;
    
    public static final int PROTECTED = 4;
    
    public static final int NONE = 5;
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\annotation-jvm-1.8.0.jar!\androidx\annotation\VisibleForTesting.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */