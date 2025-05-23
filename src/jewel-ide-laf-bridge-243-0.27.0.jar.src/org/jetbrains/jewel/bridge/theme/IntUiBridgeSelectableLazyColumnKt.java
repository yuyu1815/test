/*    */ package org.jetbrains.jewel.bridge.theme;
/*    */ import com.intellij.util.ui.JBUI;
/*    */ import org.jetbrains.jewel.ui.component.styling.SelectableLazyColumnStyle;
/*    */ 
/*    */ @Metadata(mv = {2, 0, 0}, k = 2, xi = 48, d1 = {"\000\b\n\000\n\002\030\002\n\000\032\b\020\000\032\0020\001H\000¨\006\002"}, d2 = {"readSelectableLazyColumnStyle", "Lorg/jetbrains/jewel/ui/component/styling/SelectableLazyColumnStyle;", "ide-laf-bridge"})
/*    */ public final class IntUiBridgeSelectableLazyColumnKt {
/*    */   @NotNull
/*    */   public static final SelectableLazyColumnStyle readSelectableLazyColumnStyle() {
/*  9 */     Intrinsics.checkNotNullExpressionValue(JBUI.CurrentTheme.ComboBox.minimumSize(), "minimumSize(...)"); return new SelectableLazyColumnStyle(DpSize.getHeight-D9Ej5fM(BridgeUtilsKt.toDpSize(JBUI.CurrentTheme.ComboBox.minimumSize())), 
/* 10 */         IntUiBridgeSimpleListItemKt.readSimpleListItemStyle(), null);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ide-laf-bridge-243-0.27.0.jar!\org\jetbrains\jewel\bridge\theme\IntUiBridgeSelectableLazyColumnKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */