package org.jetbrains.jewel.ui.component;

import androidx.compose.runtime.Composer;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.jewel.ui.icon.IconKey;

@Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000B\n\002\030\002\n\002\020\000\n\000\n\002\020\002\n\000\n\002\020\013\n\000\n\002\030\002\n\000\n\002\020\"\n\002\020\016\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\030\002\n\002\b\004\bf\030\0002\0020\001J^\020\002\032\0020\0032\006\020\004\032\0020\0052\n\b\002\020\006\032\004\030\0010\0072\020\b\002\020\b\032\n\022\004\022\0020\n\030\0010\t2\f\020\013\032\b\022\004\022\0020\0030\f2\b\b\002\020\r\032\0020\0052\021\020\016\032\r\022\004\022\0020\0030\f¢\006\002\b\017H&¢\006\002\020\020JO\020\021\032\0020\0032\b\b\002\020\r\032\0020\0052\n\b\002\020\006\032\004\030\0010\0072\027\020\021\032\023\022\004\022\0020\000\022\004\022\0020\0030\022¢\006\002\b\0232\021\020\016\032\r\022\004\022\0020\0030\f¢\006\002\b\017H&¢\006\002\020\024J \020\025\032\0020\0032\021\020\016\032\r\022\004\022\0020\0030\f¢\006\002\b\017H&¢\006\002\020\026¨\006\027"}, d2 = {"Lorg/jetbrains/jewel/ui/component/MenuScope;", "", "selectableItem", "", "selected", "", "iconKey", "Lorg/jetbrains/jewel/ui/icon/IconKey;", "keybinding", "", "", "onClick", "Lkotlin/Function0;", "enabled", "content", "Landroidx/compose/runtime/Composable;", "(ZLorg/jetbrains/jewel/ui/icon/IconKey;Ljava/util/Set;Lkotlin/jvm/functions/Function0;ZLkotlin/jvm/functions/Function2;)V", "submenu", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "(ZLorg/jetbrains/jewel/ui/icon/IconKey;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)V", "passiveItem", "(Lkotlin/jvm/functions/Function2;)V", "ui"})
public interface MenuScope {
  void selectableItem(boolean paramBoolean1, @Nullable IconKey paramIconKey, @Nullable Set<String> paramSet, @NotNull Function0<Unit> paramFunction0, boolean paramBoolean2, @NotNull Function2<? super Composer, ? super Integer, Unit> paramFunction2);
  
  void submenu(boolean paramBoolean, @Nullable IconKey paramIconKey, @NotNull Function1<? super MenuScope, Unit> paramFunction1, @NotNull Function2<? super Composer, ? super Integer, Unit> paramFunction2);
  
  void passiveItem(@NotNull Function2<? super Composer, ? super Integer, Unit> paramFunction2);
  
  @Metadata(mv = {2, 0, 0}, k = 3, xi = 48)
  public static final class DefaultImpls {}
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ui-243-0.27.0.jar!\org\jetbrains\jewe\\ui\component\MenuScope.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */