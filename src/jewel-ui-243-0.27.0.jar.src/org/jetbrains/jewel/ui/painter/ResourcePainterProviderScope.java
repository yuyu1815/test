package org.jetbrains.jewel.ui.painter;

import java.util.Set;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\030\002\n\000\n\002\020\"\n\002\030\002\n\002\b\003\bf\030\0002\0020\001R\030\020\002\032\b\022\004\022\0020\0040\003X¦\004¢\006\006\032\004\b\005\020\006¨\006\007"}, d2 = {"Lorg/jetbrains/jewel/ui/painter/ResourcePainterProviderScope;", "Lorg/jetbrains/jewel/ui/painter/PainterProviderScope;", "classLoaders", "", "Ljava/lang/ClassLoader;", "getClassLoaders", "()Ljava/util/Set;", "ui"})
public interface ResourcePainterProviderScope extends PainterProviderScope {
  @NotNull
  Set<ClassLoader> getClassLoaders();
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ui-243-0.27.0.jar!\org\jetbrains\jewe\\ui\painter\ResourcePainterProviderScope.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */