/*     */ package com.intellij.ml.llm.matterhorn.ej.ui.settings;
/*     */ 
/*     */ import androidx.compose.runtime.internal.StabilityInferred;
/*     */ import com.intellij.lang.Language;
/*     */ import com.intellij.ui.LanguageTextField;
/*     */ import java.awt.Component;
/*     */ import javax.swing.AbstractCellEditor;
/*     */ import javax.swing.JTable;
/*     */ import javax.swing.table.TableCellEditor;
/*     */ import kotlin.Lazy;
/*     */ import kotlin.LazyKt;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.internal.Intrinsics;
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
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000B\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\005\n\002\020\016\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\000\n\000\n\002\020\013\n\000\n\002\020\b\n\002\b\002\b\007\030\0002\0020\0012\0020\002B\007¢\006\004\b\003\020\004J\r\020\013\032\0070\f¢\006\002\b\rH\026J4\020\016\032\004\030\0010\0172\006\020\020\032\0020\0212\b\020\022\032\004\030\0010\0232\006\020\024\032\0020\0252\006\020\026\032\0020\0272\006\020\030\032\0020\027H\026R\033\020\005\032\0020\0068BX\002¢\006\f\n\004\b\t\020\n\032\004\b\007\020\b¨\006\031"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/ui/settings/JunieAllowlistSettingsConfigurable$ActionCellEditor;", "Ljavax/swing/AbstractCellEditor;", "Ljavax/swing/table/TableCellEditor;", "<init>", "()V", "field", "Lcom/intellij/ui/LanguageTextField;", "getField", "()Lcom/intellij/ui/LanguageTextField;", "field$delegate", "Lkotlin/Lazy;", "getCellEditorValue", "", "Lorg/jetbrains/annotations/NotNull;", "getTableCellEditorComponent", "Ljava/awt/Component;", "table", "Ljavax/swing/JTable;", "value", "", "isSelected", "", "row", "", "column", "ej-ui"})
/*     */ @StabilityInferred(parameters = 0)
/*     */ public final class ActionCellEditor
/*     */   extends AbstractCellEditor
/*     */   implements TableCellEditor
/*     */ {
/*     */   public static final int $stable = 8;
/*     */   @NotNull
/* 157 */   private final Lazy field$delegate = LazyKt.lazy(ActionCellEditor::field_delegate$lambda$0); private final LanguageTextField getField() { Lazy lazy = this.field$delegate; return (LanguageTextField)lazy.getValue(); }
/* 158 */   private static final LanguageTextField field_delegate$lambda$0() { return new LanguageTextField((Language)RegExpLanguage.INSTANCE, null, ""); } @NotNull
/*     */   public String getCellEditorValue() {
/* 160 */     Intrinsics.checkNotNullExpressionValue(getField().getText(), "getText(...)"); return getField().getText();
/*     */   } @Nullable
/*     */   public Component getTableCellEditorComponent(@NotNull JTable table, @Nullable Object value, boolean isSelected, int row, int column) {
/* 163 */     Intrinsics.checkNotNullParameter(table, "table"); if (((value instanceof String) ? value : null) == null) (value instanceof String) ? value : null;  ((value instanceof String) ? value : null).setText("");
/* 164 */     return (Component)getField();
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\settings\JunieAllowlistSettingsConfigurable$ActionCellEditor.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */