package org.jetbrains.jewel.ui.component;

import androidx.compose.runtime.Composer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

@Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000\032\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\002\020\002\n\002\030\002\n\002\b\003\bb\030\0002\0020\001R\035\020\002\032\r\022\004\022\0020\0040\003¢\006\002\b\005X¦\004¢\006\006\032\004\b\006\020\007¨\006\b"}, d2 = {"Lorg/jetbrains/jewel/ui/component/MenuItem;", "", "content", "Lkotlin/Function0;", "", "Landroidx/compose/runtime/Composable;", "getContent", "()Lkotlin/jvm/functions/Function2;", "ui"})
interface MenuItem {
  @NotNull
  Function2<Composer, Integer, Unit> getContent();
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ui-243-0.27.0.jar!\org\jetbrains\jewe\\ui\component\MenuItem.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */