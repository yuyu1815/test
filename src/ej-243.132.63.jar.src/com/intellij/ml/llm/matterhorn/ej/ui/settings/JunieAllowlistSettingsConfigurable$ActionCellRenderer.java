/*     */ package com.intellij.ml.llm.matterhorn.ej.ui.settings;
/*     */ 
/*     */ import androidx.compose.runtime.internal.StabilityInferred;
/*     */ import com.intellij.lang.Language;
/*     */ import com.intellij.ui.LanguageTextField;
/*     */ import java.awt.Component;
/*     */ import javax.swing.JTable;
/*     */ import javax.swing.table.TableCellRenderer;
/*     */ import kotlin.Lazy;
/*     */ import kotlin.LazyKt;
/*     */ import kotlin.Metadata;
/*     */ import org.intellij.lang.regexp.RegExpLanguage;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\0006\n\002\030\002\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\005\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\000\n\000\n\002\020\013\n\002\b\002\n\002\020\b\n\002\b\002\b\007\030\0002\0020\001B\007¢\006\004\b\002\020\003J>\020\n\032\004\030\0010\0132\b\020\f\032\004\030\0010\r2\b\020\016\032\004\030\0010\0172\006\020\020\032\0020\0212\006\020\022\032\0020\0212\006\020\023\032\0020\0242\006\020\025\032\0020\024H\026R\033\020\004\032\0020\0058BX\002¢\006\f\n\004\b\b\020\t\032\004\b\006\020\007¨\006\026"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/ui/settings/JunieAllowlistSettingsConfigurable$ActionCellRenderer;", "Ljavax/swing/table/TableCellRenderer;", "<init>", "()V", "field", "Lcom/intellij/ui/LanguageTextField;", "getField", "()Lcom/intellij/ui/LanguageTextField;", "field$delegate", "Lkotlin/Lazy;", "getTableCellRendererComponent", "Ljava/awt/Component;", "table", "Ljavax/swing/JTable;", "value", "", "isSelected", "", "hasFocus", "row", "", "column", "ej-ui"})
/*     */ @StabilityInferred(parameters = 0)
/*     */ public final class ActionCellRenderer
/*     */   implements TableCellRenderer
/*     */ {
/*     */   public static final int $stable = 8;
/*     */   @NotNull
/* 140 */   private final Lazy field$delegate = LazyKt.lazy(ActionCellRenderer::field_delegate$lambda$0); private final LanguageTextField getField() { Lazy lazy = this.field$delegate; return (LanguageTextField)lazy.getValue(); } private static final LanguageTextField field_delegate$lambda$0() {
/* 141 */     return new LanguageTextField((Language)RegExpLanguage.INSTANCE, null, "");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public Component getTableCellRendererComponent(@Nullable JTable table, @Nullable Object value, boolean isSelected, boolean hasFocus, int row, int column) {
/* 151 */     if (((value instanceof String) ? value : null) == null) (value instanceof String) ? value : null;  ((value instanceof String) ? value : null).setText("");
/* 152 */     return (Component)getField();
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\settings\JunieAllowlistSettingsConfigurable$ActionCellRenderer.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */