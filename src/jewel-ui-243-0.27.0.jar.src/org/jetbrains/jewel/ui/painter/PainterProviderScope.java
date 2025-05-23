package org.jetbrains.jewel.ui.painter;

import androidx.compose.ui.unit.Density;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000\036\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\002\b\005\n\002\020 \n\002\030\002\n\002\b\003\bf\030\0002\0020\001R\022\020\002\032\0020\003X¦\004¢\006\006\032\004\b\004\020\005R\022\020\006\032\0020\003X¦\004¢\006\006\032\004\b\007\020\005R\030\020\b\032\b\022\004\022\0020\n0\tX¦\004¢\006\006\032\004\b\013\020\f¨\006\r"}, d2 = {"Lorg/jetbrains/jewel/ui/painter/PainterProviderScope;", "Landroidx/compose/ui/unit/Density;", "rawPath", "", "getRawPath", "()Ljava/lang/String;", "path", "getPath", "acceptedHints", "", "Lorg/jetbrains/jewel/ui/painter/PainterHint;", "getAcceptedHints", "()Ljava/util/List;", "ui"})
public interface PainterProviderScope extends Density {
  @NotNull
  String getRawPath();
  
  @NotNull
  String getPath();
  
  @NotNull
  List<PainterHint> getAcceptedHints();
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ui-243-0.27.0.jar!\org\jetbrains\jewe\\ui\painter\PainterProviderScope.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */