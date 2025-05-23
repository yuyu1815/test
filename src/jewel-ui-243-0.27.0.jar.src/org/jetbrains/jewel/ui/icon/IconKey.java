package org.jetbrains.jewel.ui.icon;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000\036\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\002\b\003\n\002\020\016\n\000\n\002\020\013\n\000\bf\030\0002\0020\001J\020\020\006\032\0020\0072\006\020\b\032\0020\tH&R\026\020\002\032\006\022\002\b\0030\003X¦\004¢\006\006\032\004\b\004\020\005¨\006\n"}, d2 = {"Lorg/jetbrains/jewel/ui/icon/IconKey;", "", "iconClass", "Ljava/lang/Class;", "getIconClass", "()Ljava/lang/Class;", "path", "", "isNewUi", "", "ui"})
public interface IconKey {
  @NotNull
  Class<?> getIconClass();
  
  @NotNull
  String path(boolean paramBoolean);
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ui-243-0.27.0.jar!\org\jetbrains\jewe\\ui\icon\IconKey.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */